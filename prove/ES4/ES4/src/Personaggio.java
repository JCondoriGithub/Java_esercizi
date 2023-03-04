package ES4.src;
public class Personaggio {
    
    String nome;
    String cognome;
    int punteggio;

    Personaggio(String nome, String cognome, int punteggio) {

        this.nome = nome;
        this.cognome = cognome;
        this.punteggio = punteggio;
    }

    int getPunteggio() {
        return punteggio;
    }
}
