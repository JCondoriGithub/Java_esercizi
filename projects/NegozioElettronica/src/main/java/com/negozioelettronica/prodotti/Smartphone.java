package com.negozioelettronica.prodotti;

import java.time.LocalDate;

/**
 * la classe rappresenta il <strong>Prodotto</strong> di tipo <strong>Smartphone</strong>, con le rispettive proprietà aggiuntive
 * @author josue
 */
public class Smartphone extends Prodotto {
    
    private int durataBatteria;
    private boolean ricaricaRapida;
    private int numeroFotocamere;
    private boolean schermoCurvo;

    /**
     * nel costruttore, si imposta il valore fisso dell'attributo <b>tipo</b> con <b>Smartphone</b>
     */
    public Smartphone(int durataBatteria, boolean ricaricaRapida, int numeroFotocamere, boolean schermoCurvo, LocalDate dataAcquisto, float prezzoVendita, float prezzoAcquisto, int sconto, float dimensioneMonitor, float potenzaAlimentatore, Materiale materiale, int memoriaRam, int memoriaInterna) {
        super(dataAcquisto, prezzoVendita, prezzoAcquisto, sconto, Prodotto.Tipologia.Smartphone, dimensioneMonitor, potenzaAlimentatore, materiale, memoriaRam, memoriaInterna);
        this.durataBatteria = durataBatteria;
        this.ricaricaRapida = ricaricaRapida;
        this.numeroFotocamere = numeroFotocamere;
        this.schermoCurvo = schermoCurvo;
    }

    public int getDurataBatteria() {
        return durataBatteria;
    }

    public boolean isRicaricaRapida() {
        return ricaricaRapida;
    }

    public int getNumeroFotocamere() {
        return numeroFotocamere;
    }

    public boolean isSchermoCurvo() {
        return schermoCurvo;
    }

    public void setDurataBatteria(int durataBatteria) {
        this.durataBatteria = durataBatteria;
    }

    public void setRicaricaRapida(boolean ricaricaRapida) {
        this.ricaricaRapida = ricaricaRapida;
    }

    public void setNumeroFotocamere(int numeroFotocamere) {
        this.numeroFotocamere = numeroFotocamere;
    }

    public void setSchermoCurvo(boolean schermoCurvo) {
        this.schermoCurvo = schermoCurvo;
    }

    @Override
    public String toString() {
        return "Smartphone{" + "durataBatteria=" + durataBatteria + ", ricaricaRapida=" + ricaricaRapida + ", numeroFotocamere=" + numeroFotocamere + ", schermoCurvo=" + schermoCurvo + super.toString() + '}';
    }

}
