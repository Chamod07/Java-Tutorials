package tutorial1;

public class MyFirstJava {
    protected static void Run() {
        RunningTotal();
        GreetUser();
        PrintMenu();
    }

    private static void RunningTotal() {
        int runningTotal = 0;
        System.out.println("Variable value is: "+runningTotal);
        runningTotal+=5;
        System.out.println("Variable value is: "+runningTotal);
        runningTotal+=8;
        System.out.println("Variable value is: "+runningTotal);
        runningTotal+=2;
        System.out.println("Variable value is: "+runningTotal);
        runningTotal+=3;
        System.out.println("Variable value is: "+runningTotal);
    }

    private static void GreetUser() {
        System.out.print("Please insert your name: ");
        String name = Main.input.nextLine();
        System.out.println("Hello "+name);
    }

    private static void PrintMenu() {
        for(int i = 0; i<8; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.println("* MENU *");
        for(int i = 0; i<8; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
