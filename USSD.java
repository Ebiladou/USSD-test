public class USSD {
    public static void main(String[] args) {
        System.out.println("Welcome to UBA Service");

        if (args.length > 0) {
            String ussdCode = args[0];

            if (ussdCode.equals("*919#")) {
                displayMenu();
                int option = getSelectedOption(args);

                switch (option) {
                    case 1:
                        checkBalance();
                        break;
                    case 2:
                        makeTransfer(args);
                        break;
                    case 3:
                        buyAirtime(args);
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                        break;
                }
            } else {
                System.out.println("Invalid USSD code");
            }
        } else {
            System.out.println("Usage: java USSDS <USSD_CODE> <OPTION>");
        }

        System.out.println("Thank you for using UBA Banking Service!");
    }

    public static void displayMenu() {
        System.out.println("Select an option:");
        System.out.println("1. Check balance");
        System.out.println("2. Make transfer");
        System.out.println("3. Buy airtime");
    }

    public static int getSelectedOption(String[] args) {
        if (args.length > 1) {
            try {
                return Integer.parseInt(args[1]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        } else {
            System.out.println("Invalid input. Please enter an option number.");
        }
        return 0;
    }

    public static void checkBalance() {
        System.out.println("Your account balance is $1000.00");
    }

    public static void makeTransfer(String[] args) {
            System.out.println("Provide recipient's account and amount.");
    }

    public static void buyAirtime(String[] args) {
            System.out.println("Enter phone number and amount.");
    }
}