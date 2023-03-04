package ES4.test;


import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ES4.src.Immaginario;
import ES4.src.Immaginario.PotereNoValidException;
import ES4.src.Mazzo;
import ES4.src.Personaggio;
import ES4.src.Reale;
import ES4.src.Mazzo.MazzoVuotoException;

class MazzoTest {

	static Reale pers1;
	static ArrayList<String> poteri;
	static ArrayList<Personaggio> carte1;
	Mazzo mazzo;
	
	@BeforeAll
	static void beforeAll() throws PotereNoValidException {
		
        pers1 = new Reale("mario", "rossi", 36, "21-03-86");
        
        poteri = new ArrayList<String>();
        poteri.add("forza");
        poteri.add("telecinesi");
        
        Immaginario mostro1 = new Immaginario("klork", "smohr", 69, pers1, poteri);
        Immaginario mostro2 = new Immaginario("gnerp", "slurp", 77, pers1, poteri);
        
        carte1 = new ArrayList<Personaggio>();
        carte1.add(mostro1);
        carte1.add(mostro2);
	}
	
	@BeforeEach
	void before() {
		
        mazzo = new Mazzo();
        mazzo.setMazzo(carte1, 20);
	}
	
	@Test
	void valoreCarteTest() throws MazzoVuotoException {

		mazzo.valoreCarte();
        
        int actual = mazzo.totVal;
        int expected = 146;
        assertEquals(expected, actual);
	}

	@Test
	void valoreCarteTestExc() {
		
		MazzoVuotoException thrown = Assertions.assertThrows(MazzoVuotoException.class, () -> {
	           mazzo = new Mazzo();
	           mazzo.valoreCarte();
		});
		
		Assertions.assertEquals("il mazzo è vuoto!", thrown.getMessage());
	}
	
	@Test
	void rappTest() throws MazzoVuotoException {
		
        mazzo.valoreCarte();
        mazzo.rapp();
        
        int actual = mazzo.rapp;
        int expected = 7;
        assertEquals(expected, actual);
	}
	
	@Test
	void rappTestExc() {
		
		mazzo = new Mazzo();
		try {
			mazzo.valoreCarte();
		} catch (MazzoVuotoException e) {
			System.out.println("prima eccezione");
		}
        
		MazzoVuotoException thrown = Assertions.assertThrows(MazzoVuotoException.class, () -> {
	        mazzo.rapp();
		});
		
		Assertions.assertEquals("il mazzo è vuoto!", thrown.getMessage());
	}
}
