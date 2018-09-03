package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Palindrome;

class PalindromeTest {

	@Test
	void testcheckPalindrome() {
		assertEquals(true,Palindrome.checkPalindrome(121));
		assertEquals(true,Palindrome.checkPalindrome(123));
		assertEquals(true,Palindrome.checkPalindrome(-121));
		assertEquals(true,Palindrome.checkPalindrome('a'));
		assertEquals(true,Palindrome.checkPalindrome(12));
	}

}
