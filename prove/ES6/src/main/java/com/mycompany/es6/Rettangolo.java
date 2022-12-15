package com.mycompany.es6;

import java.util.Scanner;

/**
 * la classe rappresenta il <b>rettangolo</b>
 * @author josue
 */
public class Rettangolo extends Figura{
    
    /**
     * rappresentano le proprietà aggiuntive dei rettangoli
     */
    private int dimensioneBase;
    private int dimensioneAltezza;

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
        
        System.out.println("\nRettangolo\nposizione: x=" + x + ", y=" + y);
        System.out.println("base: " + this.dimensioneBase + " altezza: " + this.dimensioneAltezza);
    }

    /**
     * imposta tutti gli attributi dell'oggetto prendendo i dati dall'utente
     */
    @Override
    public void datiFigura() {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("\ninserisci la dimensione della base: ");
        int dimBase = scanner.nextInt();
        this.dimensioneBase = dimBase;
        scanner.nextLine();
        
        System.out.print("inserisci la dimensione dell'altezza: ");
        int dimAltezza = scanner.nextInt();
        this.dimensioneAltezza = dimAltezza;
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
