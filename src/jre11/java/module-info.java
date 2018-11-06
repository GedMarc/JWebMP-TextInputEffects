import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.plugins.textinputeffects.TextInputEventsPageConfigurator;
import com.jwebmp.plugins.textinputeffects.implementations.TextInputEffectsExclusionsModule;

module com.jwebmp.plugins.textinputeffects {

	exports com.jwebmp.plugins.textinputeffects;
	exports com.jwebmp.plugins.textinputeffects.inputs.set1;
	exports com.jwebmp.plugins.textinputeffects.inputs.set2;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;
	requires com.jwebmp.guicedinjection;

	provides IPageConfigurator with TextInputEventsPageConfigurator;

	provides IGuiceScanJarExclusions with TextInputEffectsExclusionsModule;
	provides IGuiceScanModuleExclusions with TextInputEffectsExclusionsModule;

	opens com.jwebmp.plugins.textinputeffects to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.textinputeffects.inputs.set1 to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.textinputeffects.inputs.set2 to com.fasterxml.jackson.databind, com.jwebmp.core;
}
