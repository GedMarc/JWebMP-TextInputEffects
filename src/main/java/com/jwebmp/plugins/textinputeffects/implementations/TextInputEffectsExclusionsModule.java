package com.jwebmp.plugins.textinputeffects.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import jakarta.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class TextInputEffectsExclusionsModule
		implements IGuiceScanModuleExclusions<TextInputEffectsExclusionsModule>
{
	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.textinputeffects");
		return strings;
	}
}
