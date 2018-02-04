package de.alpharogroup.meanbean.factories;

import java.io.File;

import org.meanbean.lang.Factory;

public class FileFactory implements Factory<File>
{
	@Override
	public File create()
	{
		return new File(".");
	}
}