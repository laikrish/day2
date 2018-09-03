package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Username;

class UsernameTest {

	@Test
	void testcheckScreen() {
		assertEquals("welcome",Username.checkScreen("krishna","capgemini"));
	}

}
