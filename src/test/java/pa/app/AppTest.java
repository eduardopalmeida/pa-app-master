package pa.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

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

	public App ap;
	
	@BeforeEach 
	public void init() {
		
		ap = new App();
		
		logger.info("@BeforeEach - Runbefore Each method");
	}	
	
    @DisplayName("First Test - concat")
	@Test
	void testConcat() {
		String res = ap.concat("Hello"," world!");
		// Test concat example method
		assertEquals("Hello world!", res);
    }
    
	@Test
	void testSomar() {
		double val1 = 0.3;
		double val2 = 0.7;
		
		assertEquals(ap.somar(val1, val2), 1.0);
	}

	@Test
	void testSubtrair() {
		int val1 = 5;
		int val2 = 3;
		
		assertEquals(ap.subtrair(val1, val2), 2);
	}

	@Test
	void testDividir() {
		double val1 = 1.0;
		double val2 = 2.0;
		
		assertEquals(ap.dividir(val1, val2), 0.5);
	}

	@Test
	void testMultiplicar () {
		double val1 = 3.0;
		double val2 = 0.5;
		
		assertEquals(ap.multiplicar(val1, val2), 1.5);
	}


}
