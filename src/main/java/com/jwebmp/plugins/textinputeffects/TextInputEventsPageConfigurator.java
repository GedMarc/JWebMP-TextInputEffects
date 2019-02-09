/*
 * Copyright (C) 2017 GedMarc
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.jwebmp.plugins.textinputeffects;

import com.jwebmp.core.Page;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.services.IPageConfigurator;

import javax.validation.constraints.NotNull;

/**
 * @author GedMarc
 * @since 08 Jun 2017
 */
@PluginInformation(pluginName = "Text Input Effects",
		pluginDescription = "Simple ideas for enhancing text input interactions",
		pluginUniqueName = "jwebswing-text-input-effects",
		pluginVersion = "1.0.0",
		pluginCategories = "text,effects, styling,ui,web ui, framework",
		pluginSubtitle = "Simple ideas for enhancing text input interactions",
		pluginSourceUrl = "https://tympanus.net/Development/TextInputEffects/",
		pluginWikiUrl = "https://github.com/GedMarc/JWebMP-TextInputEffects/wiki",
		pluginGitUrl = "https://github.com/GedMarc/JWebMP-TextInputEffects",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginOriginalHomepage = "https://tympanus.net/Development/TextInputEffects/",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/TextInputEffects.jar/download")
@ComponentInformation(name = "Text Input Effects",
		description = "Simple ideas for enhancing text input interactions",
		url = "https://tympanus.net/Development/TextInputEffects/")
public class TextInputEventsPageConfigurator
		implements IPageConfigurator<TextInputEventsPageConfigurator>
{
	/**
	 * If this configurator is enabled
	 */
	private static boolean enabled = true;
	private static boolean useSetOne = true;

	/*
	 * Constructs a new TextInputEventsPageConfigurator
	 */
	public TextInputEventsPageConfigurator()
	{
		//Nothing needed
	}

	/**
	 * Method isEnabled returns the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @return the enabled (type boolean) of this AngularAnimatedChangePageConfigurator object.
	 */
	public static boolean isEnabled()
	{
		return TextInputEventsPageConfigurator.enabled;
	}

	/**
	 * Method setEnabled sets the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @param mustEnable
	 * 		the enabled of this AngularAnimatedChangePageConfigurator object.
	 */
	public static void setEnabled(boolean mustEnable)
	{
		TextInputEventsPageConfigurator.enabled = mustEnable;
	}

	/**
	 * Whether Set 1 or Set 2 is loaded.
	 *
	 * @return
	 */
	public static boolean isUseSetOne()
	{
		return TextInputEventsPageConfigurator.useSetOne;
	}

	/**
	 * Whether Set 1 or Set 2 is loaded.
	 *
	 * @param useSetOne
	 */
	public static void setUseSetOne(boolean useSetOne)
	{
		TextInputEventsPageConfigurator.useSetOne = useSetOne;
	}

	@NotNull
	@Override
	@SuppressWarnings("unchecked")
	public Page configure(Page page)
	{
		if (!page.isConfigured() && enabled())
		{
			page.getBody()
			    .addJavaScriptReference(TextInputEffectsReferencePool.TextInputEffectsCassie.getJavaScriptReference());

			if (TextInputEventsPageConfigurator.useSetOne)
			{
				page.getBody()
				    .addCssReference(TextInputEffectsReferencePool.TextInputEffectsCassie.getCssReference());
			}
			else
			{
				page.getBody()
				    .addCssReference(TextInputEffectsReferencePool.TextInputEffectSet2.getCssReference());
			}

			page.getBody()
			    .addJavaScriptReference(TextInputEffectsReferencePool.ClassieTypeText.getJavaScriptReference());
		}
		return page;
	}

	@Override
	public boolean enabled()
	{
		return TextInputEventsPageConfigurator.enabled;
	}
}
