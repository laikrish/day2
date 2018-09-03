package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Interest;

class InterestTest {

	@Test
	void testCheckInterest() {
		assertEquals(300.0,Interest.checkInterest(1000,15,2),0.02); 
	}
		void testCheckCiInterest() {
		assertEquals(322.4999999999998,Interest.checkCiInterest(1000,15,2));
	}
	}

