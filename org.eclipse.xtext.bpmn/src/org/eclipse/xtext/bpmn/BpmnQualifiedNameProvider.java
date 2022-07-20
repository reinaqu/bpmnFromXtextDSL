package org.eclipse.xtext.bpmn;
import java.util.Arrays;
import java.util.stream.Collectors;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
 
public class BpmnQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {
	
	public QualifiedName qualifiedName(org.eclipse.bpmn2.Process ele) {
		return QualifiedName.create(ele.getId());
	}

	public QualifiedName qualifiedName(org.eclipse.bpmn2.Task ele) {
		return QualifiedName.create(ele.getId());
	}

//	private static String getMethodName(final int depth)
//    {
//      final StackTraceElement[] ste = new Throwable().getStackTrace();
//
//      return Arrays.stream(ste)
//    		  		.map(st-> st.getClassName()+"::"+st.getMethodName())
//      				.collect(Collectors.joining("\n"));
//      //System. out.println(ste[ste.length-depth].getClassName()+"#"+ste[ste.length-depth].getMethodName());
//      //return ste[ste.length - depth].getClassName()+"::" +ste[ste.length - depth].getMethodName();
//    }
}