import java.util.HashMap;

public class Main {

/*Utilizzare la classe Stack per implementare una calcolatrice polacca postfissa.
La calcolatrice dovrà ricevere come parametro una stringa insieme ad un ambiente di coppie variabile/valore contenuto in una hashMap e 
restituisce il risultato della valutazione dell’espressione nell’ambiente indicato.
il programma principale leggerà una stringa e la passerà alla calcolatrice. */
    public static void main(String[] args) {
        
        String espr = "xy*xz+/";

        HashMap<Character, Double> ambi = new HashMap<Character, Double>();
        ambi.put('x', 10.0);
        ambi.put('y', 5.0);
        ambi.put('z', 4.0);

        Calcolatrice calc1 = new Calcolatrice(espr, ambi);
        calc1.calcola();
        System.out.println(calc1.stack.peek());

    }
}