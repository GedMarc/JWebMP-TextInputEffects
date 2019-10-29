module com.jwebmp.plugins.textinputeffects {

	exports com.jwebmp.plugins.textinputeffects;
	exports com.jwebmp.plugins.textinputeffects.inputs.set1;
	exports com.jwebmp.plugins.textinputeffects.inputs.set2;

	requires com.jwebmp.core;
	requires com.guicedee.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;
	requires com.guicedee.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.textinputeffects.TextInputEventsPageConfigurator;

	provides com.guicedee.guicedinjection.interfaces.IGuiceScanJarExclusions with com.jwebmp.plugins.textinputeffects.implementations.TextInputEffectsExclusionsModule;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.textinputeffects.implementations.TextInputEffectsExclusionsModule;

	opens com.jwebmp.plugins.textinputeffects to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.textinputeffects.inputs.set1 to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.textinputeffects.inputs.set2 to com.fasterxml.jackson.databind, com.jwebmp.core;
}