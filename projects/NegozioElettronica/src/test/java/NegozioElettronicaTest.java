import com.negozioelettronica.Ripiano;
import com.negozioelettronica.prodotti.Notebook;
import com.negozioelettronica.prodotti.PC;
import com.negozioelettronica.prodotti.PC.Layout;
import com.negozioelettronica.prodotti.Prodotto;
import com.negozioelettronica.prodotti.Prodotto.Materiale;
import com.negozioelettronica.prodotti.Smartphone;
import com.negozioelettronica.prodotti.Tablet;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;

/**
 * la classe-test implementa: dei metodi per creare un armadio con dei ripiani popolati randomicamente ed altri metodi 
 * @author josue
 */
public class NegozioElettronicaTest {

    static Random r;

    @BeforeAll
    public static void beforeClass() {
        r = new Random();
    }

    /**
     * il metodo restituisce una data-randomica
     * @return data-randomica di tipo <b>LocalDate</b>
     */
    LocalDate getDate() {

        int giorno = r.nextInt(31) + 1;
        int mese = r.nextInt(12) + 1;
        int anno = r.nextInt(2015, 2022);

        return LocalDate.of(anno, mese, giorno);
    }

    /**
     * il metodo restituisce randomicamente un valore di tipo <b>Materiale</b>
     * @return un valore di tipo <b>Materiale</b>
     */
    Materiale getMateriale() {

        Materiale mat = null;
        switch (r.nextInt(3)) {
            case 0:
                mat = Prodotto.Materiale.plastica;
                break;
            case 1:
                mat = Prodotto.Materiale.alluminio;
                break;
            case 2:
                mat = Prodotto.Materiale.vetro;
                break;
        }
        return mat;
    }

    /**
     * il metodo restituisce randomicamente un valore di tipo <b>Layout</b>
     * @return un valore di tipo <b>Layout</b>
     */
    Layout getLayout() {

        Layout lay = null;
        switch (r.nextInt(2)) {
            case 0:
                lay = PC.Layout.Italiano;
                break;
            case 1:
                lay = PC.Layout.Inglese;
                break;
        }
        return lay;
    }

    /**
     * il metodo restituisce un valore di tipo <b>booleano</b>
     * @return un valore <b>booleano</b>
     */
    boolean getBoolean() {
        int n = r.nextInt(2);
        return 0 == n;
    }

    /**
     * il metodo restituisce un <b>Ripiano</b> generato e popolato randomicamente
     * @return una classe di tipo <b>Ripiano</b>
     */
    Ripiano createRipiano() {

        Ripiano ripiano = new Ripiano(r.nextInt(100) + 1, r.nextInt(200) + 1, r.nextInt(5) + 1);
        int numProducts = r.nextInt(7) + 1;

        for (int i = 0; i < numProducts; i++) {

            int idProduct = r.nextInt(4);
            Prodotto product = null;
            float priceV = r.nextFloat(0, 2000);
            float priceA = r.nextFloat(0, priceV) - 1;
            
            switch (idProduct) {
                case 0:
                    product = new PC(getLayout(), getBoolean(), getBoolean(), getDate(), priceV, priceA, r.nextInt(90), r.nextFloat(100), r.nextFloat(3000), getMateriale(), r.nextInt(64) + 1, r.nextInt(1000) + 1);
                    break;
                case 1:
                    product = new Notebook(r.nextInt(30) + 1, getBoolean(), r.nextInt(360) + 1, getDate(), priceV, priceA, r.nextInt(90), r.nextFloat(100), r.nextInt(3000), getMateriale(), r.nextInt(64) + 1, r.nextInt(1000) + 1);
                    break;
                case 2:
                    product = new Tablet(r.nextInt(30) + 1, getBoolean(), getBoolean(), getDate(), priceV, priceA, r.nextInt(90), r.nextFloat(100), r.nextInt(3000), getMateriale(), r.nextInt(64) + 1, r.nextInt(1000) + 1);
                    break;
                case 3:
                    product = new Smartphone(r.nextInt(30) + 1, getBoolean(), r.nextInt(6) + 1, getBoolean(), getDate(), priceV, priceA, r.nextInt(90), r.nextFloat(100), r.nextInt(3000), getMateriale(), r.nextInt(64) + 1, r.nextInt(1000) + 1);
                    break;
            }
            ripiano.addProdotto(product);
        }
        return ripiano;
    }
    
