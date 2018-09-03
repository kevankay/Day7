package com.capgemin.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

import com.capgemin.day7.Grep;

class GrepTest {

	@Test
	void testGrepApp() {
		File file=new File("C:\\uploads\\Car.java");
		assertEquals(true,Grep.stringSearch(file,"java"));

	}

}
	

