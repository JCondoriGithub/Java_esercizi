public class Main {

    public static void main(String[] args) {
        
        Mastermind game = new Mastermind();
        
        game.generateCode();

        int round = 0;

        while(round < 9) {

            game.generateRisp();
            game.codeCheck();
            round++;
        }

        game.getCode();
    }
}