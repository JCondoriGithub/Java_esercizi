package calcolatrice;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcolatriceTest {

/*	@Test
	public void test() {
		fail("Not yet implemented");	// se si invoca il metodo "fail", automaticamente il test fallisce
	}
*/

	@Test	// si indica che questo è un metodo di test
	public void testSomma() {
		
		int risultato = Calcolatrice.somma(2, 3);
		int risultatoPrevisto = 5;
		assertEquals(risultatoPrevisto, risultato);		// si verifica che le variabili siano uguali
	}
	
	@Test
	public void testSottrazione() {
		
		int actual = Calcolatrice.sottrazione(3, 2);
		int expected = 1;
		assertEquals(expected, actual);
	}
}
