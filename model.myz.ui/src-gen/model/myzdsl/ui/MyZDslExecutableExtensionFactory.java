/*
 * generated by Xtext 2.25.0
 */
package model.myzdsl.ui;

import com.google.inject.Injector;
import model.myz.ui.internal.MyzActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MyZDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(MyzActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		MyzActivator activator = MyzActivator.getInstance();
		return activator != null ? activator.getInjector(MyzActivator.MODEL_MYZDSL_MYZDSL) : null;
	}

}
