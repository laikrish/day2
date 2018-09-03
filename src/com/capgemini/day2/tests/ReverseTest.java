package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Reverse;

class ReverseTest {

	@Test
	void testCheckReverse() {
		assertEquals("anhsirk",Reverse.checkReverse("krishna"));
		assertEquals("nahsirk",Reverse.checkReverse("krishna"));
		assertEquals("anhsirk",Reverse.checkReverse("krishma"));
	}

}
