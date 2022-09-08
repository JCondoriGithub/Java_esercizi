package ES1;

public class Main {
    
/*definire una classe per rappresentare un utente (nome, cognome, login, password e genere). il genere può essere maschio o femmina e 
deve essere definito tramite una classe enumerativa interna alla classe utente.
Usare il costruttore della classe Utente per impostare i dati.. una volta creato l’utente sarà possibile cambiare solo la password tramite un metodo di set.
implementare un programma main che:
    • crea un utente Mario Rossi
    • aggiorna la password dell’utente per contenere il valore “changeme” */

    public static void main(String[] args) {
        
        Utente utente1 = new Utente("Mario", "Rossi", "MRossi", "gneh!", Utente.Genere.maschio);
        
        System.out.println(utente1.genere);
        System.out.println(utente1.getPassword());
        utente1.setPassword("changeme");
        System.out.println(utente1.getPassword());

    }
}
