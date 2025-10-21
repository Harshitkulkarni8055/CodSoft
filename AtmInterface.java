import java.util.Scanner;

public class AtmInterface {

    static double balance = 1000.00; 
    public static double checkBalance() {
        return balance;
    }

    public static void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposit successful. Your new balance is: Rs"+balance);
        } else {
            System.out.println("Invalid amount. Deposit must be greater than 0.");
        }
    }
    public static void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawal successful. Your new balance is: Rs" + balance);
        } else if (amount > balance) {
            System.out.println("Withdrawal failed. Insufficient funds.");
        } else {
            System.out.println("Invalid amount. Withdrawal must be greater than 0.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("\n-----------------------------");
            System.out.println("ATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Please select an option (1-4): ");

            int choice = scanner.nextInt();
            double amount;
            switch (choice) {
                case 1:
                    System.out.println("Your current balance is: Rs" + checkBalance());
                    break;
                
                case 2:
                    System.out.print("Enter amount to deposit: Rs");
                    amount = scanner.nextDouble();
                    deposit(amount);
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: Rs");
                    amount = scanner.nextDouble();
                    withdraw(amount);
                    break;

                case 4:
                    running = false; 
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option. Please select from 1-4.");
            }
        }
        
        scanner.close();
    }
}