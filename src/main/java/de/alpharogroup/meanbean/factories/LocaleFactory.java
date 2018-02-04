package de.alpharogroup.meanbean.factories;

import java.util.Locale;

import org.meanbean.lang.Factory;

/**
 * A factory for creating {@linkplain Locale} objects.
 */
public class LocaleFactory implements Factory<Locale>
{

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Locale create()
	{
		return Locale.CANADA;
	}
}