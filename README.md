# bpmnFromXtextDSL

This repository is a small proof of concept to build a small Xtext DSL that references elements from BPMN2 models.
The idea is to reuse some elements of predefined BPMN2 models, in such a way that you are able to reference this elements from an Xtext DSL. I was inspired by the following posts by Tamas Miklossy, Christian Dietrich and David Pace:

* [How to reference UML elements from Xtext DSLs](https://blogs.itemis.com/en/how-to-reference-uml-elements-from-xtext-dsls)
* [Combining EMF models with Xtext DSLs](https://blogs.itemis.com/en/combining-emf-models-with-xtext-dsls?hsLang=en)
* [Xtext 2.0 and UML](https://dietrich-it.de/xtext/2011/07/17/xtext-2.0-and-uml/)
* [Library Bundles for your Xtext DSL](https://www.davidpace.de/library-bundles-for-your-xtext-dsl)

Finally, the process was not as easy as I expected, and without the help of Christian Dietrich in the [Eclipse Forums](https://www.eclipse.org/forums/index.php/m/1853751/#msg_1853751) I would not have obtained the expected result. Thus, this repository has as aim the documentation of the entire process in case is useful for someone else.

#### I. Preparation steps
1. Install the latest version of the `BPMN2 Modeler` and the `Xtext Complete SDK` from the Eclipse Release Train.
![Installation.jpg](./images/1-Installation.jpg)

2. Create the security.xtext.bmpn.simple project based on the [Xtext 15 Minutes Tutorial](https://www.eclipse.org/Xtext/documentation/102_domainmodelwalkthrough.html). The meta-model of the `security.xtext.bmpn.simple` project is

![bPSecDslMM.jpg](./images/bPSecDslMM.png)

and the Xtext grammmar is

```
Policy:
	'policy' name=ID
	'declarations:'
	(declarations+=Declaration)+
	;
Declaration:
	(processes+=Process)+
	'users'
	(users+=User)(',' users+=User)*
 ;

Process: 
	'process' name=ID  'mapsTo' refProcess=[bpmn2::Process] '{'
		(tasks+=Task)+  
	'}'
; 

Task:
	'task' name=ID "mapsTo" refTask=[bpmn2::Activity]
;
User:
	name=ID
;
````
Both describe a policy which contains a set of one or more declararions. One declaration contains one or more processes and one or more users. Furthermore, one process contains one or more tasks. One process is mapped to one Process of a BPMN2 model and one task is mapped to one Activity of a BPMN2 model. To be able to **use BPMN elements in our policy**, the following modifications are necessary:

#### II. Add a library bundle to be able to reference BPMN2 metamodel elements from anywhere.

3.  Create the project `org.eclipse.xtext.bpmn` (New Project Wizard in Eclipse and choose Plug-In Development -> Plug-In Project) inspired on [Library Bundles for your Xtext DSL](https://www.davidpace.de/library-bundles-for-your-xtext-dsl).

4. Add the plugins `org.eclipse.bpmn2` and `org.eclipse.text` to the `Require-Bundle` section in the [MANIFEST.MF](https://github.com/reinaqu/bpmnFromXtextDSL/blob/main/org.eclipse.xtext.bpmn/META-INF/MANIFEST.MF#L8-L9).

5. Create a `org.eclipse.xtext.bpmn` package and add the following classes to this package.
	* [BpmnPatchedSynchronizedXtextResourceSet.java](https://github.com/reinaqu/bpmnFromXtextDSL/blob/main/org.eclipse.xtext.bpmn/src/org/eclipse/xtext/bpmn/BpmnPatchedSynchronizedXtextResourceSet.java)
	* [BpmnQualifiedNameProvider.java](https://github.com/reinaqu/bpmnFromXtextDSL/blob/main/org.eclipse.xtext.bpmn/src/org/eclipse/xtext/bpmn/BpmnQualifiedNameProvider.java)
	* [BpmnRuntimeModule.java](https://github.com/reinaqu/bpmnFromXtextDSL/blob/main/org.eclipse.xtext.bpmn/src/org/eclipse/xtext/bpmn/BpmnRuntimeModule.java)

6.  Create the project `org.eclipse.xtext.bpmn.ui` (New Project Wizard in Eclipse and choose Plug-In Development -> Plug-In Project).

7.  Add the plugins `org.eclipse.xtext.bpmn` (plugin of the previous project), `org.eclipse.bpmn2`, `org.eclipse.text-ui` and `org.eclipse.text-ui` to the `Require-Bundle` section in the [MANIFEST.MF](https://github.com/reinaqu/bpmnFromXtextDSL/blob/main/org.eclipse.xtext.bpmn.ui/META-INF/MANIFEST.MF#L8-L11). 

8. Create a `org.eclipse.xtext.bpmn.ui` package and add the following classes to this package.
	* [Activator.java](https://github.com/reinaqu/bpmnFromXtextDSL/blob/main/org.eclipse.xtext.bpmn.ui/src/org/eclipse/xtext/bpmn/ui/Activator.java)
	* [BpmnUiModule.java](https://github.com/reinaqu/bpmnFromXtextDSL/blob/main/org.eclipse.xtext.bpmn.ui/src/org/eclipse/xtext/bpmn/ui/BpmnUiModule.java)
	* [ExecutableExtensionFactory.java](https://github.com/reinaqu/bpmnFromXtextDSL/blob/main/org.eclipse.xtext.bpmn.ui/src/org/eclipse/xtext/bpmn/ui/ExecutableExtensionFactory.java)
	
#### III. Modifications in the `security.xtext.bmpn.simple` project

9. Add the plugins `org.eclipse.bpmn2` and  `org.eclipse.xtext.bpmn` (the previous project) to the `Require-Bundle` section in the [MANIFEST.MF](https://github.com/reinaqu/bpmnFromXtextDSL/blob/main/security.xtext.bmpn.simple/META-INF/MANIFEST.MF#L12) file.

10. Add the `import` to the [BPSecDsl.xtext](https://github.com/reinaqu/bpmnFromXtextDSL/blob/main/security.xtext.bmpn.simple/src/security/xtext/bmpn/simple/BPSecDsl.xtext#L6) to be able to use the elements from the BPMN2 metamodel.

````
import 'http://www.omg.org/spec/BPMN/20100524/MODEL-XMI' as bpmn2
````

11. Add the following property to the `Standard Language` section in [GenerateBPSecDsl.mwe2](https://github.com/reinaqu/bpmnFromXtextDSL/blob/main/security.xtext.bmpn.simple/src/security/xtext/bmpn/simple/GenerateBPSecDsl.mwe2#L39) workflow file to be able to reference the BPMN20 metamodel.

````
referencedResource="platform:/resource/org.eclipse.bpmn2/model/BPMN20.genmodel"
````

12. Generate all the Xtext artifacts.
 


