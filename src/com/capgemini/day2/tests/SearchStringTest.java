package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.SearchString;

class SearchStringTest {

	@Test
	void testsearchString() {
		assertEquals(4,SearchString.checkString("veni"));
	}

}
