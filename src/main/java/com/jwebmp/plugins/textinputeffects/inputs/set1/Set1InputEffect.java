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

package com.jwebmp.plugins.textinputeffects.inputs.set1;

import com.jwebmp.core.base.html.Input;
import com.jwebmp.core.base.html.Label;
import com.jwebmp.core.base.html.Span;
import com.jwebmp.core.base.html.attributes.NoAttributes;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.plugins.textinputeffects.TextInputEventsPageConfigurator;

/**
 * A base input effect component
 */
public abstract class Set1InputEffect<J extends Set1InputEffect<J>>
		extends Span<IComponentHierarchyBase, NoAttributes, Set1InputEffect<J>>
{
	/**
	 * The top effect class
	 */
	private String topEffectClass = "input input--";
	/**
	 * The input effect class
	 */
	private String inputEffectClass = "input__field input__field--";
	/**
	 * The label outer class
	 */
	/**
	 * The label contents class
	 */
	private String labelEffectClass = "input__label input__label--";
	/**
	 * The label actual class
	 */
	private String labelContentClass = "input__label-content input__label-content--";

	/**
	 * The physical input component
	 */
	private Input input;
	/**
	 * The physical label
	 */
	private Label label;
	/**
	 * The physical content
	 */
	private Span content;

	/**
	 * Constructs a new Input Event from the library
	 *
	 * @param topEffectClass
	 * @param input
	 * @param label
	 * @param content
	 */
	public Set1InputEffect(String topEffectClass, Input input, Label label, Span content)
	{
		this();
		this.input = input;
		this.label = label;
		this.content = content;
		addClass("input");
		this.topEffectClass += topEffectClass;
		inputEffectClass += topEffectClass;
		labelContentClass += topEffectClass;
		labelEffectClass += topEffectClass;
	}

	/**
	 * Constructs a blank input effect component
	 */
	public Set1InputEffect()
	{
		TextInputEventsPageConfigurator.setUseSetOne(true);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void init()
	{
		if (!isInitialized())
		{
			addClass(topEffectClass);
			if (input != null)
			{
				add(input);
				input.addClass(inputEffectClass);
			}

			if (label != null)
			{
				add(label);
				label.addClass(labelEffectClass);
				if (content != null)
				{
					content.addClass(labelContentClass);
					label.add(content);
				}
			}

		}
		super.init();
	}

	/**
	 * Returns the global class applied
	 *
	 * @return
	 */
	public String getTopEffectClass()
	{
		return topEffectClass;
	}

	/**
	 * Sets the global class applied
	 *
	 * @param topEffectClass
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public J setTopEffectClass(String topEffectClass)
	{
		this.topEffectClass = topEffectClass;
		return (J) this;
	}

	/**
	 * Gets the input class added on
	 *
	 * @return
	 */
	public String getInputEffectClass()
	{
		return inputEffectClass;
	}

	/**
	 * Sets the input class added on
	 *
	 * @param inputEffectClass
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public J setInputEffectClass(String inputEffectClass)
	{
		this.inputEffectClass = inputEffectClass;
		return (J) this;
	}

	/**
	 * Gets the label effects class
	 *
	 * @return
	 */
	public String getLabelEffectClass()
	{
		return labelEffectClass;
	}

	/**
	 * Sets the effects class
	 *
	 * @param labelEffectClass
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public J setLabelEffectClass(String labelEffectClass)
	{
		this.labelEffectClass = labelEffectClass;
		return (J) this;
	}

	/**
	 * Gets the label actual class
	 *
	 * @return
	 */
	public String getLabelContentClass()
	{
		return labelContentClass;
	}

	/**
	 * Sets the label actual class
	 *
	 * @param labelContentClass
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public J setLabelContentClass(String labelContentClass)
	{
		this.labelContentClass = labelContentClass;
		return (J) this;
	}

	/**
	 * Gets the input component
	 *
	 * @return
	 */
	public Input getInput()
	{
		return input;
	}

	/**
	 * Sets the input component
	 *
	 * @param input
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public J setInput(Input input)
	{
		this.input = input;
		return (J) this;
	}

	/**
	 * Gets the label applied
	 *
	 * @return
	 */
	public Label getLabel()
	{
		return label;
	}

	/**
	 * Sets the label applied
	 *
	 * @param label
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public J setLabel(Label label)
	{
		this.label = label;
		return (J) this;
	}

	/**
	 * Gets the total content span
	 *
	 * @return
	 */
	public Span getContent()
	{
		return content;
	}

	/**
	 * Sets the total content span
	 *
	 * @param content
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public J setContent(Span content)
	{
		this.content = content;
		return (J) this;
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}

	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
	}
}
