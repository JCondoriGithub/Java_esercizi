package ES4.src;
import java.util.ArrayList;

import ES4.src.Immaginario.PotereNoValidException;
import ES4.src.Mazzo.MazzoVuotoException;

public class Main {

    public static void main(String[] args) {
        
        Reale persona1 = new Reale("mario", "rossi", 36, "21-03-86");
        Reale persona2 = new Reale("giuseppe", "pizzo", 42, "10-08-91");

        ArrayList<String> poteri = new ArrayList<String>();
        poteri.add("forza");
        poteri.add("telecinesi");

        ArrayList<String> poteri2 = new ArrayList<String>();
        poteri2.add("telepatia");
        poteri2.add("invisibilità");
		poteri2.add("boh");

        Immaginario mostro1 = null;
		try {
			mostro1 = new Immaginario("klork", "smohr", 69, persona1, poteri);
		} catch (PotereNoValidException e1) {
			e1.printStackTrace();
		}
		
        Immaginario mostro2 = null;
		try {
	        mostro2 = new Immaginario("gnerp", "slurp", 77, persona1, poteri2);
		} catch (PotereNoValidException e1) {
			e1.printStackTrace();
		}
		
		Immaginario mostro3 = null;
		try {
	        mostro3 = new Immaginario("spong", "lerch", 77, persona1, poteri2);
		} catch (PotereNoValidException e1) {
			e1.printStackTrace();
		}
		
        ArrayList<Personaggio> carte1 = new ArrayList<Personaggio>();
        carte1.add(mostro1);
        carte1.add(mostro2);
        carte1.add(mostro3);
        carte1.add(persona2);


        Mazzo mazzo1 = new Mazzo();
        mazzo1.setMazzo(carte1, 20);
        
        try {
			mazzo1.valoreCarte();
	        mazzo1.rapp();
		} catch (MazzoVuotoException e) {
			System.out.println(e.getMessage());
		}

        Mazzo mazzo2 = new Mazzo();
        
        try {
			mazzo1.valoreCarte();
	        mazzo2.rapp();
		} catch (MazzoVuotoException e) {
			System.out.println(e.getMessage());
		}
    }
}