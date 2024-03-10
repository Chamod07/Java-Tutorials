package tutorial1;

public class MarkAverage {
    protected static void markAverage() {
        System.out.print("Enter first exam marks: ");
        int mark1 = Main.input.nextInt();
        System.out.print("Enter second exam marks: ");
        int mark2 = Main.input.nextInt();
        System.out.print("Enter third exam marks: ");
        int mark3 = Main.input.nextInt();

        System.out.println("The average of the marks entered is "+(mark1+mark2+mark3/3));
    }
}
