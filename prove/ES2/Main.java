import java.util.Scanner;
import java.util.HashMap;

public class Main {

/*Utilizzare la classe Stack per implementare una calcolatrice polacca postfissa.
La calcolatrice dovrà ricevere come parametro una stringa insieme ad un ambiente di coppie variabile/valore contenuto in una hashMap e 
restituisce il risultato della valutazione dell’espressione nell’ambiente indicato.
il programma principale leggerà una stringa e la passerà alla calcolatrice. */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        

        System.out.println("inserisci l'espressione:");
        String espr = scanner.nextLine();

        System.out.println("imposta l'ambiente:");
        HashMap<String, Double> ambi = new HashMap<String, Double>();

        String risp = "si";
        while(risp.equals("si")) {

            System.out.println("inserisci la chiave:");
            String key = scanner.nextLine();

            System.out.println("inserisci il valore:");
            Double value = scanner.nextDouble();
            scanner.nextLine();

            ambi.put(key, value);

            System.out.println("vuoi ancora continuare?\ninserisci si o no");
            risp = scanner.nextLine();
        }

        Calcolatrice calc1 = new Calcolatrice(espr, ambi);
        calc1.calcola();
        System.out.println(calc1.stack.peek());

    }
}