package com.jwebmp.plugins.textinputeffects.inputs;

import com.jwebmp.core.base.html.Label;
import com.jwebmp.core.base.html.Span;
import com.jwebmp.core.base.html.inputs.InputTextType;
import com.jwebmp.plugins.textinputeffects.inputs.set2.NarikoSet2Input;
import org.junit.jupiter.api.Test;

class NarikoInputTest
{
	@Test
	public void testNariko()
	{
		NarikoSet2Input hi = new NarikoSet2Input(new InputTextType(), new Label(), new Span("content"));
		System.out.println(hi.toString(0));
	}
}
