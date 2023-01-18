package com.negozioelettronica.prodotti;

import java.time.LocalDate;

/**
 * la classe rappresenta il <strong>Prodotto</strong> di tipo <strong>PC</strong>, con le rispettive proprietà aggiuntive
 * @author josue
 */
public class PC extends Prodotto {
    
    private Layout linguaTastiera;
    private boolean ultrawide;
    private boolean altezzaRegolabile;

    /**
     * nel costruttore, si imposta il valore fisso dell'attributo <b>tipo</b> con <b>PC</b>
     */
    public PC(Layout linguaTastiera, boolean ultrawide, boolean altezzaRegolabile, LocalDate dataAcquisto, float prezzoVendita, float prezzoAcquisto, int sconto, float dimensioneMonitor, float potenzaAlimentatore, Materiale materiale, int memoriaRam, int memoriaInterna) {
        super(dataAcquisto, prezzoVendita, prezzoAcquisto, sconto, Prodotto.Tipologia.PC, dimensioneMonitor, potenzaAlimentatore, materiale, memoriaRam, memoriaInterna);
        this.linguaTastiera = linguaTastiera;
        this.ultrawide = ultrawide;
        this.altezzaRegolabile = altezzaRegolabile;
    }
    
    public static enum Layout {
        Italiano,
        Inglese
    }

    public Layout getLinguaTastiera() {
        return linguaTastiera;
    }

    public boolean isUltrawide() {
        return ultrawide;
    }

    public boolean isAltezzaRegolabile() {
        return altezzaRegolabile;
    }

    public void setLinguaTastiera(Layout linguaTastiera) {
        this.linguaTastiera = linguaTastiera;
    }

    public void setUltrawide(boolean ultrawide) {
        this.ultrawide = ultrawide;
    }

    public void setAltezzaRegolabile(boolean altezzaRegolabile) {
        this.altezzaRegolabile = altezzaRegolabile;
    }

    @Override
    public String toString() {
        return "PC{" + "linguaTastiera=" + linguaTastiera + ", ultrawide=" + ultrawide + ", altezzaRegolabile=" + altezzaRegolabile + super.toString() + '}';
    }
    
}
