package com.jwebmp.plugins.textinputeffects.inputs;

import com.jwebmp.core.base.html.Label;
import com.jwebmp.core.base.html.Span;
import com.jwebmp.core.base.html.inputs.InputTextType;
import com.jwebmp.plugins.textinputeffects.inputs.set2.YoshikoSet2Input;
import org.junit.jupiter.api.Test;

class YoshikoInputTest
{
	@Test
	public void testYoshiko()
	{
		YoshikoSet2Input hi = new YoshikoSet2Input(new InputTextType(), new Label(), new Span("content"));
		System.out.println(hi.toString(0));
	}
}
