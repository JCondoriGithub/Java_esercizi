import java.util.Scanner;

public class Main {

/* Scrivi una classe T che contenga un orario valido. Deve essere possibile impostare un orario in ore,minuti,secondi; 
la classe deve prevedere un metodo per la validazione di un orario, un metodo per aggiungere un orario ad un altro e un metodo per sottrarre due orari . */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci un'orario:");

        int ora = scanner.nextInt();
        int min = scanner.nextInt();
        int sec = scanner.nextInt();

        T t1 = new T(ora, min, sec);

        int ora2 = scanner.nextInt();
        int min2 = scanner.nextInt();
        int sec2 = scanner.nextInt();

        T t2 = new T(ora2, min2, sec2);
        t1.add(t2);

        int ora3 = scanner.nextInt();
        int min3 = scanner.nextInt();
        int sec3 = scanner.nextInt();

        T t3 = new T(ora3, min3, sec3);
        t2.sub(t3);
    }
}
