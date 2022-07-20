package org.eclipse.xtext.bpmn;

import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.resource.generic.AbstractGenericResourceRuntimeModule;

public class BpmnRuntimeModule extends AbstractGenericResourceRuntimeModule {

	@Override
	protected String getLanguageName() {
		return "bpmn";
	}

	@Override
	protected String getFileExtensions() {
		return "bpmn2";
	}
	
	@Override
	public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
		return BpmnQualifiedNameProvider.class;
	}
	
	public Class<? extends XtextResourceSet> bindXtextResourceSet() {
		return BpmnPatchedSynchronizedXtextResourceSet.class;
	}
}
