package tutorial2;

import java.util.Random;

public class RockPaperScissors {
    protected static void Game() {
        System.out.println("Welcome to the Rock, Paper, Scissors game!");
        final String[] options = {"Rock", "Paper", "Scissors"};
        int userOption;
        do {
            System.out.print("0. Rock\n1. Paper\n2. Scissors\nSelect an option: ");
            userOption = Main.input.nextInt();
        } while (userOption < 0 || userOption > 2);
        int generatedOption = new Random().nextInt(3);

        System.out.println("You chose: "+options[userOption]);
        System.out.println("Computer chose: "+options[generatedOption]);

        if (userOption==generatedOption) {
            System.out.println("It's a tie!");
        } else if (userOption == 0 && generatedOption == 2 || userOption == 1 && generatedOption == 0 || userOption == 2 && generatedOption == 1) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }
    }
}
