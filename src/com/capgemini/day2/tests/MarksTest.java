package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Marks;

class MarksTest {

	@Test
	void testCheckMarks() {
		assertEquals("passed", Marks.CheckMarks(61,61,61));
	}
	@Test
	void testCheckMarks1() {
		assertEquals("promoted", Marks.CheckMarks1(65,65,54));
	}
	@Test
	void testCheckMarks2() {
		assertEquals("failed", Marks.CheckMarks2(42,55,44));
	}
}


