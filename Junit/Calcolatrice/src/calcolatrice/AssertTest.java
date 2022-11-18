package calcolatrice;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssertTest {

	@Test
	public void test() {

	/*	
	 * assertEquals(long expected, long actual); -> si confrontano numeri non decimali
	 * assertEquals(Object expected, Object actual); -> si confrontano oggetti, tramite il loro metodo "equals"
	 * 
	 * assertEquals(double expected, double actual, double delta); ->  si confrontano numeri double, il test non fallisce se la differenza è minore di "delta", altrimenti fallisce. Vi è anche la versione float
	 * assertEquals(String message, long expected, long actual); -> stampa su console "message" se il test fallisce. Vi sono anche le versioni: object, double, float
	 * 
	 * assertArrayEquals(long[]expected, long[] actual); -> si confrontano arrays di numeri non decimali, anche la loro posizione. Vi sono anche le versioni: boolean, byte, char, short, int, double, float, object
	 * assertArrayEquals(String message, long[]expected, long[] actual); -> vi sono anche le versioni: boolean, byte, char, short, int, double, float, object
	 * 
	 * assertFalse(boolean condition); -> il test fallisce se "condition" è true. Vi è anche la versione assertTrue
	 * 
	 * assertNotEquals(long expected, long actual); -> il test fallisce se le due variabili sono uguali. E' disponibile anche in differenti vesioni
	 * 
	 * assertNotNull(Object obj); -> il test fallisce se l'oggetto è null, vi è anche la versione con il parametro "messagge" e assertNull
	 * 
	 * assertSame(Object expected, Object actual); -> il test fallisce se i 2 oggetti non sono esattamente lo stesso oggetto, vi è anche la versione con il parametro "messagge" assertNotSame
	*/
	}

}
