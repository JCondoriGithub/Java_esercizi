package com.mycompany.autodemolitore.veicoli;

import com.mycompany.autodemolitore.veicoli.componenti.Motore;
import com.mycompany.autodemolitore.veicoli.componenti.Pneumatico;
import java.time.LocalDate;
import java.util.HashMap;

public abstract class Veicolo {
 
    LocalDate dataIngresso;
    Capannone capannone;
    int numeroParcheggio;
    Produttore produttore;
    String modello;
    String tipo;
    Motore motore;
    HashMap<Integer, Pneumatico> pneumatici = new HashMap<Integer, Pneumatico>();

    public Veicolo(LocalDate dataIngresso, Capannone capannone, int numeroParcheggio, Produttore produttore, String modello, String tipo, Motore motore) {
        this.dataIngresso = dataIngresso;
        this.capannone = capannone;
        this.numeroParcheggio = numeroParcheggio;
        this.produttore = produttore;
        this.modello = modello;
        this.tipo = tipo;
        this.motore = motore;
    }
    
    public LocalDate getDataIngresso() {
        return dataIngresso;
    }

    public Capannone getCapannone() {
        return capannone;
    }

    public int getNumeroParcheggio() {
        return numeroParcheggio;
    }

    public Produttore getProduttore() {
        return produttore;
    }

    public String getModello() {
        return modello;
    }

    public String getTipo() {
        return tipo;
    }

    public Motore getMotore() {
        return motore;
    }

    public HashMap<Integer, Pneumatico> getPneumatici() {
        return pneumatici;
    }

    public void setPneumatici(HashMap<Integer, Pneumatico> pneumatici) {
        this.pneumatici = pneumatici;
    }
    
    public static enum Capannone {
    
        capannoneA,
        capannoneB,
        capannoneC,
        capannoneD
    }
    
    public static enum Produttore {
        
        Iveco,
        Scania,
        Volkswagen,
        Fiat,
        Ducati,
        Honda,
        Henan
    }

    @Override
    public String toString() {
        return "Veicolo{" + "pneumatici=" + pneumatici + '}';
    }

}
