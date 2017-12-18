package za.co.mmagon.jwebswing.plugins.textinputeffects.inputs;

import za.co.mmagon.jwebswing.base.html.Input;
import za.co.mmagon.jwebswing.base.html.Italic;
import za.co.mmagon.jwebswing.base.html.Label;
import za.co.mmagon.jwebswing.base.html.Span;

/**
 * Creates a haruki input style
 */
public class KohanaInput extends InputEffect
{
	private String icon;


	/**
	 * Creates a new haruki styled input
	 *
	 * @param input
	 * @param label
	 * @param content
	 */
	public KohanaInput(Input input, Label label, Span content)
	{
		super("kohana", input, label, content);
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
	public KohanaInput setIcon(String icon)
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
				i.addClass("icon icon--kohana");
				getLabel().add(i);
			}
		}
		super.init();
	}
}
