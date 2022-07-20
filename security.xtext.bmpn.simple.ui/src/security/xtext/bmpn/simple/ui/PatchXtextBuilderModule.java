package security.xtext.bmpn.simple.ui;

import org.eclipse.xtext.bpmn.BpmnPatchedSynchronizedXtextResourceSet;
import org.eclipse.xtext.resource.SynchronizedXtextResourceSet;

import com.google.inject.Binder;
import com.google.inject.Module;

public class PatchXtextBuilderModule implements Module {

	public PatchXtextBuilderModule() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void configure(Binder arg0) {
		arg0.bind(SynchronizedXtextResourceSet.class).to(BpmnPatchedSynchronizedXtextResourceSet.class);

	}

}
