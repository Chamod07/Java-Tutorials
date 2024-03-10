package tutorial2;

import java.util.InputMismatchException;

public class ExamEligibility {
    protected static void Main() {
        int[] userAttendance = getInput();
        final double allowedPercentage = 75.0/100;
        if ((double) userAttendance[1] /userAttendance[0] <= allowedPercentage) {
            boolean loopControl = false;
            while (!loopControl) {
                System.out.print("Do you have a medical cause? (y/n) ");
                char option = Main.input.next().charAt(0);
                switch (option) {
                    case 'y':
                        System.out.println("Please apply for a mitigation.");
                        loopControl = true;
                        break;
                    case 'n':
                        System.out.println("You are not eligible to sit for the exam.");
                        loopControl = true;
                        break;
                    default:
                        System.out.println("Select the correct option.");
                }
            }
        } else {
            System.out.println("You are eligible to sit for the exam.");
        }
    }

    private static int[] getInput() {
        int[] inputs = new int[2];
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Enter the number of classes held: ");
                inputs[0] = Main.input.nextInt();
                System.out.print("Enter the number of classes you attended: ");
                inputs[1] = Main.input.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Enter an integer.");
                Main.input.nextLine();
            }
        }
        return inputs;
    }
}
