import java.util.ArrayList;

public class Immaginario extends Personaggio {
    
    private Reale inventore;
    private ArrayList<String> superpoteri = new ArrayList<String>();

    Immaginario(String nome, String cognome, int punteggio, Reale inventore, ArrayList<String> superpoteri) {

        super(nome, cognome, punteggio);
        this.superpoteri = superpoteri;
        this.inventore = inventore;
        this.superpoteri = superpoteri;

        checkPoteri(superpoteri);
    }

    void checkPoteri(ArrayList<String> superpoteri) {

        for(String potere: superpoteri) {

            if(potere.equals("forza") || potere.equals("invisibilità") || potere.equals("telepatia") || potere.equals("telecinesi")){
            } else {
            System.out.println("errore: potere non valido!");
            }
        }
    }
}
