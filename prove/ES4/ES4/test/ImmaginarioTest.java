package ES4.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import ES4.src.Immaginario;
import ES4.src.Immaginario.PotereNoValidException;
import ES4.src.Mazzo.MazzoVuotoException;
import ES4.src.Reale;

class ImmaginarioTest extends Exception {

	static Reale persona;
	static ArrayList<String> poteri;
	
	@BeforeAll
	static void before() {
		
		persona = new Reale("giuseppe", "pizzo", 42, "10-08-91");
        poteri = new ArrayList<String>();
        poteri.add("telepatia");
        poteri.add("invisibilità");
	}
	
	@Test
	void testCheckPoteriExc() {
		
		poteri.add("invalido");

		PotereNoValidException thrown = Assertions.assertThrows(PotereNoValidException.class, () -> {
			Immaginario mostro1 = new Immaginario("klork", "smohr", 69, persona, poteri);
		});
		
		Assertions.assertEquals("potere non valido!", thrown.getMessage());
	}

}
