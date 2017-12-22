package za.co.mmagon.jwebswing.plugins.textinputeffects.inputs;

import org.junit.jupiter.api.Test;
import za.co.mmagon.jwebswing.base.html.InputTextType;
import za.co.mmagon.jwebswing.base.html.Label;
import za.co.mmagon.jwebswing.base.html.Span;
import za.co.mmagon.jwebswing.plugins.textinputeffects.inputs.set2.SaeSet2Input;

class SaeInputTest
{
	@Test
	public void testKyo()
	{
		SaeSet2Input hi = new SaeSet2Input(new InputTextType(), new Label(), new Span("content"));
		System.out.println(hi.toString(0));
	}
}
