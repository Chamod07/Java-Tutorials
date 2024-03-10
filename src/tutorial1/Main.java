package tutorial1;

import java.util.Scanner;

public class Main {
    protected static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("* MyFirstJava program *");
        MyFirstJava.Run();
        System.out.println("\n* MarkAverage program *");
        MarkAverage.markAverage();
        System.out.println("\n* Challenges *");
        Challenges.Run();
    }
}
