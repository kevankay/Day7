package com.capgemin.day7.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.capgemin.day7.LineCount;

class FileLineCountTest {

	@Test
	void testLineCount() throws IOException {
		
			
		assertEquals(72,LineCount.countLines("C:\\uploads\\Car.java"));
	}
}

