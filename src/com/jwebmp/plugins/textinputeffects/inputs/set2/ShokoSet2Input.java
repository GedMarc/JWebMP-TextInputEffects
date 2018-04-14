package com.jwebmp.plugins.textinputeffects.inputs.set2;

import com.jwebmp.base.html.DivSimple;
import com.jwebmp.base.html.Input;
import com.jwebmp.base.html.Label;
import com.jwebmp.base.html.Span;
import com.jwebmp.plugins.ComponentInformation;

/**
 * Creates a haruki input style
 */
@ComponentInformation(name = "Shoko Input Effect",
		description = "A very nice effect for inputs",
		url = "https://tympanus.net/Development/TextInputEffects/index2.html")
public class ShokoSet2Input
		extends Set2InputEffect
{
	/**
	 * Creates a new haruki styled input
	 *
	 * @param input
	 * @param label
	 * @param content
	 */
	public ShokoSet2Input(Input input, Label label, Span content)
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
