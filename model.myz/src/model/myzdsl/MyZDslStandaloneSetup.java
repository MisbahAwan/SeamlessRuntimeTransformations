/*
 * generated by Xtext 2.25.0
 */
package model.myzdsl;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class MyZDslStandaloneSetup extends MyZDslStandaloneSetupGenerated {

	public static void doSetup() {
		new MyZDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
