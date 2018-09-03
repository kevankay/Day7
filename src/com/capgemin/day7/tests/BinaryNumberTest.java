package com.capgemin.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

import com.capgemin.day7.BinaryInteger;

class BinaryNumberTest {

	@Test
	void testBinaryInteger() {
		File file = new File("C:\\uploads\\Car.java");
		assertEquals(1,BinaryInteger.writeBinary(file));
	}

}

	
