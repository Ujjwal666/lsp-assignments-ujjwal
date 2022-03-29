package org.howard.edu.lsp.assignment6.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.howard.edu.lsp.assignment6.integerset.IntegerSet;
import org.howard.edu.lsp.hw4.IntegerSetException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IntegerSetTest {
	@Test
	@DisplayName("Test cases for length")
	public void testLength() {
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		
		IntegerSet set2 = new IntegerSet();
		set2.add(1);
		set2.add(2);
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		set2.add(7);
		set2.add(8);
		set2.add(9);
		
		
		IntegerSet set3 = new IntegerSet();
		set3.add(1);
		set3.add(2);
		set3.add(3);
		set3.add(4);
		set3.add(5);
		set3.add(6);

		IntegerSet set4 = new IntegerSet();
		
		assertEquals("error in length()",  5, set1.length());
		assertEquals("error in length()",  9, set2.length());
		assertEquals("error in length()",  6, set3.length());
		assertEquals("error in length()",  0, set4.length());
		assertNotEquals("error in length()",  20, set4.length());
	}
	
	@Test
	@DisplayName("Test cases for toString")
	public void testToString() {
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		set1.add(6);
		set1.add(7);
		
		IntegerSet set2 = new IntegerSet();
		set2.add(1);
		set2.add(2);
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		set2.add(7);
		set2.add(8);
		set2.add(9);
		
		
		IntegerSet set3 = new IntegerSet();
		set3.add(1);
		set3.add(2);
		set3.add(3);
		set3.add(4);
		set3.add(5);
		set3.add(6);
		set3.add(7);

		IntegerSet set4 = new IntegerSet();
    	
		assertNotEquals("error in toString()",  "2 3 4 5 6 7 8 9", set2.toString());
		assertNotEquals("error in toString()",  "", set3.toString());
		assertEquals("error in toString()",  "", set4.toString());
	}
	
	@Test
	@DisplayName("Test cases for equals")
	public void testEquals() {
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		set1.add(6);
		set1.add(7);
		
		IntegerSet set2 = new IntegerSet();
		set2.add(1);
		set2.add(2);
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		set2.add(7);
		set2.add(8);
		set2.add(9);
		
		
		IntegerSet set3 = new IntegerSet();
		set3.add(1);
		set3.add(2);
		set3.add(3);
		set3.add(4);
		set3.add(5);
		set3.add(6);
		set3.add(7);

		IntegerSet set4 = new IntegerSet();
    	
		assertEquals("error in equals()",  true, set1.equals(set3));
		assertEquals("error in equals()",  false, set3.equals(set2));
		assertEquals("error in equals()",  false, set4.equals(set3));

	}
	
	@Test
	@DisplayName("Test cases for largest")
	public void testLargest() throws IntegerSetException {
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		set1.add(6);
		
		IntegerSet set2 = new IntegerSet();
		set2.add(1);
		set2.add(2);
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		set2.add(7);
		set2.add(8);
		set2.add(9);
		
		
		IntegerSet set3 = new IntegerSet();
		set3.add(1);
		set3.add(2);
		set3.add(3);
		set3.add(4);
		set3.add(5);
		set3.add(6);
		set3.add(7);
    	
		assertEquals("error in largest()",  6, set1.largest());
		assertEquals("error in largest()",  9, set2.largest());
		assertEquals("error in largest()",  7, set3.largest());
		
	}
	
	@Test
	@DisplayName("testLargest throws exception")
	public void testLargest_THROWS_EXCEPTION() {
		IntegerSet set1 = new IntegerSet();
		Exception exception = assertThrows(IntegerSetException.class, ()->{
			set1.largest();
		});
		String expectedMessage = "The set is Empty.";
		String actualMessage = exception.getMessage();
		
		assertTrue(actualMessage.contains(expectedMessage));
	}
	
	
	@Test
	@DisplayName("Test cases for smallest")
	public void testSmallest() throws IntegerSetException {
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		set1.add(6);
		set1.add(7);
		
		IntegerSet set2 = new IntegerSet();
		set2.add(5);
		set2.add(6);
		set2.add(7);
		set2.add(8);
		set2.add(9);
		
		
		IntegerSet set3 = new IntegerSet();
		set3.add(2);
		set3.add(3);
		set3.add(4);
		set3.add(5);
		set3.add(6);
		set3.add(7);
    	
		assertEquals("error in smallest()",  1, set1.smallest());
		assertEquals("error in smallest()",  5, set2.smallest());
		assertEquals("error in smallest()",  2, set3.smallest());
		
	}
	
	@Test
	@DisplayName("testSmallest throws exception")
	public void testSmallest_THROWS_EXCEPTION() {
		IntegerSet set1 = new IntegerSet();
		Exception exception = assertThrows(IntegerSetException.class, ()->{
			set1.smallest();
		});
		String expectedMessage = "The set is Empty.";
		String actualMessage = exception.getMessage();
		
		assertTrue(actualMessage.contains(expectedMessage));
	}
	
	@Test
	@DisplayName("Test cases for isEmpty")
	public void testIsEmpty() {
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		
		IntegerSet set2 = new IntegerSet();
		set2.add(1);
		set2.add(2);
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		set2.add(7);
		set2.add(8);
		set2.add(9);
		
		
		IntegerSet set3 = new IntegerSet();
		set3.add(1);
		set3.add(2);
		set3.add(3);
		set3.add(4);
		set3.add(5);
		set3.add(6);

		IntegerSet set4 = new IntegerSet();
    	
		assertEquals("error in isEmpty()",  false, set1.isEmpty());
		assertEquals("error in isEmpty()",  false, set2.isEmpty());
		assertEquals("error in isEmpty()",  false, set3.isEmpty());
		assertEquals("error in isEmpty()",  true, set4.isEmpty());
		
	}
	
	@Test
	@DisplayName("Test cases for contains")
	public void testContains() {
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		set1.add(6);
		set1.add(7);
		
		IntegerSet set2 = new IntegerSet();
		set2.add(1);
		set2.add(2);
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		set2.add(7);
		set2.add(8);
		set2.add(9);
		
		
		IntegerSet set3 = new IntegerSet();
		set3.add(1);
		set3.add(2);
		set3.add(3);
		set3.add(4);
		set3.add(5);
		set3.add(6);

		IntegerSet set4 = new IntegerSet();
    	
		assertEquals("error in contains()",  false, set1.contains(8));
		assertEquals("error in contains()",  true, set2.contains(1));
		assertEquals("error in contains()",  true, set3.contains(4));
		assertEquals("error in contains()",  false, set4.contains(5));
		
	}
	
	@Test
	@DisplayName("Test cases for add")
	public void testAdd() {
		
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		set1.add(6);
		
		IntegerSet set2 = new IntegerSet();

		set2.add(2);
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		set2.add(7);
		set2.add(8);

		
		
		IntegerSet set3 = new IntegerSet();
		set3.add(1);
		set3.add(2);
		set3.add(3);
		set3.add(4);
		set3.add(5);
		set3.add(6);
		set3.add(7);

		IntegerSet set4 = new IntegerSet();
		
		set2.add(1);
		set3.add(8);
		
		assertEquals("error in add()",  true, set2.contains(1));
		assertEquals("error in add()",  true, set3.contains(8));
		assertEquals("error in add()",  false, set4.contains(5));
		
	}
	
	@Test
	@DisplayName("Test cases for remove")
	public void testRemove() throws IntegerSetException {
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		set1.add(6);
		
		set1.remove(2);
		
		assertEquals("error in remove()",  false, set1.contains(2));

	}
	@Test
	@DisplayName("testRemove throws exception")
	public void testRemove_THROWS_EXCEPTION() {
		IntegerSet set1 = new IntegerSet();
		Exception exception = assertThrows(IntegerSetException.class, ()->{
			set1.remove(1);
		});
		String expectedMessage = "The set is Empty.";
		String actualMessage = exception.getMessage();
		
		assertTrue(actualMessage.contains(expectedMessage));
	}
	
	@Test
	@DisplayName("Test cases for clear")
	public void testClear() {
		
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		
		IntegerSet set2 = new IntegerSet();
		set2.add(1);
		set2.add(2);
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		set2.add(7);
		set2.add(8);
		
		IntegerSet set3 = new IntegerSet();
		set3.add(1);
		set3.add(2);
		set3.add(3);
		set3.add(4);
		set3.add(5);

		IntegerSet set4 = new IntegerSet();
		
    	set2.clear();
		set4.clear();
		
		assertEquals("error in clear()",  true, set2.isEmpty());
		assertEquals("error in clear()",  false, set1.isEmpty());
	}
	
	@Test
	@DisplayName("Test cases for union")
	public void testUnion() {
		
		IntegerSet set1 = new IntegerSet();
		
		IntegerSet set2 = new IntegerSet();
		set2.add(1);
		set2.add(2);
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		set2.add(7);
		set2.add(8);
		
		IntegerSet set3 = new IntegerSet();
		set3.add(1);
		set3.add(2);
		set3.add(3);
		set3.add(4);
		set3.add(5);
		set3.add(6);
		set3.add(7);
		
		IntegerSet set4 = new IntegerSet();
    	
    	set3.union(set2);
    	set4.union(set1);

    	assertEquals("error in union()",  "12345678", set3.toString());
    	assertEquals("error in union()",  "", set4.toString()); ///######################
	}
	
	@Test
	@DisplayName("Test cases for intersect")
	public void testIntersect() {
		
		IntegerSet set1 = new IntegerSet();
		
		IntegerSet set2 = new IntegerSet();
		set2.add(1);
		set2.add(2);
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		set2.add(7);
		set2.add(8);
		
		IntegerSet set3 = new IntegerSet();
		set3.add(1);
		set3.add(2);
		set3.add(3);
		set3.add(4);
		set3.add(5);
		set3.add(6);
		
		IntegerSet set4 = new IntegerSet();
    	
    	set3.intersect(set2);
    	set4.intersect(set1);

    	assertEquals("error in intersect()",  "123456", set3.toString());
    	assertEquals("error in intersect()",  "", set4.toString());
	}
	
	@Test
	@DisplayName("Test cases for diff")
	public void testDiff() {
		
		IntegerSet set1 = new IntegerSet();
		
		IntegerSet set2 = new IntegerSet();
		set2.add(1);
		set2.add(2);
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		set2.add(7);
		set2.add(8);
		
		IntegerSet set3 = new IntegerSet();
		set3.add(1);
		set3.add(2);
		set3.add(3);
		set3.add(4);
		set3.add(5);
		set3.add(6);
		set3.add(7);
		
		IntegerSet set4 = new IntegerSet();
    	
    	set2.diff(set3);
    	set4.diff(set1);

    	assertEquals("error in diff()",  "8", set2.toString());
    	assertEquals("error in diff()",  "", set4.toString());
	}
}
