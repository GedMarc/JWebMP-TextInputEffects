package com.jwebmp.plugins.textinputeffects.inputs.set2;

import com.jwebmp.core.base.html.Input;
import com.jwebmp.core.base.html.Label;
import com.jwebmp.core.base.html.Span;
import com.jwebmp.core.plugins.ComponentInformation;

/**
 * Creates a haruki input style
 */
@ComponentInformation(name = "Cisato Input Effect",
		description = "A very nice effect for inputs",
		url = "https://tympanus.net/Development/TextInputEffects/index2.html")
public class ChisatoSet2Input
		extends Set2InputEffect<ChisatoSet2Input>
{
	/**
	 * Creates a new haruki styled input
	 *
	 * @param input
	 * @param label
	 * @param content
	 */
	public ChisatoSet2Input(Input input, Label label, Span content)
	{
		super("chisato", input, label, content);
	}
}
