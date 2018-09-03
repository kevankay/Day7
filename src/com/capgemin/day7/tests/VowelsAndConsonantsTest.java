package com.capgemin.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.capgemin.day7.VowelsAndConsonants;

class VowelsAndConsonantsTest {

	@Test
	void testVowelsAndConsonants() throws IOException {
			File file = new File("C:\\uploads\\car.java");
					

			assertEquals("Number of vowels = 15\nNumber of consonants = 23", VowelsAndConsonants.findVowelAndConsonant(file));
		}
}


