# bpmnFromXtextDSL

This repository is a small proof of concept to build a small Xtext DSL that references elements from BPMN2 models.
The idea is to reuse some elements of predefined BPMN2 models, in such a way that you are able to reference this elements from an Xtext DSL. I was inspired by the following posts by Tamas Miklossy and Christian Dietrich:

* [How to reference UML elements from Xtext DSLs](https://blogs.itemis.com/en/how-to-reference-uml-elements-from-xtext-dsls)
* [Combining EMF models with Xtext DSLs](https://blogs.itemis.com/en/combining-emf-models-with-xtext-dsls?hsLang=en)
* [Xtext 2.0 and UML](https://dietrich-it.de/xtext/2011/07/17/xtext-2.0-and-uml/)

Finally, the process was not as easy as I expected, and without the help of Christian Dietrich in the [Eclipse Forums](https://www.eclipse.org/forums/index.php/m/1853751/#msg_1853751) I would not have obtained the expected result. Thus, this repository has as aim the documentation of the entire process in case is useful for someone else.



# DSL Ecore Metamodel


# DSL Grammar

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
