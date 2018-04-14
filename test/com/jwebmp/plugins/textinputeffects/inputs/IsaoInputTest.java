package com.jwebmp.plugins.textinputeffects.inputs;

import com.jwebmp.base.html.Label;
import com.jwebmp.base.html.Span;
import com.jwebmp.base.html.inputs.InputTextType;
import com.jwebmp.plugins.textinputeffects.inputs.set1.IsaoInput;
import org.junit.jupiter.api.Test;

class IsaoInputTest
{
	@Test
	public void testIsao()
	{
		IsaoInput hi = new IsaoInput(new InputTextType(), new Label(), new Span("content"));
		System.out.println(hi.toString(0));
	}
}
