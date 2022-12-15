package com.mycompany.es6.poligoniReg;

/**
 * la classe rappresenta il <b>quadrato</b>
 * @author josue
 */
public class Quadrato extends PoligoniRegolari{

    /**
     * imposta il valore fisso <b>4</b> all'attributo per tutte le istanze di questa classe
     */
    public Quadrato() {
        numerolati = 4;
    }
    
    /**
     * stampa su conosle tutte le proprietà dell'istanza
     */
    public void stampa() {
        
        System.out.println("\nQuadrato\nposizione: x=" + x + ", y=" + y);
        System.out.println("numero dei lati: " + this.numerolati + "\ndimensione lato: " + this.dimensioneLato);
    }
}
