package Day3;

import java.util.Scanner;

public class miniATM {

    // Deposit method
    static double deposit(double balance, double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount. Deposit must be positive.");
            return balance;
        }
        balance += amount; // assignment operator
        System.out.printf("Deposited. Balance: %.2f%n", balance);
        return balance;
    }

    // Withdraw method
    static double withdraw(double balance, double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount. Withdrawal must be positive.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount; // assignment operator
            System.out.printf("Withdrawn. Balance: %.2f%n", balance);
        }
        return balance;
    }

    // Change PIN method
    static int changePin(int oldPin, int enteredPin, int newPin) {
        if (oldPin == enteredPin && newPin > 0) { // relational + logical
            System.out.println("PIN changed successfully.");
            return newPin;
        } else {
            System.out.println("Incorrect PIN or invalid new PIN.");
            return oldPin;
        }
    }

    // Print balance method
    static void printBalance(double balance) {
        System.out.printf("Current Balance: %.2f%n", balance);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 0.0;
        int pin = 1234; // default PIN

        while (true) {

            System.out.println("\n1.Deposit  2.Withdraw  3.Check Balance  4.Change PIN  5.Exit");
            System.out.print("Enter option: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Amount: ");
                double amount = sc.nextDouble();
                balance = deposit(balance, amount);

            } else if (choice == 2) {
                System.out.print("Enter PIN: ");
                int enteredPin = sc.nextInt();

                if (enteredPin != pin) {
                    System.out.println("Wrong PIN.");
                    continue;
                }

                System.out.print("Amount: ");
                double amount = sc.nextDouble();
                balance = withdraw(balance, amount);

            } else if (choice == 3) {
                printBalance(balance);

            } else if (choice == 4) {
                System.out.print("Enter old PIN: ");
                int enteredPin = sc.nextInt();

                System.out.print("Enter new PIN: ");
                int newPin = sc.nextInt();

                pin = changePin(pin, enteredPin, newPin);

            } else if (choice == 5) {
                System.out.println("Thank you. Exiting...");
                break;

            } else {
                System.out.println("Invalid choice.");
                continue;
            }
        }

        sc.close();
    }
}
