/**
 * The MIT License
 *
 * Copyright (C) 2015 Asterios Raptis
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package io.github.astrapi69.meanbean.extension;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

/**
 * Test class for {@link MeanBeanExtensions}
 */
public class MeanBeanExtensionsTest
{

	/**
	 * Test method for {@link MeanBeanExtensions#testWithBeanTester(Class)}
	 */
	@Test
	void testTestWithBeanTester()
	{
		MeanBeanExtensions.testWithBeanTester(SampleBean.class);
	}

	/**
	 * Test method for {@link MeanBeanExtensions#testWithHashCodeMethodTester(Class)}
	 */
	@Test
	void testTestWithHashCodeMethodTester()
	{
		MeanBeanExtensions.testWithHashCodeMethodTester(SampleBean.class);
	}

	/**
	 * Test method for {@link MeanBeanExtensions#testWithEqualsMethodTester(Class, String...)}
	 */
	@Test
	void testTestWithEqualsMethodTester()
	{
		MeanBeanExtensions.testWithEqualsMethodTester(SampleBean.class);
	}

	/**
	 * Test method for {@link MeanBeanExtensions#testWithAllTester(Class, String...)}
	 */
	@Test
	void testTestWithAllTester()
	{
		MeanBeanExtensions.testWithAllTester(SampleBean.class);
	}

	/**
	 * Parameterized test method for {@link MeanBeanExtensions#testWithAllTester(Class, String...)}
	 *
	 * @param className
	 *            The name of the bean class to be tested
	 */
	@ParameterizedTest
	@CsvFileSource(resources = "/bean-classes.csv", numLinesToSkip = 1)
	void testTestWithAllTesterParameterized(String className) throws ClassNotFoundException
	{
		Class<?> beanClass = Class.forName(className);
		MeanBeanExtensions.testWithAllTester(beanClass);
	}
}
