package com.jwebmp.plugins.textinputeffects.inputs;

import com.jwebmp.core.base.html.Label;
import com.jwebmp.core.base.html.Span;
import com.jwebmp.core.base.html.inputs.InputTextType;
import com.jwebmp.plugins.textinputeffects.inputs.set1.IchiroInput;
import org.junit.jupiter.api.Test;

class IchiroInputTest
{
	@Test
	public void testKyo()
	{
		IchiroInput hi = new IchiroInput(new InputTextType(), new Label(), new Span("content"));
		System.out.println(hi.toString(0));
	}
}
