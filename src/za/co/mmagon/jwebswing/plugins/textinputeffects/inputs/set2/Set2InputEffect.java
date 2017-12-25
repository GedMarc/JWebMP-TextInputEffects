package za.co.mmagon.jwebswing.plugins.textinputeffects.inputs.set2;

import za.co.mmagon.jwebswing.base.html.Input;
import za.co.mmagon.jwebswing.base.html.Label;
import za.co.mmagon.jwebswing.base.html.Span;
import za.co.mmagon.jwebswing.plugins.textinputeffects.inputs.set1.Set1InputEffect;

/**
 * A base input effect component
 */
abstract class Set2InputEffect<J extends Set2InputEffect<J>> extends Set1InputEffect
{
	public Set2InputEffect(String topEffectClass, Input input, Label label, Span content)
	{
		super(topEffectClass, input, label, content);
	}
}
