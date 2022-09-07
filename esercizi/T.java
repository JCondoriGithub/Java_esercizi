public class T {

    private int ora;
    private int min;
    private int sec;
    
    T(int ora, int min, int sec) {

        this.ora = ora;
        this.min = min;
        this.sec = sec;

        validator();
    }

    void validator() {
        
        if(ora < 0 || ora > 23) {

            System.out.println("errore: orario non valido!");

        } else if(min < 0 || min > 60) {

            System.out.println("errore: orario non valido!");

        } else if(sec < 0 || sec > 60) {

            System.out.println("errore: orario non valido!");
        } else
            print();
    }

    void print() {

        System.out.println("ora: " + ora + ", minuti: " + min + ", secondi: " + sec);
    }

    int getOra() {
        return ora;
    }
    int getMin() {
        return min;
    }
    int getSec() {
        return sec;
    }

    void add(T t) {

        ora = ora + t.getOra();
        min = min + t.getMin();
        sec = sec + t.getSec();

        if(ora > 23 || min > 60 || sec > 60) {
            System.out.println("errore: orario non valido!");
        } else
            print();
    }
    void sub(T t) {

        ora = ora - t.getOra();
        min = min - t.getMin();
        sec = sec - t.getSec();

        if(ora < 0 || min < 0 || sec < 0) {
            System.out.println("errore: orario non valido!g");
        } else
            print();
    }
}
