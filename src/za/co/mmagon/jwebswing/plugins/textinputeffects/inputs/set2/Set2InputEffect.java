package za.co.mmagon.jwebswing.plugins.textinputeffects.inputs.set2;

import za.co.mmagon.jwebswing.base.html.Input;
import za.co.mmagon.jwebswing.base.html.Label;
import za.co.mmagon.jwebswing.base.html.Span;
import za.co.mmagon.jwebswing.base.html.attributes.NoAttributes;
import za.co.mmagon.jwebswing.base.html.interfaces.GlobalChildren;
import za.co.mmagon.jwebswing.plugins.textinputeffects.TextInputEventsPageConfigurator;

/**
 * A base input effect component
 */
abstract class Set2InputEffect<J extends Set2InputEffect<J>> extends Span<GlobalChildren, NoAttributes, Set2InputEffect<J>>
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
	 * Constructs a blank input effect component
	 */
	public Set2InputEffect()
	{
		TextInputEventsPageConfigurator.setUseSetOne(false);
	}

	/**
	 * Constructs a new Input Event from the library
	 *
	 * @param topEffectClass
	 * @param input
	 * @param label
	 * @param content
	 */
	public Set2InputEffect(String topEffectClass, Input input, Label label, Span content)
	{
		this();
		this.input = input;
		this.label = label;
		this.content = content;
		addClass("input");
		this.topEffectClass += topEffectClass;
		this.inputEffectClass += topEffectClass;
		this.labelContentClass += topEffectClass;
		this.labelEffectClass += topEffectClass;
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
}
