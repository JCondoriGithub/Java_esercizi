import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.Test;

class MastermindTest {

	static Mastermind game;
	
	@BeforeAll
	static void beforeClass() {
		game = new Mastermind();
	}
	
	@Test
	void testGenerateCode() {

		game.generateCode();
		
		int expected = 4;
		assertEquals(expected, game.codice.length);
		assertEquals(expected, game.newCodice.length);
		
		Class arr = game.codice.getClass();
		Class type = arr.getComponentType();
		assertEquals(int.class, type);
		
		Class arr2 = game.newCodice.getClass();
		Class type2 = arr2.getComponentType();
		assertEquals(int.class, type2);
	}

	
}
