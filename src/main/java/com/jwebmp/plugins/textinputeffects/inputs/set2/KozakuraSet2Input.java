/*
 * Copyright (C) 2017 GedMarc
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.jwebmp.plugins.textinputeffects.inputs.set2;

import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.html.Input;
import com.jwebmp.core.base.html.Label;
import com.jwebmp.core.base.html.Span;
import com.jwebmp.core.plugins.ComponentInformation;

/**
 * Creates a haruki input style
 */
@ComponentInformation(name = "Hozakura Input Effect",
		description = "A very nice effect for inputs",
		url = "https://tympanus.net/Development/TextInputEffects/index2.html")
public class KozakuraSet2Input
		extends Set2InputEffect<KozakuraSet2Input>
{
	/**
	 * Creates a new haruki styled input
	 *
	 * @param input
	 * @param label
	 * @param content
	 */
	public KozakuraSet2Input(Input input, Label label, Span content)
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
			path1.addAttribute("d",
			                   "M1200,9c0,0-305.005,0-401.001,0C733,9,675.327,4.969,598,4.969C514.994,4.969,449.336,9,400.333,9C299.666,9,0,9,0,9v43c0,0,299.666,0,400.333,0c49.002,0,114.66,3.484,197.667,3.484c77.327,0,135-3.484,200.999-3.484C894.995,52,1200,52,1200,52V9z");

			svg.add(path1);

			super.init();
			add(svg);
		}
		super.init();
	}
}
