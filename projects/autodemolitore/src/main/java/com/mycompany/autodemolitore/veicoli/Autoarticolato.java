package com.mycompany.autodemolitore.veicoli;

import com.mycompany.autodemolitore.veicoli.componenti.Motore;
import java.time.LocalDate;

public class Autoarticolato extends Veicolo{

    private boolean cabinaRibaltabile;
    private TipoCassone cassone;
    private int maxPesoTrasportabile;

    public Autoarticolato(boolean cabinaRibaltabile, TipoCassone cassone, int maxPesoTrasportabile, LocalDate dataIngresso, Capannone capannone, int numeroParcheggio, Produttore produttore, String modello, String tipo, Motore motore) {
        super(dataIngresso, capannone, numeroParcheggio, produttore, modello, tipo, motore);
        this.cabinaRibaltabile = cabinaRibaltabile;
        this.cassone = cassone;
        this.maxPesoTrasportabile = maxPesoTrasportabile;
    }

    public boolean isCabinaRibaltabile() {
        return cabinaRibaltabile;
    }

    public TipoCassone getCassone() {
        return cassone;
    }

    public int getMaxPesoTrasportabile() {
        return maxPesoTrasportabile;
    }
    
    public static enum TipoCassone {
        aperto,
        chiuso
    }

    @Override
    public String toString() {
        return "Autoarticolato{" + "cabinaRibaltabile=" + cabinaRibaltabile + ", cassone=" + cassone + ", maxPesoTrasportabile=" + maxPesoTrasportabile
                + "\ndataIngresso=" + this.dataIngresso + ", capannone=" + this.capannone + ", numeroParcheggio=" + this.numeroParcheggio + ", produttore=" + this.produttore + ", modello=" + this.modello + ", tipo=" + this.tipo + ", motore=" + this.motore + "\npneumatici=" + pneumatici + '}';
    }

}
