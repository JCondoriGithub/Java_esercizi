package com.negozioelettronica.prodotti;

import java.time.LocalDate;

/**
 * la classe astratta rappresenta le caratteristiche generali di un <strong>prodotto</strong>
 * @author josue
 */
public abstract class Prodotto {
    
    private LocalDate dataAcquisto;
    private float prezzoVendita;
    private float prezzoAcquisto;
    private int sconto;
    private Tipologia tipo;
    private float dimensioneMonitor;
    private float potenzaAlimentatore;
    private Materiale materiale;
    private int memoriaRam;
    private int memoriaInterna;

    public Prodotto(LocalDate dataAcquisto, float prezzoVendita, float prezzoAcquisto, int sconto, Tipologia tipo, float dimensioneMonitor, float potenzaAlimentatore, Materiale materiale, int memoriaRam, int memoriaInterna) {
        this.dataAcquisto = dataAcquisto;
        this.prezzoVendita = prezzoVendita;
        this.prezzoAcquisto = prezzoAcquisto;
        this.sconto = sconto;
        this.tipo = tipo;
        this.dimensioneMonitor = dimensioneMonitor;
        this.potenzaAlimentatore = potenzaAlimentatore;
        this.materiale = materiale;
        this.memoriaRam = memoriaRam;
        this.memoriaInterna = memoriaInterna;
    }
    
    public static enum Tipologia {
        PC,
        Notebook,
        Tablet,
        Smartphone
    }
    
    public static enum Materiale {
        plastica,
        alluminio,
        vetro
    }
    
    /**
     * il metodo determina se <strong>prezzoVendita</strong>-scontato è minore di <strong>prezzoAcquisto</strong>
     * @return <b>true</b> se <strong>prezzoVendita</strong>-scontato è minore di <strong>prezzoAcquisto</strong>, <b>false</b> se è maggiore
     */
    public boolean isPriceLower() {
        
        float n = prezzoVendita - ((prezzoVendita / 100) * sconto);
        boolean r = n < prezzoAcquisto;
        return r;
    }

    public LocalDate getDataAcquisto() {
        return dataAcquisto;
    }

    public float getPrezzoVendita() {
        return prezzoVendita;
    }

    public float getPrezzoAcquisto() {
        return prezzoAcquisto;
    }

    public int getSconto() {
        return sconto;
    }

    public Tipologia getTipo() {
        return tipo;
    }

    public float getDimensioneMonitor() {
        return dimensioneMonitor;
    }

    public float getPotenzaAlimentatore() {
        return potenzaAlimentatore;
    }

    public Materiale getMateriale() {
        return materiale;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public int getMemoriaInterna() {
        return memoriaInterna;
    }
    

    public void setDataAcquisto(LocalDate dataAcquisto) {
        this.dataAcquisto = dataAcquisto;
    }

    public void setPrezzoVendita(int prezzoVendita) {
        this.prezzoVendita = prezzoVendita;
    }

    public void setPrezzoAcquisto(int prezzoAcquisto) {
        this.prezzoAcquisto = prezzoAcquisto;
    }

    public void setSconto(int sconto) {
        this.sconto = sconto;
    }

    public void setTipo(Tipologia tipo) {
        this.tipo = tipo;
    }

    public void setDimensioneMonitor(int dimensioneMonitor) {
        this.dimensioneMonitor = dimensioneMonitor;
    }

    public void setPotenzaAlimentatore(int potenzaAlimentatore) {
        this.potenzaAlimentatore = potenzaAlimentatore;
    }

    public void setMateriale(Materiale materiale) {
        this.materiale = materiale;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public void setMemoriaInterna(int memoriaInterna) {
        this.memoriaInterna = memoriaInterna;
    }

    @Override
    public String toString() {
        return " Prodotto{" + "dataAcquisto=" + dataAcquisto + ", prezzoVendita=" + prezzoVendita + ", prezzoAcquisto=" + prezzoAcquisto + ", sconto=" + sconto + ", tipo=" + tipo + ", dimensioneMonitor=" + dimensioneMonitor + ", potenzaAlimentatore=" + potenzaAlimentatore + ", materiale=" + materiale + ", memoriaRam=" + memoriaRam + ", memoriaInterna=" + memoriaInterna + '}';
    }
    
}
