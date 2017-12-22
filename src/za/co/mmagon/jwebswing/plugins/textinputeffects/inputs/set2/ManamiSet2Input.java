package za.co.mmagon.jwebswing.plugins.textinputeffects.inputs.set2;

import za.co.mmagon.jwebswing.base.html.Input;
import za.co.mmagon.jwebswing.base.html.Label;
import za.co.mmagon.jwebswing.base.html.Span;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;

/**
 * Creates a haruki input style
 */
@ComponentInformation(name = "Manami Input Effect", description = "A very nice effect for inputs", url = "https://tympanus.net/Development/TextInputEffects/index2.html")
public class ManamiSet2Input extends Set2InputEffect
{
	/**
	 * Creates a new haruki styled input
	 *
	 * @param input
	 * @param label
	 * @param content
	 */
	public ManamiSet2Input(Input input, Label label, Span content)
	{
		super("manami", input, label, content);
	}
}
