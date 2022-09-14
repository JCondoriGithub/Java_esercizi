public class Personaggio {
    
    private String nome;
    private String cognome;
    private int punteggio;

    Personaggio(String nome, String cognome, int punteggio) {

        this.nome = nome;
        this.cognome = cognome;
        this.punteggio = punteggio;
    }

    int getPunteggio() {
        return punteggio;
    }
}
