package ES4.src;
public class Reale extends Personaggio {

    private String dataNascita;
    
    public Reale(String nome, String cognome, int punteggio, String dataNascita) {

        super(nome, cognome, punteggio);
        this.dataNascita = dataNascita;
    }
}
