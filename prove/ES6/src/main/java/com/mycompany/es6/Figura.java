package com.mycompany.es6;

/**
 * la classe astratta contiene le <strong>proprietà</strong> e <strong>metodi</strong> che verranno ereditate da tutte le figure creabili
 * @author josue
 */
public abstract class Figura {
    
    protected int x;
    protected int y;
 
    public abstract void sposta(int x, int y);
    public abstract void stampa();
    public abstract void datiFigura();
}
