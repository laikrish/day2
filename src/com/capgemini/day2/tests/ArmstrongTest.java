package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Armstrong;

class ArmstrongTest {

	@Test
	void testCheckArmstrong() {
		assertEquals(true,Armstrong.CheckArmstrong(153));
		assertEquals(false,Armstrong.CheckArmstrong(370));
	assertEquals(true,Armstrong.CheckArmstrong(371));
	}

}
