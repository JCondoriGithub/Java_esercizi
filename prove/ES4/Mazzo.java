import java.util.ArrayList;

public class Mazzo {
    
    private ArrayList<Personaggio> carte = new ArrayList<Personaggio>();
    private int prezzo;
    int totVal = 0;

    void setMazzo(ArrayList<Personaggio> carte, int prezzo) {

        this.carte = carte;
        this.prezzo = prezzo;
    }

    void valoreCarte() {

        if(carte.isEmpty()) {

            System.out.println("Mazzo vuoto");
        } else {

            for(Personaggio carta: carte) {

                totVal = totVal + carta.getPunteggio();
            }
            System.out.println("il valore delle carte è: " + totVal);
        }
    }

    void rapp() {

        if(totVal == 0) {

            System.out.println("Mazzo vuoto");
        } else {

            int rapp = totVal / prezzo;
            System.out.println("il rapporto è uguale a: " + rapp);
        }
    }
}
