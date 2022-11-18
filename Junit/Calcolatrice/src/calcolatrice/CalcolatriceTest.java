package calcolatrice;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalcolatriceTest {

	static Calcolatrice calc;
	
	@BeforeClass
	public static void beforeClass() {		// viene eseguito solo una vola prima dei metodi di test, deve essere statico
		
		System.out.println("beforeClass");
		calc = new Calcolatrice();
	}
	
	@AfterClass
	public static void afterClass() {		// viene eseguito solo una volta dopo i metodi di test, deve essere statico
		System.out.println("afterClass");
	}
	
	@Before
	public void before() {		// viene eseguito prima di ogni metodo di test
		
		System.out.println("before");
		calc.clear();
	}
	
	@After
	public void after() {		// viene eseguito dopo ogni metodo di test
		System.out.println("after");
	}
	
	@Test
	public void testAdd() {
		
		int actual = calc.add(3, 2);
		int expected = 5;
		assertEquals(expected, actual);
	}
	
	@Test 
	public void testAddLR() {
		
		calc.add(3, 2);
		int actual = calc.getLastResult();
		int expected = 5;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testDiv() {
		
		int actual = calc.div(4, 2);
		int expected = 2;
		assertEquals(expected, actual);
	}
	
	@Test(expected = ArithmeticException.class)		// "expected" indica che il metodo che si testa deve generare un'eccezione di tipo "ArithmeticException", altrimenti il test fallisce
	public void testDiv0() {
		calc.div(5, 0);
	}
	
	@Test(timeout = 100)			// "timeout" indica che se l'esecuzione del metodo che si testa impiega più tempo di quello indicato, il test fallisce
	public void testSlowMethod() {
		calc.slowMethod();
	}
}
