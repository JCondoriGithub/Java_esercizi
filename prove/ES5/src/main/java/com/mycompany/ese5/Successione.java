package com.mycompany.ese5;

import java.util.ArrayList;

/**
 * la classe memorizza una serie di valori e ne calcola: la media, il valore massimo, il valore minimo
 * @author josue
 */
public class Successione {
    
    /**
     * contiene tutti valori di tipo <strong>Integer</strong>, su cui verranno eseguiti tutti metodi della classe
     */
    public ArrayList<Integer> valori = new ArrayList<Integer>();
    
    /**
     * inserisce il valore del parametro nell'array <b>valori</b>
     * @param valore numero intero da inserire nell'array
     */
    public void aggiungi(Integer valore) {
        valori.add(valore);
    }
    
    /**
     * calcola la media degli elementi nell'array <b>valori</b>
     * @return la media dei valori dell'array
     */
    public Integer media() {
        
        Integer valTot = 0;
        int count = 0;
        
        for(Integer valore: valori) {
            
            valTot += valore;
            count++;
        }
        
        Integer result = valTot / count;
        return result;
    }
    
    /**
     * estrae il numero col valore più piccolo dall'array <b>valori</b>
     * @return il numero più piccolo dell'array <strong>valori</strong>
     */
    public Integer minimo() {
        
        int valMin = valori.get(0);
        
        for(int i = 0; i < valori.size(); i++) {
                        
            if(valMin > valori.get(i)) {
                valMin = valori.get(i);
            }
        }
        
        return valMin;
    }
    
    /**
     * estrae il numero col valore più grande dall'array <b>valori</b>
     * @return il numero più grande dell'array <strong>valori</strong>
     */
    public Integer massimo() {
        
        int valMax = valori.get(0);
        
        for(int i = 0; i < valori.size(); i++) {
            
            if(valMax < valori.get(i)) {
                valMax = valori.get(i);
            }
        }
        
        return valMax;
    }
    
    /**
     * calcola la mediana dell'array <strong>valori</strong>,
     * sia che il numero degli elementi dell'array sia pari o dispari
     * @return la mediana con tipo di dato <b>double</b>
     */
    public double mediana() {
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int v: valori)
            arr.add(v);
        
        ArrayList<Integer> crescente = new ArrayList<Integer>();
        
        for(int i = 0; i < valori.size(); i++) {
            
            int val = arr.get(0);
            
            for(int j = 0; j < arr.size(); j++) {
            
                if(val > arr.get(j))
                    val = arr.get(j);
            }
            arr.remove(arr.indexOf(val));
            crescente.add(val);
        }

        if(crescente.size() % 2 != 0) {
            
            int med = crescente.size() / 2;
            return (double)crescente.get(med);
        } else {
            
            int med2 = crescente.size() / 2;
            double mediana = (crescente.get(med2 -1) + crescente.get( med2)) / 2.0;
            return mediana;
        }
    }
    
    /**
     * calcola la varianza dell'array <strong>valori</strong>
     * @param num valore di tipo <b>Integer</b> con cui si calcolerà la varianza
     * @return la varianza
     */
    public double varianza(Integer num) {
        
        int media = media();
        return Math.pow((num - media), 2); 
    }
}
