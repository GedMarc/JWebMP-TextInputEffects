package za.co.mmagon.jwebswing.plugins.textinputeffects.inputs;

import org.junit.jupiter.api.Test;
import za.co.mmagon.jwebswing.base.html.Label;
import za.co.mmagon.jwebswing.base.html.Span;
import za.co.mmagon.jwebswing.base.html.inputs.InputTextType;
import za.co.mmagon.jwebswing.plugins.textinputeffects.inputs.set2.FumiSet2Input;

class FumiInputTest
{
	@Test
	public void testKyo()
	{
		FumiSet2Input hi = new FumiSet2Input(new InputTextType(), new Label(), new Span("content"));
		System.out.println(hi.toString(0));
	}
}