    /**
     * il metodo restituisce tutti i prodotti scontati in <b>armadio</b>
     * @param armadio ArrayList che contiene i ripiani che contengono tutti i prodotti
     * @return i prodotti scontati in <b>armadio</b>
     */
    ArrayList<Prodotto> getDiscountedProduct(ArrayList<Ripiano> armadio) {
        
        ArrayList<Prodotto> productsFound = new ArrayList<Prodotto>();
        
        for(Ripiano ripiano: armadio) {
            for(Prodotto p: ripiano.getProdottiPresenti())
                if(p.getSconto() != 0)
                    productsFound.add(p);
        }
        return productsFound;
    }
    
    /**
     * il metodo aggiunge un prodotto di tipo <b>Tablet</b> in un ripiano di <b>armadio</b>
     * @param armadio ArrayList che contiene tutti i ripiani
     * @param index indice del ripiano in cui inserire il nuovo tablet
     */
    void addTablet(ArrayList<Ripiano> armadio, int index) {
        
        Prodotto newTablet = new Tablet(r.nextInt(30) + 1, getBoolean(), getBoolean(), getDate(), r.nextInt(2000), r.nextInt(2000), r.nextInt(90), r.nextFloat(100), r.nextInt(3000), getMateriale(), r.nextInt(64) + 1, r.nextInt(1000) + 1);
        armadio.get(index).addProdotto(newTablet);
    }
    
    /**
     * il metodo rimuove un prodotto di tipo <b>Tablet</b> da un ripiano di <b>armadio</b>
     * @param armadio ArrayList che contiene tutti i ripiani
     * @param index indice del ripiano da cui rimuovere un tablet
     */
    void removeTablet(ArrayList<Ripiano> armadio, int index) {
        
        for(Prodotto p: armadio.get(index).getProdottiPresenti()) {
            if(p.getTipo() == Prodotto.Tipologia.Tablet) {
                armadio.get(index).getProdottiPresenti().remove(p);
                break;
            }
        }
    }
    
    /**
     * il metodo scrive sul file di testo <strong>elenco_ripiani.txt</strong> tutto il contenuto dell'arraylist <b>armadio</b>
     * @param armadio arraylist che contiene i ripiani da stampare sul file <strong>elenco_ripiani.txt</strong>
     */
    void listOnFile(ArrayList<Ripiano> armadio) {
        try {
            FileWriter writer = new FileWriter("elenco_ripiani.txt");
            int count = 0;
            for(Ripiano r: armadio) {
                writer.write(r.toString());
                writer.append("\n");
            }
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }

    /**
     * il metodo: genera l'ArrayList <strong>armadio</strong>, esegue tutti i metodi per creare <b>ripiani</b> da inserire in <b>armadio</b> 
     * e stampa su console le varie versioni di <b>armadio</b>
     */
    @Test
    public void testMain() {

        ArrayList<Ripiano> armadio = new ArrayList<Ripiano>();
        armadio.add(createRipiano());
        armadio.add(createRipiano());
        armadio.add(createRipiano());
        armadio.add(createRipiano());

        System.out.println("armadio: " + armadio);
        System.out.println("prodotti_scontati: " + getDiscountedProduct(armadio));
        
        addTablet(armadio, 0);
        System.out.println("armadio_2: " + armadio);
        
        removeTablet(armadio, 0);
        System.out.println("armadio_3: " + armadio);
        
        listOnFile(armadio);
    }
}