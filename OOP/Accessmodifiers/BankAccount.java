package Accessmodifiers;

import java.util.*;

public class BankAccount {

    Scanner sc = new Scanner(System.in);
    String accountNumber;
    private double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit() {
        double amount;
        System.out.println("Enter the amount to deposit: ");
        amount = sc.nextDouble();
        balance += amount;
    }

    void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

    class Main {

        public static void main(String args[]) {
            BankAccount account = new BankAccount("12345", 1000.0);
           

            account.deposit();
            account.displayBalance();
        }

    }
