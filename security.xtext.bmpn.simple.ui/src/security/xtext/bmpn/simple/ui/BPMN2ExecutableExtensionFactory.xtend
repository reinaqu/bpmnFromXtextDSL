package security.xtext.bmpn.simple.ui

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory
import security.xtext.bmpn.simple.BPMN2LanguageConstants
import security.xtext.bmpn.simple.ui.internal.SimpleActivator

class BPMN2ExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {
	override protected getBundle() {
		SimpleActivator.instance.bundle
	}

	override protected getInjector() {
		SimpleActivator.instance.getInjector(BPMN2LanguageConstants.ORG_ECLIPSE_BPMN2)
	}
}