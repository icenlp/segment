package net.sourceforge.segment.util;

import static junit.framework.Assert.assertEquals;
import junit.framework.AssertionFailedError;

import java.util.Iterator;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: fridjon
 * Date: Mar 30, 2011
 * Time: 11:03:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class UtilsForTesting {


/**
	 * Asserts that list has given contents. Otherwise throws exception. To be
	 * used in testing.
	 *
	 * @param <T> list type
	 * @param message message to be shown if check fails
	 * @param expectedArray expected list contents
	 * @param actualList list to be checked
	 * @throws AssertionFailedError if list and array are not equal
	 */
	public static <T> void assertListEquals(String message, T[] expectedArray,
			List<T> actualList) {
		assertEquals(message, expectedArray.length, actualList.size());
		Iterator<T> actualIterator = actualList.iterator();
		for (T expected : expectedArray) {
			T actual = actualIterator.next();
			assertEquals(message, expected, actual);
		}
	}

	/**
	 * @see #assertListEquals(String, Object[], List)
	 * @param <T> list type
	 * @param expectedArray expected list contents
	 * @param actualList List to be checked
	 */
	public static <T> void assertListEquals(T[] expectedArray,
			List<T> actualList) {
		assertListEquals("", expectedArray, actualList);
	}
}

