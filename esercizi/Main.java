import java.util.Scanner;

public class Main {

/*Realizza un programma per gestire una coda di interi di max 5 elementi attraverso una classe Coda che deve prevedere dei metodi per l'inserimento e 
per l'estrazione di un elemento.*/
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String opzione = "";

        Coda coda1 = new Coda();

        System.out.println("Seleziona una delle seguenti opzioni:\n 1) inserisci\n 2) estrai\n 3) stampa\n 4) termina");
        
        while(!opzione.equals("termina")) {
            opzione = scanner.nextLine();

            switch(opzione) {
                case "inserisci":
                    coda1.push();
                    break;
                case "estrai":
                    coda1.extract();
                    break;
                case "stampa":
                    coda1.print();
                    break;
                default:
                    scanner.close();
            }
        }

        System.out.println("programma terminato");
    }
}
