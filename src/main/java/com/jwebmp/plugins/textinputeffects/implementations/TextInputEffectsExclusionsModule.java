package com.jwebmp.plugins.textinputeffects.implementations;

import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class TextInputEffectsExclusionsModule
		implements IGuiceScanModuleExclusions<TextInputEffectsExclusionsModule>,
				           IGuiceScanJarExclusions<TextInputEffectsExclusionsModule>
{

	@Override
	public @NotNull Set<String> excludeJars()
	{
		Set<String> strings = new HashSet<>();
		strings.add("jwebmp-text-input-effects-*");
		return strings;
	}

	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.textinputeffects");
		return strings;
	}
}
