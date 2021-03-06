/*
 * generated by Xtext 2.25.0
 */
package model.myzdsl.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import model.myzdsl.MyZDslRuntimeModule;
import model.myzdsl.MyZDslStandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class MyZDslIdeSetup extends MyZDslStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new MyZDslRuntimeModule(), new MyZDslIdeModule()));
	}
	
}
