package za.co.mmagon.jwebswing.plugins.textinputeffects.inputs.set1;

import za.co.mmagon.jwebswing.base.html.Input;
import za.co.mmagon.jwebswing.base.html.Italic;
import za.co.mmagon.jwebswing.base.html.Label;
import za.co.mmagon.jwebswing.base.html.Span;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;

/**
 * Creates a haruki input style
 */
@ComponentInformation(name = "Hideo Input Effect", description = "A very nice effect for inputs", url = "https://tympanus.net/Development/TextInputEffects/index2.html")
public class HideoInput extends Set1InputEffect
{
	private String icon;

	/**
	 * Creates a new haruki styled input
	 *
	 * @param input
	 * @param label
	 * @param content
	 */
	public HideoInput(Input input, Label label, Span content, String icon)
	{
		super("hideo", input, label, content);
		setIcon(icon);

	}

	/**
	 * Gets the icon in the box
	 *
	 * @return
	 */
	public String getIcon()
	{
		return icon;
	}

	/**
	 * Sets the icon in the box
	 *
	 * @param icon
	 *
	 * @return
	 */
	public HideoInput setIcon(String icon)
	{
		this.icon = icon;
		return this;
	}

	@Override
	@SuppressWarnings("unchecked")
	public void init()
	{
		if (!isInitialized())
		{
			if (getLabel() != null)
			{
				Italic<?> i = new Italic();
				i.addClass(icon);
				i.addClass("icon icon--hideo");
				getLabel().add(i);
			}
		}
		super.init();
	}
}
