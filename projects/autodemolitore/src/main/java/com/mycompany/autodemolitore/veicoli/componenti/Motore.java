package com.mycompany.autodemolitore.veicoli.componenti;

public class Motore {

    private int cilindrata;
    private TipoMotore tipoMotore;
    private Alimentazione alimentazione;

    public Motore(int cilindrata, TipoMotore tipoMotore, Alimentazione alimentazione) {
        this.cilindrata = cilindrata;
        this.tipoMotore = tipoMotore;
        this.alimentazione = alimentazione;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public TipoMotore getTipoMotore() {
        return tipoMotore;
    }

    public Alimentazione getAlimentazione() {
        return alimentazione;
    }
    
    public static enum TipoMotore {
        volumetrico,
        continuo
    }
    
    public static enum Alimentazione {
        gpl,
        benzina,
        diesel
    }

    @Override
    public String toString() {
        return "Motore{" + "cilindrata=" + cilindrata + ", tipoMotore=" + tipoMotore + ", alimentazione=" + alimentazione + '}';
    }
   
}
