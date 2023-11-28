package test.java.assignment.com.file;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import main.java.assignment.com.file.EnrichInputProcessFile;


public class EnrichInputProcessFileTest {
	
	EnrichInputProcessFile underTest =  new EnrichInputProcessFile();
	
	@Test
	public void testProcessInputFile() {
		assertNotNull(underTest.processInputFile("src/test/resources/input.txt"));
	}
}



