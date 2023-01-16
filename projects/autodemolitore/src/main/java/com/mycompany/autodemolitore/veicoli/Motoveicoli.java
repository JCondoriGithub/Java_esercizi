package com.mycompany.autodemolitore.veicoli;

import com.mycompany.autodemolitore.veicoli.componenti.Motore;
import java.time.LocalDate;

/**
 *
 * @author josue
 */
public class Motoveicoli extends Veicolo{
    
    private int maxPesoTrasportabile;
    private boolean rimorchio;

    public Motoveicoli(int maxPesoTrasportabile, boolean rimorchio, LocalDate dataIngresso, Capannone capannone, int numeroParcheggio, Produttore produttore, String modello, String tipo, Motore motore) {
        super(dataIngresso, capannone, numeroParcheggio, produttore, modello, tipo, motore);
        this.maxPesoTrasportabile = maxPesoTrasportabile;
        this.rimorchio = rimorchio;
    }

    public int getMaxPesoTrasportabile() {
        return maxPesoTrasportabile;
    }

    public boolean isRimorchio() {
        return rimorchio;
    }

    @Override
    public String toString() {
        return "Motoveicoli{" + "maxPesoTrasportabile=" + maxPesoTrasportabile + ", rimorchio=" + rimorchio
                + "\ndataIngresso=" + this.dataIngresso + ", capannone=" + this.capannone + ", numeroParcheggio=" + this.numeroParcheggio + ", produttore=" + this.produttore + ", modello=" + this.modello + ", tipo=" + this.tipo + ", motore=" + this.motore + "\npneumatici=" + this.pneumatici + '}';
    }
    
}
