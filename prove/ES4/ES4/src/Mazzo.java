package ES4.src;
import java.util.ArrayList;

public class Mazzo {
    
    ArrayList<Personaggio> carte = new ArrayList<Personaggio>();
    int prezzo;
    public int totVal = 0;
    public int rapp;

    public void setMazzo(ArrayList<Personaggio> carte, int prezzo) {

        this.carte = carte;
        this.prezzo = prezzo;
    }

    public void valoreCarte() throws MazzoVuotoException {

        if(carte.isEmpty()) {

        	throw new MazzoVuotoException("il mazzo è vuoto!");
        } else {

            for(Personaggio carta: carte) {
            	System.out.println(carta);
                totVal = totVal + carta.getPunteggio();
            }
            System.out.println("il valore delle carte è: " + totVal);
        }
    }

    public void rapp() throws MazzoVuotoException {

        if(totVal == 0) {

        	throw new MazzoVuotoException("il mazzo è vuoto!");
        } else {

            rapp = totVal / prezzo;
            System.out.println("il rapporto è uguale a: " + rapp);
        }
    }
    
    public class MazzoVuotoException extends Exception {

    	public MazzoVuotoException(String message) {
    		super(message);
    	}
    }
}
