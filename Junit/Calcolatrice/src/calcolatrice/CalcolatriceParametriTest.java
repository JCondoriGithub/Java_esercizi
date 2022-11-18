package calcolatrice;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)	// si esegue la classe di test con il runner "Parameterized.class" che si occupa di eseguire i test parametrizzati
public class CalcolatriceParametriTest {
	
	@Parameters
	public static Iterable<Object[]> getData() {	// il runner invoca il metodo annotato con @Parameters che deve essere public e static e che ritorni un oggetto di tipo "Iterable", il quale contenga arrays di oggetti
		
		List<Object[]> obj = new ArrayList<>();		// il runner estrae gli elementi dell'oggetto iterabile "obj"
		obj.add(new Object[] {3, 1, 4});
		obj.add(new Object[] {2, 3, 5});
		obj.add(new Object[] {3, 3, 6});	// si dichiarano gli array di oggetti che contengono i valori tra {}
		
		return obj;
	}
	
	private int a;
	private int b;
	private int expected;

	public CalcolatriceParametriTest(int a, int b, int expected) {		// per ogni array contenuto in "obj", il runner invoca il costruttore inserendo negli attributi i valori presi dall'array corrente 
		
		this.a = a;
		this.b = b;
		this.expected = expected;
	}
	
	@Test
	public void testAdd() {		// il runner esegue tutti i metodi di test
		
		Calcolatrice calc = new Calcolatrice();
		int result = calc.add(a, b);
		assertEquals(expected, result);
	}
}
