package za.co.mmagon.jwebswing.plugins.textinputeffects;

import za.co.mmagon.FileTemplates;
import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.PageConfigurator;
import za.co.mmagon.jwebswing.base.html.Script;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;
import za.co.mmagon.jwebswing.plugins.PluginInformation;

/**
 * @author Marc Magon
 * @since 08 Jun 2017
 */
@PluginInformation(pluginName = "Text Input Effects",
		pluginDescription = "Simple ideas for enhancing text input interactions",
		pluginUniqueName = "jwebswing-text-input-effects",
		pluginVersion = "1.0.0",
		pluginCategories = "text,effects, styling,ui,web ui, framework",
		pluginSubtitle = "Simple ideas for enhancing text input interactions",
		pluginSourceUrl = "https://tympanus.net/Development/TextInputEffects/",
		pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-TextInputEffects/wiki",
		pluginGitUrl = "https://github.com/GedMarc/JWebSwing-TextInputEffects",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginOriginalHomepage = "https://tympanus.net/Development/TextInputEffects/",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/TextInputEffects.jar/download"
)
@ComponentInformation(name = "Text Input Effects",
		description = "Simple ideas for enhancing text input interactions",
		url = "https://tympanus.net/Development/TextInputEffects/")
public class TextInputEventsPageConfigurator extends PageConfigurator
{

	private static final long serialVersionUID = 1L;

	/*
	 * Constructs a new TextInputEventsPageConfigurator
	 */
	public TextInputEventsPageConfigurator()
	{
		//Nothing needed
	}

	@Override
	@SuppressWarnings("unchecked")
	public Page configure(Page page)
	{
		if (!page.isConfigured())
		{
			page.getBody().addJavaScriptReference(TextInputEffectsReferencePool.TextInputEffectsCassie.getJavaScriptReference());
			page.getBody().addCssReference(TextInputEffectsReferencePool.TextInputEffectsCassie.getCssReference());
			page.getBody().addCssReference(TextInputEffectsReferencePool.TextInputEffectSet2.getCssReference());

			String template = FileTemplates.getFileTemplate(TextInputEventsPageConfigurator.class, "textinputeffects", "textinputeffects.min.js").toString();
			Script script = new Script();
			script.setJavascript(template);
			page.getBody().add(script);
		}
		return page;
	}
}
