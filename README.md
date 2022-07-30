# bpmnFromXtextDSL

This repository is a small proof of concept to build a small Xtext DSL that references elements from BPMN2 models.
The idea is to reuse some elements of predefined BPMN2 models, in such a way that you are able to reference this elements from an Xtext DSL. I was inspired by the following posts by Tamas Miklossy and Christian Dietrich:

* [How to reference UML elements from Xtext DSLs](https://blogs.itemis.com/en/how-to-reference-uml-elements-from-xtext-dsls)
* [Combining EMF models with Xtext DSLs](https://blogs.itemis.com/en/combining-emf-models-with-xtext-dsls?hsLang=en)
* [Xtext 2.0 and UML](https://dietrich-it.de/xtext/2011/07/17/xtext-2.0-and-uml/)

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

#### II. Modifications in the `security.xtext.bmpn.simple` project

3. Add the plugin `org.eclipse.bpmn2` to the `Require-Bundle` section in the [MANIFEST.MF]([https://github.com/itemis/itemis-blog/blob/referencing-uml-elements-from-xtext-dsls/org.example.domainmodel/META-INF/MANIFEST.MF](https://github.com/reinaqu/bpmnFromXtextDSL/blob/main/security.xtext.bmpn.simple/META-INF/MANIFEST.MF#L12) file





