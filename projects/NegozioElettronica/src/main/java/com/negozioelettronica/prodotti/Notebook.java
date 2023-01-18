package com.negozioelettronica.prodotti;

import java.time.LocalDate;

/**
 * la classe rappresenta il <strong>Prodotto</strong> di tipo <strong>Notebook</strong>, con le rispettive proprietà aggiuntive
 * @author josue
 */
public class Notebook extends Prodotto {
    
    private int durataBatteria;
    private boolean ricaricaRapida;
    private int angoloApertura;

    /**
     * nel costruttore, si imposta il valore fisso dell'attributo <b>tipo</b> con <b>Notebook</b>
     */
    public Notebook(int durataBatteria, boolean ricaricaRapida, int angoloApertura, LocalDate dataAcquisto, float prezzoVendita, float prezzoAcquisto, int sconto, float dimensioneMonitor, float potenzaAlimentatore, Materiale materiale, int memoriaRam, int memoriaInterna) {
        super(dataAcquisto, prezzoVendita, prezzoAcquisto, sconto, Prodotto.Tipologia.Notebook, dimensioneMonitor, potenzaAlimentatore, materiale, memoriaRam, memoriaInterna);
        this.durataBatteria = durataBatteria;
        this.ricaricaRapida = ricaricaRapida;
        this.angoloApertura = angoloApertura;
    }

    public int getDurataBatteria() {
        return durataBatteria;
    }

    public boolean isRicaricaRapida() {
        return ricaricaRapida;
    }

    public int getAngoloApertura() {
        return angoloApertura;
    }

    public void setDurataBatteria(int durataBatteria) {
        this.durataBatteria = durataBatteria;
    }

    public void setRicaricaRapida(boolean ricaricaRapida) {
        this.ricaricaRapida = ricaricaRapida;
    }

    public void setAngoloApertura(int angoloApertura) {
        this.angoloApertura = angoloApertura;
    }

    @Override
    public String toString() {
        return "Notebook{" + "durataBatteria=" + durataBatteria + ", ricaricaRapida=" + ricaricaRapida + ", angoloApertura=" + angoloApertura + super.toString() + '}';
    }
    
}
