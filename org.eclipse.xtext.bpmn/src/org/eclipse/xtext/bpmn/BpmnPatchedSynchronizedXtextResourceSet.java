package org.eclipse.xtext.bpmn;

import java.io.IOException;
import java.util.Map;

import org.eclipse.bpmn2.util.Bpmn2Resource;
import org.eclipse.bpmn2.util.QNameURIHandler;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.xtext.resource.SynchronizedXtextResourceSet;

public class BpmnPatchedSynchronizedXtextResourceSet extends SynchronizedXtextResourceSet {
	
	@Override
	protected void demandLoad(Resource resource) throws IOException {
		if ("bpmn2".equals(resource.getURI().fileExtension())) {
			Map<Object, Object> patchedOptions = getLoadOptions();
			patchedOptions.remove(XMLResource.OPTION_URI_HANDLER);
			resource.load(patchedOptions);
		}
		super.demandLoad(resource);
	}

}
