import java.util.HashMap;
import java.util.Stack;

public class Calcolatrice {
    
    private String espressione;
    Stack <Double> stack = new Stack<Double>();
    private HashMap<String, Double> ambiente = new HashMap<String, Double>();

    Calcolatrice(String espr, HashMap<String, Double> ambi) {
    
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
                    stack.push(ambiente.get(String.valueOf(espressione.charAt(i))));
            }
        }
    }

    void somma() {

        double a, b;

        b = stack.pop();
        a = stack.pop();

        stack.push(a + b);
    }
    
    void sottrazione() {

        double a, b;

        b = stack.pop();
        a = stack.pop();

        stack.push(a - b);
    }

    void moltiplicazione() {

        double a, b;

        b = stack.pop();
        a = stack.pop();

        stack.push(a * b);
    }

    void divisione() {

        double a, b;

        b = stack.pop();
        a = stack.pop();

        stack.push(a / b);
    }
}