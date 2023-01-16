package com.mycompany.autodemolitore.veicoli;

import com.mycompany.autodemolitore.veicoli.componenti.Motore;
import java.time.LocalDate;

/**
 *
 * @author josue
 */
public class Autoveicolo extends Veicolo{
   
    private int maxPesoTrasportabile;
    private String tipoCarrozzeria;
    private boolean quatroRuote;

    public Autoveicolo(int maxPesoTrasportabile, String tipoCarrozzeria, boolean quatroRuote, LocalDate dataIngresso, Capannone capannone, int numeroParcheggio, Produttore produttore, String modello, String tipo, Motore motore) {
        super(dataIngresso, capannone, numeroParcheggio, produttore, modello, tipo, motore);
        this.maxPesoTrasportabile = maxPesoTrasportabile;
        this.tipoCarrozzeria = tipoCarrozzeria;
        this.quatroRuote = quatroRuote;
    }

    public int getMaxPesoTrasportabile() {
        return maxPesoTrasportabile;
    }

    public String getTipoCarrozzeria() {
        return tipoCarrozzeria;
    }

    public boolean isQuatroRuote() {
        return quatroRuote;
    }

    @Override
    public String toString() {
        return "Autoveicolo{" + "maxPesoTrasportabile=" + maxPesoTrasportabile + ", tipoCarrozzeria=" + tipoCarrozzeria + ", quatroRuote=" + quatroRuote
                + "\ndataIngresso=" + this.dataIngresso + ", capannone=" + this.capannone + ", numeroParcheggio=" + this.numeroParcheggio + ", produttore=" + this.produttore + ", modello=" + this.modello + ", tipo=" + this.tipo + ", motore=" + this.motore + "\npneumatici=" + this.pneumatici + '}';
    }
    
}
