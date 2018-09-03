package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Discount;

class DiscountTest {

	@Test
	void testCheckDprice() {
		
		assertEquals(900,Discount.CheckDprice(1000,10));
		assertEquals(900,Discount.CheckDprice(1000,-10));
		assertEquals(900,Discount.CheckDprice(1000,100));
	}

}
