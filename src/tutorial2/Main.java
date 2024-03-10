package tutorial2;

import java.util.Scanner;

public class Main {
    protected static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("* Section 01 : Main Questions *");
        Section1.Run();
        System.out.println("\n* Exam eligibility finder *");
        ExamEligibility.Main();
        System.out.println("\n* Simple Banking System *");
        BankingSystem.BankApp();
        System.out.println("\n* Rock, Paper, Scissors game *");
        RockPaperScissors.Game();
    }
}
