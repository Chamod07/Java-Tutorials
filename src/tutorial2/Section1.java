package tutorial2;

public class Section1 {
    protected static void Run() {
        VariablesAndOperators();
        Age();
        MarkCalculator();
        GradeClassification();
        Calculator();
    }

    private static void VariablesAndOperators() {
        System.out.print("Enter the first number: ");
        double firstNum = Main.input.nextDouble();
        System.out.print("Enter the second number: ");
        double secondNum = Main.input.nextDouble();
        double sum = firstNum+secondNum;
        System.out.println("The total is "+sum);
    }

    private static void Age() {
        System.out.print("Enter a number: ");
        int userInput = Main.input.nextInt();
        if (userInput>=0) {
            if (userInput > 18) {
                System.out.println("Over 18");
            } else {
                System.out.println("Under 18");
            }
        } else {
            System.out.println("The age entered is incorrect.");
        }
    }

    private static void MarkCalculator() {
        System.out.print("Enter your ICT mark: ");
        int ictMark = Main.input.nextInt();
        System.out.print("Enter your coursework mark: ");
        int cwMark = Main.input.nextInt();
        if (ictMark>=30 && cwMark>=30) {
            int finalMark = (ictMark+cwMark)/2;
            if (finalMark >= 40) {
                System.out.println("You PASSED the module. The final mark is "+finalMark);
            } else {
                System.out.println("You FAILED the module. Did not meet the final mark.");
            }
        } else {
            System.out.println("You FAILED the module. Did not pass one or both components.");
        }
    }

    private static void GradeClassification() {
        System.out.print("Enter your grades: ");
        double grade = Main.input.nextDouble();
        if (grade <= 100 && grade >= 40) {
            if (grade >= 70) {
                System.out.println("1st Class Honours");
            } else if (grade >= 60) {
                System.out.println("2nd Class Honours Upper Division");
            } else if (grade >= 50) {
                System.out.println("2nd Class Honours Lower Division");
            } else {
                System.out.println("3rd class Honours");
            }
        } else {
            System.out.println("Invalid value.");
        }
    }

    private static void Calculator() {
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
}
