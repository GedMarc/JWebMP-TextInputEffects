package za.co.mmagon.jwebswing.plugins.textinputeffects.inputs;

import org.junit.jupiter.api.Test;
import za.co.mmagon.jwebswing.base.html.Label;
import za.co.mmagon.jwebswing.base.html.Span;
import za.co.mmagon.jwebswing.base.html.inputs.InputTextType;
import za.co.mmagon.jwebswing.plugins.textinputeffects.inputs.set2.ManamiSet2Input;

class ManamiInputTest
{
	@Test
	public void testManami()
	{
		ManamiSet2Input hi = new ManamiSet2Input(new InputTextType(), new Label(), new Span("content"));
		System.out.println(hi.toString(0));
	}
}
