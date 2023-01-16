package com.mycompany.autodemolitore.veicoli.componenti;

public class Pneumatico {

    private int larghezza;
    private int altezza;
    private String diametro;

    public Pneumatico(int larghezza, int altezza, String diametro) {
        this.larghezza = larghezza;
        this.altezza = altezza;
        this.diametro = diametro;
    }

    public int getLarghezza() {
        return larghezza;
    }

    public int getAltezza() {
        return altezza;
    }

    public String getDiametro() {
        return diametro;
    }

    public void setLarghezza(int larghezza) {
        this.larghezza = larghezza;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    public void setDiametro(String diametro) {
        this.diametro = diametro;
    }

    @Override
    public String toString() {
        return "Pneumatico{" + "larghezza=" + larghezza + ", altezza=" + altezza + ", diametro=" + diametro + '}';
    }
    
}
