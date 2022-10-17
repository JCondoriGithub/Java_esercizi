import java.util.Scanner;

/* Scrivi un programma che istanziato un vettore di interi di 5 posizioni chieda all'utilizzatore di inserire un numero in una posizione specificata;
 gestire l'eventualità che vengano violati i limiti dell'array . */

public class Main {

    public static void main(String[] args) {

        int[] T = new int[5];

        Scanner scanner = new Scanner(System.in);

        int count = 0;
        while(count < 5) {

            System.out.println("inserisci il numero: ");
            int num = scanner.nextInt();
            System.out.println("alla posizione: ");
            int pos = scanner.nextInt();

            try{
                T[pos] = num;
                count++;
            }catch(ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }
        }
        for(int i: T)
            System.out.println(i);
    }
}
