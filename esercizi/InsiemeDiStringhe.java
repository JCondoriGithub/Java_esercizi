import java.util.Scanner;

public class InsiemeDiStringhe {

    int l;
    String[] T;
    int[] pref;

    InsiemeDiStringhe(int l) {
        this.l = l;
        T = new String[l];
        pref = new int[l];
    }

    void setT() {

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < l; i++) {

            System.out.println("inserisci la stringa");
            
            String string = scanner.nextLine();
            this.T[i] = string;

            System.out.println("inserisci il prefisso");

            int pr = scanner.nextInt();
            this.pref[i] = pr;
            scanner.nextLine();
        }
    }

    void maxString() {
        
        String max = T[0];

        for(int i = 0; i < T.length; i++) {

            if(max.replaceAll("\\s", "").length() < T[i].replaceAll("\\s", "").length()) {
                max = T[i];
            }
        }
        System.out.println("max Stringa: " + max);
    }

    void maxSpaces() {
        
        int count = 0;
        int countS = 0;
        String maxS = T[0];
        
        for(int i = 0; i < T.length; i++) {

            count = 0;

            for(int j = 0; j < T[i].length(); j++) {

                if(T[i].charAt(j) == ' ') {
                    count++;
                }
            }
            if(countS < count) {
                maxS = T[i];
                countS = count;
            }
        }
        System.out.println("stringa con più spazi: " + maxS);
    }

    void preString(int p) {

        for(int i = 0; i < pref.length; i++) {

            if(p == pref[i]) {
                System.out.println(T[i]);
            }
        }
    }
}
