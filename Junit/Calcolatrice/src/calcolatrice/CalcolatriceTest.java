package calcolatrice;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalcolatriceTest {

	Calcolatrice calc;
	
	@Before
	public void before() {		// viene eseguito prima di ogni metodo di test
		
		System.out.println("before");
		calc = new Calcolatrice();
	}
	
	@After
	public void after() {		// viene eseguito dopo ogni metodo di test
		System.out.println("after");
		calc.clear();
	}
	
	@Test
	public void testAdd() {
		
		int actual = calc.add(3, 2);
		int expected = 5;
		assertEquals(expected, actual);
	}
	
	@Test public void testAddLR() {
		
		calc.add(3, 2);
		int actual = calc.getLastResult();
		int expected = 5;
		assertEquals(expected, actual);
	}
}
