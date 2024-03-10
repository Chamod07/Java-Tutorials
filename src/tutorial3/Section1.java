package tutorial3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Section1 {
    public static void main(String[] args) {
//        System.out.println("Q1. Loops");
//        Loops();
//        System.out.println("\nQ2. Nested Loops");
//        NestedLoops();
//        System.out.println("\nQ3. Positive Integers");
//        PositiveIntegers();
//        System.out.println("\nQ4. Factorial");
//        Factorial();
//        System.out.println("\nQ5. Fibonacci series");
//        FibonacciSeries();
        System.out.println("\nQ6. Data input validation");
        InputValidation();
    }

    private static void Loops() {
        // i)
        for (int i = 1; i < 6; i++) {
            System.out.println(i);
        }
        int i = 1;
        while (i < 6) {
            System.out.println(i);
            i++;
        }
        // ii)
        for (int j = 0; j < 15; j += 2) {
            System.out.println(j);
        }
        int j = 0;
        while (j < 15) {
            System.out.println(j);
            j += 2;
        }
    }

    private static void NestedLoops() {
        // i)
        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        // ii)
        for (int i = 0; i < 9; i+=2) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        // iii)
        for (int i = 1; i < 6; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // iv)
        for (int i = 0; i < 9; i += 2) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 9; k > i; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void PositiveIntegers() {
        int n;
        do {
            System.out.print("Enter a number : ");
            n = Main.input.nextInt();
        } while (n <= 0);
        System.out.print("Enter a letter : ");
        char l = Main.input.next().charAt(0);
        int loopControl = 0;
        System.out.print("Output : ");
        while (loopControl<n) {
            System.out.print(l);
            loopControl++;
        }
        System.out.println();
    }

    private static void Factorial() {
        int userInput;
        do {
            System.out.print("Enter a positive integer to calculate the factorial: ");
            userInput = Main.input.nextInt();
        } while (userInput<0);
        int factorial = 1;
        for (int i = 1; i <= userInput; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of "+userInput+" is "+factorial);
    }

    private static void FibonacciSeries() {
        int userInput;
        do {
            System.out.print("Enter the nth value to calculate the Fibonacci series: ");
            userInput = Main.input.nextInt();
        } while (userInput<0);
        int firstValue = 1;
        int secondValue = 1;
        System.out.print(firstValue+", "+secondValue+", ");
        for (int i = 2; i < userInput; i++) {
            int nthValue = firstValue+secondValue;
            System.out.print(nthValue+", ");
            firstValue=secondValue;
            secondValue=nthValue;
        }
    }

    private static void Validation() {
        System.out.print("Select an operator (+, -, /, *): ");
        char operator = Main.input.next().charAt(0);
        System.out.print("Enter first number to calculate: ");
        double firstNum = Main.input.nextInt();
        System.out.print("Enter second number to calculate: ");
        double secondNum = Main.input.nextInt();
        switch (operator) {
            case '+':
                double add = firstNum+secondNum;
                System.out.println(firstNum+" + "+secondNum+" = "+add);
                break;
            case '-':
                double sub = firstNum-secondNum;
                System.out.println(firstNum+" - "+secondNum+" = "+sub);
                break;
            case '/':
                double div = firstNum /secondNum;
                System.out.println(firstNum+"/"+secondNum+" = "+div);
                break;
            case '*':
                double mul = firstNum*secondNum;
                System.out.println(firstNum+" x "+secondNum+" = "+mul);
                break;
            default:
                System.out.println("Wrong operator selected.");
        }
    }

    private static void InputValidation() {
        Scanner scanner = new Scanner(System.in);

        boolean isValidInput = false;
        char operator = ' ';
        double firstNum = 0.0;
        double secondNum = 0.0;

        while (!isValidInput) {
            System.out.print("Select an operator (+, -, /, *): ");
            try {
                operator = scanner.next().charAt(0);
                if (!isValidOperator(operator)) {
                    System.out.println("Invalid operator. Please select +, -, / or *");
                    continue;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid operator (+, -, / or *).");
                scanner.nextLine(); // Clear the buffer
                continue;
            }

            System.out.print("Enter first number to calculate: ");
            try {
                firstNum = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Clear the buffer
                continue;
            }

            System.out.print("Enter second number to calculate: ");
            try {
                secondNum = scanner.nextDouble();
                if (operator == '/' && secondNum == 0) {
                    System.out.println("Division by zero is not allowed.");
                    continue;
                }
                isValidInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Clear the buffer
                continue;
            }
        }

        // Perform the calculation based on the validated input
        switch (operator) {
            case '+':
                double add = firstNum + secondNum;
                System.out.println(firstNum + " + " + secondNum + " = " + add);
                break;
            case '-':
                double sub = firstNum - secondNum;
                System.out.println(firstNum + " - " + secondNum + " = " + sub);
                break;
            case '/':
                double div = firstNum / secondNum;
                System.out.println(firstNum + " / " + secondNum + " = " + div);
                break;
            case '*':
                double mul = firstNum * secondNum;
                System.out.println(firstNum + " x " + secondNum + " = " + mul);
                break;
        }
    }

    private static boolean isValidOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '/' || ch == '*';
    }

}
