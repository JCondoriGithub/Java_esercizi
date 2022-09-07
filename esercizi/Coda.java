import java.util.ArrayList;

public class Coda {
    
    ArrayList<Double> coda = new ArrayList<Double>();

    void push() {

        if(coda.size() < 5) {
            double rand = Math.random();
            coda.add(rand);
        } else
            System.out.println("troppi elementi");
    }

    void extract() {

        if(coda.size() != 0) {
            coda.remove(0);
        } else
            System.out.println("nessun elemento");
    }

    void print() {
        
        if(coda.size() != 0) {
            for(Double elem: coda) {
                System.out.println(elem);
            }
        } else
        System.out.println("array vuoto");

    }
}
