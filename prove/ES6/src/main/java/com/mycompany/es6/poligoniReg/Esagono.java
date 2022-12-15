package com.mycompany.es6.poligoniReg;

/**
 * la classe rappresenta <b>l'esagono</b>
 * @author josue
 */
public class Esagono extends PoligoniRegolari{
    
    /**
     * imposta il valore fisso <b>6</b> all'attributo per tutte le istanze di questa classe
     */
    public Esagono() {
        this.numerolati = 6;
    }
    
    /**
     * stampa su conosle tutte le proprietà dell'istanza
     */
    public void stampa() {
        
        System.out.println("\nEsagono\nposizione: x=" + x + ", y=" + y);
        System.out.println("numero dei lati: " + this.numerolati + "\ndimensione lato: " + this.dimensioneLato);
    }
}
