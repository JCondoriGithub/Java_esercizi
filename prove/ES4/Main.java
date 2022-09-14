import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        Reale persona1 = new Reale("mario", "rossi", 36, "21-03-86");
        Reale persona2 = new Reale("giuseppe", "pizzo", 42, "10-08-91");

        ArrayList<String> poteri = new ArrayList<String>();
        poteri.add("forza");
        poteri.add("telecinesi");

        ArrayList<String> poteri2 = new ArrayList<String>();
        poteri.add("telepatia");
        poteri.add("invisibilità");

        Immaginario mostro1 = new Immaginario("klork", "smohr", 69, persona1, poteri);
        Immaginario mostro2 = new Immaginario("gnerp", "slurp", 77, persona1, poteri2);
        Immaginario mostro3 = new Immaginario("spong", "lerch", 48, persona1, poteri2);
        Immaginario mostro4 = new Immaginario("syus", "zohrs", 83, persona1, poteri);

        ArrayList<Personaggio> carte1 = new ArrayList<Personaggio>();
        carte1.add(mostro1);
        carte1.add(mostro2);
        carte1.add(mostro3);
        carte1.add(mostro4);
        carte1.add(persona2);


        Mazzo mazzo1 = new Mazzo();
        mazzo1.setMazzo(carte1, 20);
        mazzo1.valoreCarte();
        mazzo1.rapp();

        Mazzo mazzo2 = new Mazzo();
        mazzo2.valoreCarte();
        mazzo2.rapp();
    }
}