package pa.app;

import java.util.logging.Logger;

/**
 * Maven JUnit 5
 * @author  Eduardo Almeida
 * @version 1.0
 *
 */
public class App 
{
	public double somar(double val1, double val2) {
		return val1 + val2;
	}
	
	public double subtrair(double val1, double val2) {
		return val1 - val2;
	}
	
	public double dividir(double val1, double val2) {
		return val1 / val2;
	}
	
	public double multiplicar(double val1, double val2) {
		return val1 * val2;
	}
	
	
	
	
	private static final Logger logger = Logger.getLogger(App.class.getName());
    public static void main( String[] args )
    {
        logger.info("Maven JUnit 5 - Hello World!" );
    }
	
	// String concatenation method example
	String concat(String s1, String s2) {
		return s1+s2;
	}
}
