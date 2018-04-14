package com.jwebmp.plugins.textinputeffects.inputs.set1;

import com.jwebmp.base.html.Input;
import com.jwebmp.base.html.Label;
import com.jwebmp.base.html.Span;
import com.jwebmp.plugins.ComponentInformation;

/**
 * Creates a haruki input style
 */
@ComponentInformation(name = "Haruki Input Effect",
		description = "A very nice effect for inputs",
		url = "https://tympanus.net/Development/TextInputEffects/index2.html")
public class HarukiInput
		extends Set1InputEffect
{
	/**
	 * Creates a new haruki styled input
	 *
	 * @param input
	 * @param label
	 * @param content
	 */
	public HarukiInput(Input input, Label label, Span content)
	{
		super("haruki", input, label, content);
	}
}
