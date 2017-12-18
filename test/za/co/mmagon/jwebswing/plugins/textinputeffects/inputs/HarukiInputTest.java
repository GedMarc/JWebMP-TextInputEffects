package za.co.mmagon.jwebswing.plugins.textinputeffects.inputs;

import org.junit.jupiter.api.Test;
import za.co.mmagon.jwebswing.base.html.InputTextType;
import za.co.mmagon.jwebswing.base.html.Label;
import za.co.mmagon.jwebswing.base.html.Span;

class HarukiInputTest
{
	@Test
	public void testHaruki()
	{
		HarukiInput hi = new HarukiInput(new InputTextType(), new Label(), new Span("content"));
		System.out.println(hi.toString(0));
	}
}
