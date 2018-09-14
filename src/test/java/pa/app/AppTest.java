package pa.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.logging.Logger;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Unit test for Maven JUnit 5
 * @author  Eduardo Almeida
 * @version 1.0
 */
public class AppTest 
{
	private static final Logger logger = Logger.getLogger(AppTest.class.getName());

	@BeforeEach 
	public void init() {
		logger.info("@BeforeEach - Runbefore Each method");
	}	
	
    @DisplayName("First Test - concat")
	@Test
	void testConcat() {
		App ap = new App();
		String res = ap.concat("Hello"," world!");
		// Test concat example method
		assertEquals("Hello world!", res);
	}	
}
