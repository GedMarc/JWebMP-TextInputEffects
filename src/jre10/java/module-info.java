import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.textinputeffects.TextInputEventsPageConfigurator;

module com.jwebmp.plugins.textinputeffects {

	exports com.jwebmp.plugins.textinputeffects;
	exports com.jwebmp.plugins.textinputeffects.inputs.set1;
	exports com.jwebmp.plugins.textinputeffects.inputs.set2;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;

	provides IPageConfigurator with TextInputEventsPageConfigurator;
}
