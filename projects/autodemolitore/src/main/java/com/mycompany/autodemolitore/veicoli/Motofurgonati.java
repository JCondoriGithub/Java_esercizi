package com.mycompany.autodemolitore.veicoli;

import com.mycompany.autodemolitore.veicoli.componenti.Motore;
import java.time.LocalDate;

/**
 *
 * @author josue
 */
public class Motofurgonati extends Veicolo{
    
    private int maxPesoTrasportabile;
    private TipoControllo controlloMezzo;
    
    public static enum TipoControllo {
        volante,
        manubrio
    }

    public Motofurgonati(int maxPesoTrasportabile, TipoControllo controlloMezzo, LocalDate dataIngresso, Capannone capannone, int numeroParcheggio, Produttore produttore, String modello, String tipo, Motore motore) {
        super(dataIngresso, capannone, numeroParcheggio, produttore, modello, tipo, motore);
        this.maxPesoTrasportabile = maxPesoTrasportabile;
        this.controlloMezzo = controlloMezzo;
    }

    public int getMaxPesoTrasportabile() {
        return maxPesoTrasportabile;
    }

    public TipoControllo getControlloMezzo() {
        return controlloMezzo;
    }

    @Override
    public String toString() {
        return "Motofurgonati{" + "maxPesoTrasportabile=" + maxPesoTrasportabile + ", controlloMezzo=" + controlloMezzo
                + "\ndataIngresso=" + this.dataIngresso + ", capannone=" + this.capannone + ", numeroParcheggio=" + this.numeroParcheggio + ", produttore=" + this.produttore + ", modello=" + this.modello + ", tipo=" + this.tipo + ", motore=" + this.motore + "\npneumatici=" + this.pneumatici + '}';
    }
    
}
