package com.mycompany.es6.poligoniReg;

import com.mycompany.es6.Figura;
import java.util.Scanner;

/**
 * la classe contiene le proprietà aggiuntive dei <b>poligoni regolari</b> e il body del metodi <b>sposta, datiFigura</b> che veranno ereditate delle sue sottoclassi
 * @author josue
 */
public class PoligoniRegolari extends Figura{
    
    int numerolati;
    int dimensioneLato;

    /**
     * modifica gli attributi <strong>x, y</strong>
     * @param x contiene il nuovo valore di <b>x</b>
     * @param y contiene il nuovo valore di <b>y</b>
     */
    @Override
    public void sposta(int x, int y) {

        this.x = x;
        this.y = y;
    }

    @Override
    public void stampa() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * imposta tutti gli attributi dell'oggetto prendendo i dati dall'utente
     */
    @Override
    public void datiFigura() {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\ninserisci la dimensione lato: ");
        int dimLato = scanner.nextInt();
        this.dimensioneLato = dimLato;
        scanner.nextLine();
        
        System.out.println("inserisci il valore di x: ");
        int x = scanner.nextInt();
        this.x = x;
        scanner.nextLine();
        
        System.out.println("inserisci il valore di y: ");
        int y = scanner.nextInt();
        this.y = y;        
    }

    
}
