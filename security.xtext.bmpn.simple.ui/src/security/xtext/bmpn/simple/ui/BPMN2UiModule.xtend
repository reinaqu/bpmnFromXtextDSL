package security.xtext.bmpn.simple.ui

import com.google.inject.Binder
import org.eclipse.ui.plugin.AbstractUIPlugin
import org.eclipse.xtext.ui.LanguageSpecific
import org.eclipse.xtext.ui.editor.IURIEditorOpener
import org.eclipse.xtext.ui.resource.generic.EmfUiModule
import security.xtext.bmpn.simple.ui.editor.ReflectiveTreeEditorOpener
/**
 * This class is the DI config for all Eclipse-based services.
 */
class BPMN2UiModule extends EmfUiModule{
	
	
	new(AbstractUIPlugin plugin) {
		super(plugin)
	}

	/*
	 * This binding adds an editor opener that opens the EMF (reflective) tree editor when the user
	 * follows a reference to an XMI-defined bpmn element in the bpucon Xtext editor.
	 */
	override configureLanguageSpecificURIEditorOpener(Binder binder) {
		binder.bind(IURIEditorOpener)
		       .annotatedWith(LanguageSpecific)
		       .to(ReflectiveTreeEditorOpener)
	}
	
}