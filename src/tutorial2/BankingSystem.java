package tutorial2;

public class BankingSystem {
    protected static void BankApp() {
        double[] account = new double[2];
        boolean endLoop = false;

        System.out.println("Welcome to the Bank!");
        System.out.print("Enter your bank balance: ");
        account[0] = Main.input.nextDouble();

        while (!endLoop) {
            System.out.print("1. Deposit\n2. Withdrawal\n3. Check for fraud\n0. Quit\nSelect an option: ");
            char option = Main.input.next().charAt(0);
            if (option!='3' && option!='0') {
                System.out.print("Enter amount for transaction: ");
                account[1] = Main.input.nextDouble();
            }

            switch (option) {
                case '0':
                    endLoop = true;
                    break;
                case '1':
                    Deposit(account);
                    break;
                case '2':
                    Withdraw(account);
                    break;
                case '3':
                    CheckFraud(account);
                    break;
                default:
                    System.out.println("Select the correct transaction type.");
            }
        }
    }

    private static void Deposit(double[] account) {
        account[0] += account[1];
        System.out.println("The account balance is $"+account[0]);
    }

    private static void Withdraw(double[] account) {
        if (account[1]<=account[0]) {
            account[0] -= account[1];
            System.out.println("The account balance is $" + account[0]);
        } else {
            System.out.println("Not sufficient account balance to make the transaction");
        }
    }

    private static void CheckFraud(double[] account) {
        if (account[0]<100) {
            System.out.println("Account balance is below the threshold value of $100");
        } else
            System.out.println("No frauds.");
        System.out.println("The account balance is $"+account[0]);
    }

}
