package za.co.mmagon.jwebswing.plugins.textinputeffects.inputs;

import org.junit.jupiter.api.Test;
import za.co.mmagon.jwebswing.base.html.Label;
import za.co.mmagon.jwebswing.base.html.Span;
import za.co.mmagon.jwebswing.base.html.inputs.InputTextType;
import za.co.mmagon.jwebswing.plugins.textinputeffects.inputs.set1.HideoInput;

class HideoInputTest
{
	@Test
	public void testHideo()
	{
		HideoInput hi = new HideoInput(new InputTextType(), new Label(), new Span("content"), "fa fa-awesome");
		System.out.println(hi.toString(0));
		System.out.println(hi.getIcon());
	}
}
