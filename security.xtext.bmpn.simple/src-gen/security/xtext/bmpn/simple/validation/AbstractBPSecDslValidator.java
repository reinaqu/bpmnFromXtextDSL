/*
 * generated by Xtext 2.26.0
 */
package security.xtext.bmpn.simple.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractBPSecDslValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(security.xtext.bmpn.simple.bPSecDsl.BPSecDslPackage.eINSTANCE);
		return result;
	}
}
