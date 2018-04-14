/*
 * Copyright (C) 2017 Marc Magon
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

package com.jwebmp.plugins.textinputeffects.inputs;

import com.jwebmp.base.html.Label;
import com.jwebmp.base.html.Span;
import com.jwebmp.base.html.inputs.InputTextType;
import com.jwebmp.plugins.textinputeffects.inputs.set2.KohanaSet2Input;
import org.junit.jupiter.api.Test;

class KohanaInputTest
{
	@Test
	public void testKyo()
	{
		KohanaSet2Input hi = new KohanaSet2Input(new InputTextType(), new Label(), new Span("content"));
		System.out.println(hi.toString(0));
	}
}
