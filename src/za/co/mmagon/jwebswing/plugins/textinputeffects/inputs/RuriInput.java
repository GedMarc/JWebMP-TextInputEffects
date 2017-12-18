package za.co.mmagon.jwebswing.plugins.textinputeffects.inputs;

import za.co.mmagon.jwebswing.base.html.Input;
import za.co.mmagon.jwebswing.base.html.Label;
import za.co.mmagon.jwebswing.base.html.Span;

/**
 * Creates a haruki input style
 */
public class RuriInput extends InputEffect
{

	/**
	 * Creates a new haruki styled input
	 *
	 * @param input
	 * @param label
	 * @param content
	 */
	public RuriInput(Input input, Label label, Span content)
	{
		super("ruri", input, label, content);
	}


}
