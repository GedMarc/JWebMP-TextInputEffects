package za.co.mmagon.jwebswing.plugins.textinputeffects.inputs;

import za.co.mmagon.jwebswing.base.html.DivSimple;
import za.co.mmagon.jwebswing.base.html.Input;
import za.co.mmagon.jwebswing.base.html.Label;
import za.co.mmagon.jwebswing.base.html.Span;

/**
 * Creates a haruki input style
 */
public class ShokoInput extends InputEffect
{
	/**
	 * Creates a new haruki styled input
	 *
	 * @param input
	 * @param label
	 * @param content
	 */
	public ShokoInput(Input input, Label label, Span content)
	{
		super("shoko", input, label, content);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void init()
	{
		if (!isInitialized())
		{
			DivSimple svg = new DivSimple();
			svg.setTag("svg");
			svg.addClass("graphic graphic--shoko");
			svg.addAttribute("width", "300%");
			svg.addAttribute("height", "100%");
			svg.addAttribute("viewBox", "0 0 1200 60");
			svg.addAttribute("preserveAspectRatio", "none");

			DivSimple path1 = new DivSimple();
			path1.setTag("path");
			path1.addAttribute("d", "M0,56.5c0,0,298.666,0,399.333,0C448.336,56.5,513.994,46,597,46c77.327,0,135,10.5,200.999,10.5c95.996,0,402.001,0,402.001,0");

			DivSimple path2 = new DivSimple();
			path2.setTag("path");
			path2.addAttribute("d", "M0,2.5c0,0,298.666,0,399.333,0C448.336,2.5,513.994,13,597,13c77.327,0,135-10.5,200.999-10.5c95.996,0,402.001,0,402.001,0");

			svg.add(path1);
			svg.add(path2);

			super.init();
			add(svg);
		}
		super.init();
	}
}
