/*
 * generated by Xtext 2.26.0
 */
package security.xtext.bmpn.simple;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class BPSecDslStandaloneSetup extends BPSecDslStandaloneSetupGenerated {

	public static void doSetup() {
		new BPSecDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
