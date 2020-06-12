/**
 * The MIT License
 * <p>
 * Copyright (C) 2015 Asterios Raptis
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package de.alpharogroup.meanbean.factories;

import de.alpharogroup.collections.array.ArrayFactory;
import de.alpharogroup.collections.list.ListFactory;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * The unit test class for the class {@link ListStringArrayFactory}.
 */
public class ListStringArrayFactoryTest
{

	/**
	 * Test method for {@link ListStringArrayFactory#create()}.
	 */
	@Test public final void testCreate()
	{
		String actual;
		String expected;
		List<String[]> expectedList;
		List<String[]> actualList;
		List<String[]> lines;
		String[] lineOne;
		String[] lineTwo;
		String[] lineThree;
		lineOne = ArrayFactory.newArray("John", "23", "male");
		lineTwo = ArrayFactory.newArray("Jim", "25", "male");
		lineThree = ArrayFactory.newArray("Mary", "21", "female");
		lines = ListFactory.newArrayList(lineOne, lineTwo, lineThree);

		ListStringArrayFactory factory = new ListStringArrayFactory();
		expectedList = lines;
		actualList = factory.create();
		for (int j = 0; j < actualList.size(); j++)
		{
			String[] actualStringArray = actualList.get(j);
			String[] expectedStringArray = expectedList.get(j);
			for (int i = 0; i < actualStringArray.length; i++)
			{
				expected = actualStringArray[i];
				actual = expectedStringArray[i];
				assertEquals(expected, actual);
			}
		}
	}

}
