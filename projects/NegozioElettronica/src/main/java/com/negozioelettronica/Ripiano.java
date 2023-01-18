package com.negozioelettronica;

import com.negozioelettronica.prodotti.Prodotto;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * la classe rappresenta il ripiano che conterrà i <strong>prodotti</strong> vendibili nel suo attributo <b>prodottiPresenti</b>
 * @author josue
 */
public class Ripiano {
    
    private int numeroArmadio;
    private int numeroRipiano;
    private int volume;
    private Set<Prodotto> prodottiPresenti;

    public Ripiano(int numeroArmadio, int numeroRipiano, int volume) {
        this.numeroArmadio = numeroArmadio;
        this.numeroRipiano = numeroRipiano;
        this.volume = volume;
        this.prodottiPresenti = new LinkedHashSet<>();
    }

    public int getNumeroArmadio() {
        return numeroArmadio;
    }

    public int getNumeroRipiano() {
        return numeroRipiano;
    }

    public int getVolume() {
        return volume;
    }

    public Set<Prodotto> getProdottiPresenti() {
        return prodottiPresenti;
    }

    public void setNumeroArmadio(int numeroArmadio) {
        this.numeroArmadio = numeroArmadio;
    }

    public void setNumeroRipiano(int numeroRipiano) {
        this.numeroRipiano = numeroRipiano;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    
    public void addProdotto(Prodotto p) {
        prodottiPresenti.add(p);
    }

    @Override
    public String toString() {
        return "Ripiano{" + "numeroArmadio=" + numeroArmadio + ", numeroRipiano=" + numeroRipiano + ", volume=" + volume + ", prodottiPresenti=" + prodottiPresenti + '}';
    }
    
}
