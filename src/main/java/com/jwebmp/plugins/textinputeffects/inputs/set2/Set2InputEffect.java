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

import com.jwebmp.core.base.html.Input;
import com.jwebmp.core.base.html.Label;
import com.jwebmp.core.base.html.Span;
import com.jwebmp.plugins.textinputeffects.inputs.set1.Set1InputEffect;

/**
 * A base input effect component
 */
abstract class Set2InputEffect<J extends Set2InputEffect<J>>
		extends Set1InputEffect<J>
{
	public Set2InputEffect(String topEffectClass, Input input, Label label, Span content)
	{
		super(topEffectClass, input, label, content);
	}
}
