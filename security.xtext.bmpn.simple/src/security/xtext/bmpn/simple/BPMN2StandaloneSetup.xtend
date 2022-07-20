package security.xtext.bmpn.simple

import com.google.inject.Guice
import com.google.inject.Inject
import org.eclipse.xtext.ISetup
import org.eclipse.xtext.resource.FileExtensionProvider
import org.eclipse.xtext.resource.IResourceServiceProvider

/**
 * This class is needed for standalone runtime tests.
 */
class BPMN2StandaloneSetup implements ISetup {

	@Inject extension FileExtensionProvider 
	@Inject extension IResourceServiceProvider.Registry
	@Inject IResourceServiceProvider resourceServiceProvider

	override createInjectorAndDoEMFRegistration() {
		val injector = Guice.createInjector(new BPMN2RuntimeModule)
		
		injector.injectMembers(this)
		
		fileExtensions.forEach[extensionToFactoryMap.put(it, resourceServiceProvider)]
		
		injector
	}
}