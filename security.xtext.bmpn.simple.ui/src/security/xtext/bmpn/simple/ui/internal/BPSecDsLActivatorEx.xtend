package security.xtext.bmpn.simple.ui.internal

import security.xtext.bmpn.simple.BPMN2RuntimeModule
import security.xtext.bmpn.simple.BPMN2LanguageConstants
import security.xtext.bmpn.simple.ui.BPMN2UiModule

class BPSecDsLActivatorEx extends SimpleActivator{
	private static Integer counter=1;
	
	override getRuntimeModule(String grammar) {
		println("BpucondslActivatorEx.getRuntimeModule==>"+ grammar)
		//println("getCallerClass"+ getCallerClass)
		if (grammar.isBPMN2Language) {
			println("getRuntimeModule==>"+"isBPMN")
			return new BPMN2RuntimeModule
		}
		super.getRuntimeModule(grammar)
	}

	override getUiModule(String grammar) {
		println("BpucondslActivatorEx.getUiModule==>"+ grammar)
		//println("getCallerClass"+ getCallerClass)
		if (grammar.isBPMN2Language) {
			println("getUiModule==>"+"isBPMN")
			return new BPMN2UiModule(this)
		}
		super.getUiModule(grammar)
	}

	private def isBPMN2Language(String grammar){
		//System.out.println("======="+grammar)
		BPMN2LanguageConstants.ORG_ECLIPSE_BPMN2.equals(grammar)
	}
	
	// method added to debugging
	private def getCallerClass(){
		var res=""
		for (StackTraceElement ste: Thread.currentThread().stackTrace ){
			res+=  counter+"-"+ste.className + "::"+ste.methodName+"\n"
			}
		counter++
		return res
    }
                           
}