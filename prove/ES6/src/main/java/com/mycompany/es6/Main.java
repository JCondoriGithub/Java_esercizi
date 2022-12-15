package com.mycompany.es6;

import com.mycompany.es6.ellisse.Cerchio;
import com.mycompany.es6.ellisse.Ellisse;
import com.mycompany.es6.poligoniReg.Esagono;
import com.mycompany.es6.poligoniReg.Pentagono;
import com.mycompany.es6.poligoniReg.Quadrato;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * la classe chiede all'utente le figure da creare che verranno salvate nell'arraylist <strong>figure</strong>
 * modifica le cordinate x, y del primo elemento di <strong>figure</strong>
 * stampa a video le caratteristiche di tutte le figure create
 * stampa le figure che hanno le coordinate x, y uguali a quelle dati dall'utente
 * @author josue
 */
public class Main {

    public static void main(String[] args) {
        
        ArrayList<Figura> figure = new ArrayList<Figura>();
        
        Scanner scanner = new Scanner(System.in);
        
        String risposta = "si";
        do {

            System.out.println("che figura vuoi creare?\nscegli tra: quadrato, pentagono, esagono, rettangolo, ellisse e cerchio");
            String tipoFigura = scanner.nextLine();

            Figura nuovaFigura = null;
            switch(tipoFigura) {
                case "quadrato":
                    nuovaFigura = new Quadrato();
                    nuovaFigura.datiFigura();
                    break;
                case "pentagono":
                    nuovaFigura = new Pentagono();
                    nuovaFigura.datiFigura();
                    break;
                case "esagono":
                    nuovaFigura = new Esagono();
                    nuovaFigura.datiFigura();
                    break;
                case "rettangolo":
                    nuovaFigura = new Rettangolo();
                    nuovaFigura.datiFigura();
                    break;
                case "ellisse":
                    nuovaFigura = new Ellisse();
                    nuovaFigura.datiFigura();
                    break;
                case "cerchio":
                    nuovaFigura = new Cerchio();
                    nuovaFigura.datiFigura();
                    break;
                default:
                    System.out.println("figura non conosciuta");
            }
            
            if(nuovaFigura != null)
                figure.add(nuovaFigura);
            
            System.out.println("vuoi creare ancora una figura?");
            risposta = scanner.nextLine();
            
        } while(risposta.equals("si"));
        
        System.out.println("\nsposta la prima figura che hai creato\ninserisci il valore di x");
        int x = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("inserisci il valore di y");
        int y = scanner.nextInt();
        
        figure.get(0).sposta(x, y);
        figure.get(0).stampa();
        
        
        System.out.println("\nqueste sono tutte le figure che hai creato");
        for(Figura f: figure)
            f.stampa();
        
        
        System.out.println("\nstampa tutte le figure a cordinate x=");
        int x1 = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("e y=");
        int y1 = scanner.nextInt();
        
        for(Figura f: figure) {
            
            if(f.x == x1 && f.y == y1) {
                System.out.println("\nfigura trovata:");
                f.stampa();
            }
        }
    }
}
