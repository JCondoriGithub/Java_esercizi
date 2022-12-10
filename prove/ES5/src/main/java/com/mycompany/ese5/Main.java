package com.mycompany.ese5;

import java.util.Scanner;

/**
 * la classe inserirà nell'istanza di <b>Successione</b> i valori presi da terminale e
 * chiamerà ogni metodo dell'istanza stampando su terminale il loro ritorno
 * @author josue
 */
public class Main {

    public static void main(String[] args) {

        Successione succ = new Successione();
        Scanner scanner = new Scanner(System.in);
        
        Integer val;
        do {
            System.out.println("inserisci un numero: ");
            val = scanner.nextInt();
            
            if(val != 0)
                succ.aggiungi(val);
            
        } while(val != 0);
        
        System.out.println(succ.valori);
        System.out.println("media: " + succ.media());
        System.out.println("minimo: " + succ.minimo());
        System.out.println("massimo: " + succ.massimo());
        System.out.println("mediana: " + succ.mediana());
        
        System.out.println("con quale numero vuoi calcolare la varianza?");
        Integer num = scanner.nextInt();
        System.out.println("varianza: " + succ.varianza(num));
    }
}
