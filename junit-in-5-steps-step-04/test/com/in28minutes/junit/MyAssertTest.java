package com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class MyAssertTest {

	List<String> todos = Arrays.asList("AWS","Azure","DevOps");
	
	@Test
	void test() {
		
		boolean test = todos.contains("AWS");
		boolean test2 = todos.contains("GCP");
		
		//assertEquals(true,test);
		//assertTrue(test);
		assertTrue(test,"Something Went Wront");
		assertFalse(test2);
		//assertNull, assertNotNull
		assertArrayEquals(new int[] {1,2},new int[] {2,2});
		
		assertEquals(3,todos.size(),"Error Message");
	}

}
