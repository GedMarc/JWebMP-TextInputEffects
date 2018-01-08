package za.co.mmagon.jwebswing.plugins.textinputeffects;

import za.co.mmagon.jwebswing.base.references.CSSReference;
import za.co.mmagon.jwebswing.base.references.JavascriptReference;
import za.co.mmagon.jwebswing.base.servlets.enumarations.RequirementsPriority;
import za.co.mmagon.jwebswing.base.servlets.interfaces.ReferencePool;

/**
 * References for angular
 *
 * @author Marc Magon
 * @since 09 Jun 2017
 */
enum TextInputEffectsReferencePool implements ReferencePool
{
	TextInputEffectsCassie(new JavascriptReference("TextInputEffectsCassie", 1.6, "textinputeffects/js/classie.min.js"),
	                       new CSSReference("TextInputEffectsSet1", 1.0, "textinputeffects/css/set1.min.css")),
	TextInputEffectSet2(null,
	                    new CSSReference("TextInputEffectsSet2", 1.0, "textinputeffects/css/set2.min.css")
	);
	/**
	 * Any sub data
	 */
	private String data;
	private JavascriptReference javaScriptReference;
	private CSSReference cssReference;

	/**
	 * A new AngularSlimScrollReferencePool
	 */
	TextInputEffectsReferencePool()
	{

	}

	TextInputEffectsReferencePool(JavascriptReference javaScriptReference, CSSReference cssReference)
	{
		this.javaScriptReference = javaScriptReference;
		if (this.javaScriptReference != null)
		{
			this.javaScriptReference.setPriority(RequirementsPriority.Top_Shelf);
		}
		this.cssReference = cssReference;
		if (this.cssReference != null)
		{
			this.cssReference.setPriority(RequirementsPriority.DontCare);
		}
	}

	@Override
	public JavascriptReference getJavaScriptReference()
	{
		return javaScriptReference;
	}

	@Override
	public void setJavaScriptReference(JavascriptReference javaScriptReference)
	{
		this.javaScriptReference = javaScriptReference;
	}

	@Override
	public CSSReference getCssReference()
	{
		return cssReference;
	}

	@Override
	public void setCssReference(CSSReference cssReference)
	{
		this.cssReference = cssReference;
	}

	/**
	 * Returns the name or the data contained within
	 *
	 * @return
	 */
	@Override
	public String toString()
	{
		if (data != null && !data.isEmpty())
		{
			return data;
		}
		else
		{
			return name();
		}
	}
}
