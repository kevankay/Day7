package com.capgemin.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

class FileExistTest {

	@Test
	void testFileExistance() {
		File file = new File("C:\\uploads\\example.docx");
		assertEquals(true, file.exists());
		
	}

}
