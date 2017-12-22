package za.co.mmagon.jwebswing.plugins.textinputeffects.inputs;

import org.junit.jupiter.api.Test;
import za.co.mmagon.jwebswing.base.html.InputTextType;
import za.co.mmagon.jwebswing.base.html.Label;
import za.co.mmagon.jwebswing.base.html.Span;
import za.co.mmagon.jwebswing.plugins.textinputeffects.inputs.set1.AkiraInput;

class AkiraInputTest
{
	@Test
	public void testKyo()
	{
		AkiraInput hi = new AkiraInput(new InputTextType(), new Label(), new Span("content"));
		System.out.println(hi.toString(0));
	}
}
