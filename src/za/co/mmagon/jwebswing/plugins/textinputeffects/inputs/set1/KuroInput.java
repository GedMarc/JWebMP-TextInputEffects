package za.co.mmagon.jwebswing.plugins.textinputeffects.inputs.set1;

import za.co.mmagon.jwebswing.base.html.Input;
import za.co.mmagon.jwebswing.base.html.Label;
import za.co.mmagon.jwebswing.base.html.Span;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;

/**
 * Creates a haruki input style
 */
@ComponentInformation(name = "Kuro Input Effect", description = "A very nice effect for inputs", url = "https://tympanus.net/Development/TextInputEffects/index2.html")
public class KuroInput extends Set1InputEffect
{
	/**
	 * Creates a new haruki styled input
	 *
	 * @param input
	 * @param label
	 * @param content
	 */
	public KuroInput(Input input, Label label, Span content)
	{
		super("kuro", input, label, content);
	}
}
