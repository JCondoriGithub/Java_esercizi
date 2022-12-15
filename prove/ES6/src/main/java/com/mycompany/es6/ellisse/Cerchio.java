package com.mycompany.es6.ellisse;

import java.util.Scanner;

/**
 * la classe rappresenta il <b>cerchio<7b>
 * @author josue
 */
public class Cerchio extends Ellisse{
        
    /**
     * imposta tutti gli attributi dell'oggetto prendendo i dati dall'utente
     */
    @Override
    public void datiFigura() {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\ninserisci la dimensione diametro: ");
        int diamA = scanner.nextInt();
        this.diametroA = diamA;
        this.diametroB = this.diametroA;
        scanner.nextLine();
        
        System.out.println("inserisci il valore di x: ");
        int x = scanner.nextInt();
        this.x = x;
        scanner.nextLine();
        
        System.out.println("inserisci il valore di y: ");
        int y = scanner.nextInt();
        this.y = y; 
    }
    
    /**
     * stampa su conosle tutte le proprietà dell'istanza
     */
    public void stampa() {
        
        System.out.println("\nCerchio\nposizione: x=" + x + ", y=" + y);
        System.out.println("diametro: " + this.diametroA);
    }
}
