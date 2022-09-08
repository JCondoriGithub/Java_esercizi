import java.util.Scanner;

public class Main {
    
/*Un oggetto della classe InsiemeDiStringhe consente di rappresentare un qualunque insieme finito di stringhe. l'insieme di stringhe devono essere contenute in un array T.
 * un metodo che restituisce la stringa di lunghezza massima
 * un metodo che restituisce la stringa contenente più spazi 
 * un metodo che visualizza tutte le stringhe che hanno il prefisso specificato . 
*/
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("massimo quante stringhe?");
        int l = scanner.nextInt();

        InsiemeDiStringhe ogg1 = new InsiemeDiStringhe(l);

        ogg1.setT();
        ogg1.maxString();
        ogg1.maxSpaces();

        System.out.println("cerca le stringhe con prefisso:");
        int p = scanner.nextInt();

        ogg1.preString(p);
    }
}
