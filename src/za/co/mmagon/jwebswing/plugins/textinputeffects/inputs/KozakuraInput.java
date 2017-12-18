package za.co.mmagon.jwebswing.plugins.textinputeffects.inputs;

import za.co.mmagon.jwebswing.base.html.DivSimple;
import za.co.mmagon.jwebswing.base.html.Input;
import za.co.mmagon.jwebswing.base.html.Label;
import za.co.mmagon.jwebswing.base.html.Span;

/**
 * Creates a haruki input style
 */
public class KozakuraInput extends InputEffect
{
	/**
	 * Creates a new haruki styled input
	 *
	 * @param input
	 * @param label
	 * @param content
	 */
	public KozakuraInput(Input input, Label label, Span content)
	{
		super("kozakura", input, label, content);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void init()
	{
		if (!isInitialized())
		{
			DivSimple svg = new DivSimple();
			svg.setTag("svg");
			svg.addClass("graphic graphic--kozakura");
			svg.addAttribute("width", "300%");
			svg.addAttribute("height", "100%");
			svg.addAttribute("viewBox", "0 0 1200 60");
			svg.addAttribute("preserveAspectRatio", "none");

			DivSimple path1 = new DivSimple();
			path1.setTag("path");
			path1.addAttribute("d", "M1200,9c0,0-305.005,0-401.001,0C733,9,675.327,4.969,598,4.969C514.994,4.969,449.336,9,400.333,9C299.666,9,0,9,0,9v43c0,0,299.666,0,400.333,0c49.002,0,114.66,3.484,197.667,3.484c77.327,0,135-3.484,200.999-3.484C894.995,52,1200,52,1200,52V9z");

			svg.add(path1);

			super.init();
			add(svg);
		}
		super.init();
	}
}
