package com.mycompany.es6.ellisse;

import com.mycompany.es6.Figura;
import java.util.Scanner;

/**
 * la classe rappresenta <b>l'ellisse</b>
 * @author josue
 */
public class Ellisse extends Figura{
    
    /**
     * rappresentano le proprietà aggiuntive dell'ellisse
     */
    int diametroA;
    int diametroB;

    /**
     * modifica gli attributi <strong>x, y</strong>
     * @param x contiene il nuovo valore di <b>x</b>
     * @param y contiene il nuovo valore di <b>y</b>
     */
    @Override
    public void sposta(int x, int y) {

        this.x = x;
        this.y = y;
    }

    /**
     * stampa su conosle tutte le proprietà dell'istanza
     */
    @Override
    public void stampa() {

        System.out.println("\nEllisse\nposizione: x=" + x + ", y=" + y);
        System.out.println("diametro A: " + this.diametroA + "\ndiametro B: " + this.diametroB);
    }

    /**
     * imposta tutti gli attributi dell'oggetto prendendo i dati dall'utente
     */
    @Override
    public void datiFigura() {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\ninserisci la dimensione diametro A: ");
        int diamA = scanner.nextInt();
        this.diametroA = diamA;
        scanner.nextLine();
        
        System.out.println("inserisci la dimensione diametro B: ");
        int diamB = scanner.nextInt();
        this.diametroB= diamB;
        scanner.nextLine();
        
        System.out.println("inserisci il valore di x: ");
        int x = scanner.nextInt();
        this.x = x;
        scanner.nextLine();
        
        System.out.println("inserisci il valore di y: ");
        int y = scanner.nextInt();
        this.y = y; 
    }
}
