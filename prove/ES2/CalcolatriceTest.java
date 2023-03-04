import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class CalcolatriceTest {
	
	static HashMap<String, Double> amb;
	Calcolatrice calc;
	
	@BeforeClass
	public static void beforeClass() {
		
		amb = new HashMap<String, Double>();
		amb.put("x", (double) 4);
		amb.put("y", (double) 6);
	}
	
	@Test
	void testSomma() {
		
		calc = new Calcolatrice("xy+", amb);
		
        calc.stack.push((double) 4);
        calc.stack.push((double) 6);
		
		calc.somma();
		Double actual = calc.stack.pop();
		Double expected = 10.0;
		assertEquals(expected, actual);
	}

	@Test
	void testSottrazione() {

		calc = new Calcolatrice("xy-", amb);

        calc.stack.push((double) 6);
        calc.stack.push((double) 4);
        
        calc.sottrazione();
		Double actual = calc.stack.pop();
		Double expected = 2.0;
		assertEquals(expected, actual);
	}

	@Test
	void testMoltiplicazione() {
		
		calc = new Calcolatrice("xy*", amb);
		
		calc.stack.push((double) 6);
		calc.stack.push((double) 4);

		calc.moltiplicazione();
		Double actual = calc.stack.pop();
		Double expected = 24.0;
		assertEquals(expected, actual);
	}
	
	@Test
	void testDivisione() {
		
		calc = new Calcolatrice("xy/", amb);
		
		calc.stack.push((double) 6);
		calc.stack.push((double) 4);

		calc.divisione();
		Double actual = calc.stack.pop();
		Double expected = 1.5;
		assertEquals(expected, actual);
	}
}
