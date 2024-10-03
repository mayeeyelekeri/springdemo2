package com.mine.springdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestUser {

	User usr; 
	String fname = "Art";
	String lname = "Vandaley"; 
	@BeforeEach
	void setUp() throws Exception {
		usr = new User(fname, lname); 
	}

	@AfterEach
	void tearDown() throws Exception {
		
	}

	@Test
	void testFirstName() {
		assertEquals(fname, usr.getFirstName()); 
	}
	
	@Test
	void testLastName() {
		assertEquals(lname, usr.getLastName()); 
	}
}
