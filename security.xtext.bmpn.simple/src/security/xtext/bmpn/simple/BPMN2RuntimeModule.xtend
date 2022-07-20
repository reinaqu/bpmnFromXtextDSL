package security.xtext.bmpn.simple
import org.eclipse.xtext.resource.generic.AbstractGenericResourceRuntimeModule

/**
 * This class is used to configure the runtime dependency injection (DI) container for the BPMN language.
 */
class BPMN2RuntimeModule  extends AbstractGenericResourceRuntimeModule {
	override protected getFileExtensions() {
		'bpmn2'
	}

	override protected getLanguageName() {
		BPMN2LanguageConstants.ORG_ECLIPSE_BPMN2
	}

	override bindIQualifiedNameProvider() {
		BPMN2QualifiedNameProvider
	}
}