/*
 * generated by Xtext 2.26.0
 */
package security.xtext.bmpn.simple;

import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.bpmn.BpmnPatchedSynchronizedXtextResourceSet;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class BPSecDslRuntimeModule extends AbstractBPSecDslRuntimeModule {
	
	@Override
	public Class<? extends XtextResourceSet> bindXtextResourceSet() {
		return BpmnPatchedSynchronizedXtextResourceSet.class;
	}
}