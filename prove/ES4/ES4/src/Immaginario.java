package ES4.src;
import java.util.ArrayList;

public class Immaginario extends Personaggio {
    
    private Reale inventore;
    private ArrayList<String> superpoteri = new ArrayList<String>();

    public Immaginario(String nome, String cognome, int punteggio, Reale inventore, ArrayList<String> superpoteri) throws PotereNoValidException {

        super(nome, cognome, punteggio);
        this.inventore = inventore;
        this.superpoteri = superpoteri;

        checkPoteri(superpoteri);
    }

    void checkPoteri(ArrayList<String> superpoteri) throws PotereNoValidException {

        for(String potere: superpoteri) {

            if(potere.equals("forza") || potere.equals("invisibilità") || potere.equals("telepatia") || potere.equals("telecinesi")){
            } else {
            	throw new PotereNoValidException("potere non valido!");
            }
        }
    }
    
    public class PotereNoValidException extends Exception {
    	
    	public PotereNoValidException(String message) {
    		super(message);
    	}
    }
}
