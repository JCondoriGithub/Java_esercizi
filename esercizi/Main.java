import java.util.Scanner;

/* Realizza un programma che sia in grado di accettare da tastiera, indifferentemente, un numero reale o un numero immmaginario, usando il costrutto try-catch. 
Bisogna ricordare che un numero immaginario è un numero reale preceduto dalla lettera 'j'.
Il primo try, 'tenta' la conversione della stringa inserita in un numero, se non ci riesce, c'è il fondato sospetto si tratti di un numero immaginario. 
Il corrispondente catch tenta a sua volta di individuare la 'j' iniziale dell'eventuale numero immaginario. Se non la trova, viene stampata la stringa "impossibile" */

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci un numero");
        String num = scanner.nextLine();

        try{
            float numero = Float.parseFloat(num);
            System.out.println(numero);
        }catch(Exception e) {

            if(num.charAt(0) == 'j') {
                try{
                   float numero = Float.parseFloat(num.substring(1));
                   System.out.println(numero);
                }catch(Exception ex) {
                    System.out.println("impossibile");
                }
            }else {
                System.out.println("impossibile");
            }
        }
    }
}
