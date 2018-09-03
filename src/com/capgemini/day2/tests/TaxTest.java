package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Tax;

class TaxTest {

	@Test
	void testcheckTax() {
		assertEquals(0,Tax.checkTax(1000000));
		assertEquals(0,Tax.checkTax(100));
		assertEquals(30000.0, Tax.checkTax(300000));
	}

}
