package tutorial4;

public class Section1 {
    public static void main(String[] args) {
        System.out.println("Q1. Arrays creation, access and update.");
        ArraysCreation();
    }

    private static void ArraysCreation() {
        int[] markArray = new int[6];
        for (int i=0; i<markArray.length; i++) {
            System.out.print("Enter mark "+(i+1)+": ");
            markArray[i] = Main.input.nextInt();
        }
        short failed = 0;
        int sum = 0;
        double average;
        System.out.print("Marks: ");
        for (int mark : markArray) {
            System.out.print(mark+" ");
            if (mark<40) failed += 1;
            sum+=mark;
        }
        average= (double) sum /markArray.length;
        System.out.println();
        System.out.println("Number of failed students = "+failed);
        System.out.println("Average of the students' marks = "+average);
    }
}
