package za.co.mmagon.jwebswing.plugins.textinputeffects.inputs;

import org.junit.jupiter.api.Test;
import za.co.mmagon.jwebswing.base.html.InputTextType;
import za.co.mmagon.jwebswing.base.html.Label;
import za.co.mmagon.jwebswing.base.html.Span;
import za.co.mmagon.jwebswing.plugins.textinputeffects.inputs.set2.KozakuraSet2Input;

class KozakuraInputTest
{
	@Test
	public void testKyo()
	{
		KozakuraSet2Input hi = new KozakuraSet2Input(new InputTextType(), new Label(), new Span("content"));
		System.out.println(hi.toString(0));
	}
}
