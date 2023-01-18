package com.negozioelettronica.prodotti;

import java.time.LocalDate;

/**
 * la classe rappresenta il <strong>Prodotto</strong> di tipo <strong>Tablet</strong>, con le rispettive proprietà aggiuntive
 * @author josue
 */
public class Tablet extends Prodotto {
    
    private int durataBatteria;
    private boolean ricaricaRapida;
    private boolean chiamateSMS;

    /**
     * nel costruttore, si imposta il valore fisso dell'attributo <b>tipo</b> con <b>Tablet</b>
     */
    public Tablet(int durataBatteria, boolean ricaricaRapida, boolean chiamateSMS, LocalDate dataAcquisto, float prezzoVendita, float prezzoAcquisto, int sconto, float dimensioneMonitor, float potenzaAlimentatore, Materiale materiale, int memoriaRam, int memoriaInterna) {
        super(dataAcquisto, prezzoVendita, prezzoAcquisto, sconto, Prodotto.Tipologia.Tablet, dimensioneMonitor, potenzaAlimentatore, materiale, memoriaRam, memoriaInterna);
        this.durataBatteria = durataBatteria;
        this.ricaricaRapida = ricaricaRapida;
        this.chiamateSMS = chiamateSMS;
    }

    public int getDurataBatteria() {
        return durataBatteria;
    }

    public boolean isRicaricaRapida() {
        return ricaricaRapida;
    }

    public boolean isChiamateSMS() {
        return chiamateSMS;
    }

    public void setDurataBatteria(int durataBatteria) {
        this.durataBatteria = durataBatteria;
    }

    public void setRicaricaRapida(boolean ricaricaRapida) {
        this.ricaricaRapida = ricaricaRapida;
    }

    public void setChiamateSMS(boolean chiamateSMS) {
        this.chiamateSMS = chiamateSMS;
    }

    @Override
    public String toString() {
        return "Tablet{" + "durataBatteria=" + durataBatteria + ", ricaricaRapida=" + ricaricaRapida + ", chiamateSMS=" + chiamateSMS + super.toString() + '}';
    }

}
