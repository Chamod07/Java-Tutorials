package tutorial1;

public class Challenges {

    protected static void Run() {
        System.out.println("* Program to get your name in initials *");
        Initials();
        System.out.println("\n* Program to convert Metres into Centimetres *");
        ConvertToCentimetres();
        System.out.println("\n* Program to convert Centigrade temperature into Fahrenheit *");
        ConvertToFahrenheit();
        System.out.println("\n* Program to calculate the Wage Bill and the Tax Pay of employees *");
        TaxPayCalculator();
    }

    private static void Initials() {
        System.out.print("Enter your first name: ");
        String firstName = Main.input.next();
        System.out.print("Enter your surname: ");
        String lastName = Main.input.next();
        System.out.println("Your name is: "+firstName.toUpperCase().substring(0,1)+lastName.toUpperCase().substring(0,1));

        //Alternative method:
        //  char firstName = input.next().charAt(0);
        //  char lastName = input.next().charAt(0);
        //  System.out.println("Your name is: "+firstName+lastName);
    }

    private static void ConvertToCentimetres() {
        System.out.print("Enter number in metres: ");
        double metre = Main.input.nextDouble();
        double centimetre = metre*100;
        System.out.println("The length in centimetres is "+centimetre+"cm");
    }

    private static void ConvertToFahrenheit() {
        System.out.print("Enter the temperature in Centigrade: ");
        double centigrade = Main.input.nextDouble();
        double fahrenheit = (9.0/5)*centigrade + 32;
        System.out.println("The temperature in Fahrenheits is "+fahrenheit);
    }

    private static void TaxPayCalculator() {
        final int manualPay = 500;
        final int skilledPay = 700;
        final int managementPay = 800;
        final double taxRate = 0.2;

        System.out.print("Enter the number of Manual employees: ");
        int manualCount = Main.input.nextInt();
        System.out.print("Enter the number of Skilled employees: ");
        int skilledCount = Main.input.nextInt();
        System.out.print("Enter the number of Management employees: ");
        int managementCount = Main.input.nextInt();

        long wageBill = ((manualCount*manualPay)+(skilledCount*skilledPay)+(managementCount*managementPay));
        System.out.println("The wage bill is: £"+wageBill);
        long taxPay = (long) (wageBill*taxRate);
        System.out.println("The approximate tax to pay is £"+taxPay);
    }
}
