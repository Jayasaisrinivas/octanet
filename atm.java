import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your card");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int pin = 9080;
        System.out.print("Enter your pin: ");
        int password = scanner.nextInt();
        int balance = 5000;
        if (pin == password) {
            System.out.println("Account Authorized!");
            while (true) {
                System.out.println("Select your transaction\n 1.Balance Inquiry \n 2.Deposit \n 3.Withdraw \n 4.Reset Your pin \n 5.Exit");
                System.out.print("Enter valid option: ");
                int op = scanner.nextInt();
                if (op == 1) {
                    System.out.println("Available Balance: " + balance);
                } else if (op == 2) {
                    System.out.print("Enter the amount to deposit: ");
                    int deposit = scanner.nextInt();
                    balance += deposit;
                    System.out.println("Balance after depositing the amount: " + balance);
                } else if (op == 3) {
                    System.out.print("Enter the amount to withdraw: ");
                    int withdraw = scanner.nextInt();
                    if (withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Balance after withdrawing the amount: " + balance);
                    } else {
                        System.out.println("Insufficient balance");
                    }
                } else if (op == 4) {
                    System.out.print("Enter new pin: ");
                    int pin1 = scanner.nextInt();
                    System.out.print("Confirm the pin: ");
                    int pin2 = scanner.nextInt();
                    if (pin1 == pin2) {
                        pin = pin1;
                        System.out.println("Pin has successfully reset");
                    } else {
                        System.out.println("Confirm pin and new pin do not match");
                    }
                } else if (op == 5) {
                    break;
                } else {
                    System.out.println("You entered a wrong option. Try again.");
                }
                System.out.print("Do you want to have another transaction (y/n)? ");
                String ch = scanner.next();
                if (!ch.equalsIgnoreCase("y")) {
                    break;
                }
            }
        } else {
            System.out.println("You entered an incorrect pin");
        }
        System.out.println("Thank You");
    }
}

