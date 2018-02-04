package de.alpharogroup.meanbean.factories;

import org.meanbean.lang.Factory;

/**
 * A factory for creating {@linkplain String} array objects.
 */
public class StringArrayFactory implements Factory<String[]>
{

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String[] create()
	{
		return new String[] { "foo", "bar", "john", "doe" };
	}
}