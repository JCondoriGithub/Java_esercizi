package com.mycompany.autodemolitore;

import com.mycompany.autodemolitore.veicoli.Autoarticolato;
import com.mycompany.autodemolitore.veicoli.Autoveicolo;
import com.mycompany.autodemolitore.veicoli.Motofurgonati;
import com.mycompany.autodemolitore.veicoli.Motoveicoli;
import com.mycompany.autodemolitore.veicoli.Veicolo;
import java.time.LocalDate;
import java.util.Random;
import com.mycompany.autodemolitore.veicoli.Veicolo.Capannone;
import com.mycompany.autodemolitore.veicoli.componenti.Motore;
import com.mycompany.autodemolitore.veicoli.componenti.Pneumatico;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;

public class AutodemolitoreTest {

    static Random r;
    static ArrayList<Veicolo> veicoli;
    
    @BeforeAll
    public static void beforeClass() {
        r = new Random();
        veicoli = new ArrayList<Veicolo>();
    }
    
    public HashSet getByRuota(ArrayList<Veicolo> veicoli) {
        
        HashSet<Veicolo> veicoliTrovati = new HashSet<Veicolo>();
        
        for(Veicolo v: veicoli) {
            
            for(Pneumatico p: v.getPneumatici().values())
                
                if(p.getDiametro().contains("255/55"))
                    veicoliTrovati.add(v);
        }
        return veicoliTrovati;
    }
    
    public void addRuota(ArrayList<Veicolo> veicoli) {
        
        Pneumatico pneumatico = getPneumatici(1).get(1);
        veicoli.get(0).getPneumatici().put(veicoli.get(0).getPneumatici().size() + 1, pneumatico);
    }
    
    public void removeRuota(ArrayList<Veicolo> veicoli) {
        
        veicoli.get(0).getPneumatici().remove(veicoli.get(0).getPneumatici().size());
    }
    
    public void listOnFile(ArrayList<Veicolo> veicoli) throws IOException {
        
        FileWriter writer = new FileWriter("/home/josue/Scrivania/esercizi_java/projects/autodemolitore/src/main/java/com/mycompany/autodemolitore/elenco_autovetture");
        
        for(Veicolo v: veicoli)
            writer.write(v.toString() + "\n\n");
            
        writer.close();
    }
    
    LocalDate getDate() {
        
        int giorno = r.nextInt(31) + 1;
        int mese = r.nextInt(12) + 1;
        int anno = r.nextInt(2000, 2020);
        
        return LocalDate.of(anno, mese, giorno);
    }
    
    Capannone getCapannone() {
        
        Capannone value = null;
        
        switch(r.nextInt(4)) {
            
            case 0:
                value = com.mycompany.autodemolitore.veicoli.Veicolo.Capannone.capannoneA;
                break;
            case 1:
                value = com.mycompany.autodemolitore.veicoli.Veicolo.Capannone.capannoneB;
                break;
            case 2:
                value = com.mycompany.autodemolitore.veicoli.Veicolo.Capannone.capannoneC;
                break;
            case 3:
                value = com.mycompany.autodemolitore.veicoli.Veicolo.Capannone.capannoneD;
                break;
        }
 
        return value;
    }
    
    Motore getMotore() {
        
        Motore motore = new Motore(r.nextInt(1000), Motore.TipoMotore.volumetrico, Motore.Alimentazione.diesel);
        return motore;
    }
    
    HashMap<Integer, Pneumatico> getPneumatici(int ruote) {
        
        HashMap<Integer, Pneumatico> pneumatici = new HashMap<Integer, Pneumatico>();
        
        for(int i = 0; i < ruote; i++) {
            
            int larghezza = r.nextInt(250, 260);
            int altezza = r.nextInt(50, 60);
            
            Pneumatico pneu = new Pneumatico(larghezza, altezza, larghezza + "/" + altezza + " R" + r.nextInt(99));
            pneumatici.put(i + 1, pneu);
        }
        return pneumatici;
    }
    
    @Test
    public void testMain() throws IOException {

        Autoarticolato autoarticolato = new Autoarticolato(false, Autoarticolato.TipoCassone.aperto, r.nextInt(), getDate(), getCapannone(), r.nextInt(), com.mycompany.autodemolitore.veicoli.Veicolo.Produttore.Scania, "camion", "Autoarticolato", getMotore());
        autoarticolato.setPneumatici(getPneumatici(8));
        veicoli.add(autoarticolato);
        
        Autoveicolo autoveicolo = new Autoveicolo(r.nextInt(), UUID.randomUUID().toString(), true, getDate(), getCapannone(), r.nextInt(), com.mycompany.autodemolitore.veicoli.Veicolo.Produttore.Fiat, "punto", "Autoveicolo", getMotore());
        autoveicolo.setPneumatici(getPneumatici(4));
        veicoli.add(autoveicolo);
        
        Motoveicoli motoveicolo = new Motoveicoli(r.nextInt(), true, getDate(), getCapannone(), r.nextInt(), com.mycompany.autodemolitore.veicoli.Veicolo.Produttore.Scania, "moto", "Motoveicoli", getMotore());
        motoveicolo.setPneumatici(getPneumatici(2));
        veicoli.add(motoveicolo);
        
        Motofurgonati motofurgonato = new Motofurgonati(r.nextInt(), Motofurgonati.TipoControllo.manubrio, getDate(), getCapannone(), r.nextInt(), com.mycompany.autodemolitore.veicoli.Veicolo.Produttore.Scania, "treruote", "Motofurgonati", getMotore());
        motofurgonato.setPneumatici(getPneumatici(3));
        veicoli.add(motofurgonato);
        
        for(Veicolo v: veicoli)
            System.out.println("\n" + v);
        
        System.out.println("\nVetture trovate -> " + getByRuota(veicoli));
    
        addRuota(veicoli);
        System.out.println("\naggiunto pneumatico -> " + veicoli.get(0).getPneumatici());
        
        removeRuota(veicoli);
        System.out.println("\nrimosso pneumatico -> " + veicoli.get(0).getPneumatici());
        
        listOnFile(veicoli);
    }
}
