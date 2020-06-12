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

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * The unit test class for the class {@link LocalDateTimeFactory}.
 */
public class LocalDateTimeFactoryTest
{

	/**
	 * Test for method {@link LocaleFactory#create()}
	 */
	@Test public void testCreate()
	{
		LocalDateTime expected;
		LocalDateTime actual;
		LocalDateTimeFactory factory = new LocalDateTimeFactory();
		expected = LocalDateTime.now();
		actual = factory.create();
		assertEquals(actual.getYear(), expected.getYear());
		assertEquals(actual.getMonth(), expected.getMonth());
		assertEquals(actual.getDayOfMonth(), expected.getDayOfMonth());
		assertEquals(actual.getHour(), expected.getHour());
		assertEquals(actual.getMinute(), expected.getMinute());
		assertEquals(actual.getSecond(), expected.getSecond());
	}

}