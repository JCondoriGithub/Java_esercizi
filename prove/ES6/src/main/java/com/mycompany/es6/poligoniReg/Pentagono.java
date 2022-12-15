package com.mycompany.es6.poligoniReg;

/**
 * la classe rappresenta il <b>pentagono</b>
 * @author josue
 */
public class Pentagono extends PoligoniRegolari{
 
    /**
     * imposta il valore fisso <b>5</b> all'attributo per tutte le istanze di questa classe
     */
    public Pentagono() {
        this.numerolati = 5;
    }
    
    /**
     * stampa su conosle tutte le proprietà dell'istanza
     */
    public void stampa() {
        
        System.out.println("\nPentagono\nposizione: x=" + x + ", y=" + y);
        System.out.println("numero dei lati: " + this.numerolati + "\ndimensione lato: " + this.dimensioneLato);
    }
}
