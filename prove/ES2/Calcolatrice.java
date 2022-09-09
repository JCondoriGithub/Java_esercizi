import java.util.HashMap;
import java.util.Stack;

public class Calcolatrice {
    
    private String espressione;
    Stack stack = new Stack();
    private HashMap<Character, Double> ambiente = new HashMap<Character, Double>();

    public Calcolatrice(String espr, HashMap<Character, Double> ambi) {
    
        this.espressione = espr;
        this.ambiente = ambi;
    }

    void calcola() {

        for(int i = 0; i < espressione.length(); i++) {
            
            switch(espressione.charAt(i)) {
                
                case '+':
                    somma();
                    break;
                case '-':
                    sottrazione();
                    break;
                case '*':
                    moltiplicazione();
                    break;
                case '/':
                    divisione();
                    break;
                default:
                    stack.push(ambiente.get(espressione.charAt(i)));
            }
        }
    }

    void somma() {

        double a, b;

        b = (double) stack.pop();
        a = (double) stack.pop();

        stack.push(a + b);
    }
    
    void sottrazione() {

        double a, b;

        b = (double) stack.pop();
        a = (double) stack.pop();

        stack.push(a - b);
    }

    void moltiplicazione() {

        double a, b;

        b = (double) stack.pop();
        a = (double) stack.pop();

        stack.push(a * b);
    }

    void divisione() {

        double a, b;

        b = (double) stack.pop();
        a = (double) stack.pop();

        stack.push(a / b);
    }
}