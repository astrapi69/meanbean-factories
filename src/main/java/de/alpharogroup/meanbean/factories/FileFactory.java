package de.alpharogroup.meanbean.factories;

import java.io.File;

import org.meanbean.lang.Factory;

/**
 * A factory for creating {@linkplain File} objects.
 */
public class FileFactory implements Factory<File>
{

	/**
	 * {@inheritDoc}
	 */
	@Override
	public File create()
	{
		return new File(".");
	}
}