import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {
        
        Mastermind game = new Mastermind();
        
        game.generateCode();

        int round = 0;

        while(round < 9) {

            try {
				game.generateRisp();
			} catch (TooNumbersException e) {
				e.printStackTrace();
			} catch (InputMismatchException e) {
				throw new InputMismatchException("deve essere un numero non una stringa!");
			}
            game.codeCheck();
            round++;
        }

        game.getCode();
    }
}