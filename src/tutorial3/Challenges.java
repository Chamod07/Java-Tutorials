package tutorial3;

import java.util.Random;

public class Challenges {
    public static void main(String[] args) {
        System.out.println("Q7. Passcode");
        Passcode();
        System.out.println("\nQ8. Secret number");
        SecretNumber();
        System.out.println("\nQ9. Armstrong numbers");
        Armstrong();
    }

    private static void Passcode() {
        int password = 486251;
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter password: ");
            int userInput = Main.input.nextInt();
            if (userInput==password) {
                System.out.println("Correct!");
                break;
            }
        }
        System.out.println("The password is "+password);
    }

    private static void SecretNumber() {
        int generatedNumber = new Random().nextInt(1, 21);
        while (true) {
            System.out.print("Guess the hidden number (1-20): ");
            int userNumber = Main.input.nextInt();
            if (generatedNumber==userNumber) {
                System.out.println(userNumber+" is correct!");
                break;
            } else System.out.println(userNumber+" was not correct.");
        }
    }

    private static void Armstrong() {
        int sum = 0;
        System.out.print("Enter a number: ");
        int n = Main.input.nextInt();
        int temp = n;

        while (n>0) {
            double r = n%10;
            sum += (int) Math.pow(r, 3);
            n /= 10;
        }
        if (sum == temp) System.out.println(temp+" is an Armstrong number.");
        else System.out.println(temp+" is not an Armstrong number.");
    }
}
