import java.util.Scanner;

public class Mastermind {
    
    private int[] codice = new int[4];
    private int[] newCodice = new int[4];

    private int[] risposta = new int[4];

    void generateCode() {

        for(int i = 0; i < codice.length; i++) {
            
            int num = (int) (Math.random() * 10);
            codice[i] = num;
            newCodice[i] = num;
        }
    }

    void generateRisp() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\ninserisci una alla volta 4 cifre da 0 a 9:");

        for(int i = 0; i < 4; i++) {
            risposta[i] = scanner.nextInt();
        }
    }

    void codeCheck() {

        int countN = 0;
        int countB = 0;

        for(int i = 0; i < risposta.length; i++) {

            if(risposta[i] == codice[i]) {
                
                countN++;
                codice[i] = -1;
                risposta[i] = -2;
            }
        }

        for(int i = 0; i < risposta.length; i++) {

            for(int j = 0; j < codice.length; j++) {

                if(risposta[i] == codice[j]) {
                    countB++;
                    codice[j] = -1;
                    break;
                }
            }
        }

        System.out.println("\nil numero di cifre giuste al posto giusto è: " + countN);
        System.out.println("il numero di cifre giuste al posto sbagliato è: " + countB);
    }

    void getCode() {

        System.out.println("\nil codice generato era:");

        for(int i = 0; i < codice.length; i++)
            System.out.println(newCodice[i]);
    }

}
