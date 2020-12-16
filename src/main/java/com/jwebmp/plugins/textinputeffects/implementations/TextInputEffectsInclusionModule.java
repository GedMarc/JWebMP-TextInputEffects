package com.jwebmp.plugins.textinputeffects.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions;
import jakarta.validation.constraints.NotNull;

import java.util.HashSet;
import java.util.Set;

public class TextInputEffectsInclusionModule implements IGuiceScanModuleInclusions<TextInputEffectsInclusionModule>
{
	@Override
	public @NotNull Set<String> includeModules()
	{
		Set<String> set = new HashSet<>();
		set.add("com.jwebmp.plugins.textinputeffects");
		return set;
	}
}
