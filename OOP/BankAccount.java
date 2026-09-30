import java.util.*;

public class BankAccount {

    Scanner sc = new Scanner(System.in);

    String accountHolder;
    String accountNumber;
    Double balance;
    int amount;

    void deposit() {
        System.out.println("Enter the amount to deposit: ");
        amount = sc.nextInt();
        balance += amount;

    }

    void withdraw() {
        System.out.println("Enter the amount to withdraw: ");
        amount = sc.nextInt();
        if (balance >= amount) {
            balance -= amount;
        }

    }

    void balance() {

        System.out.println("balance: " + balance);

    }

    public static void main(String args[]) {

        BankAccount account1 = new BankAccount();
        account1.accountHolder = "Abhishek";
        account1.accountNumber = "9813999461AM";
        account1.balance = 0.0;

        account1.deposit();
        account1.withdraw();
        account1.balance();

        BankAccount account2 = new BankAccount();
        account2.accountHolder = "Tudu";
        account2.accountNumber = "7205575138TM";
        account2.balance = 0.0;

        account2.deposit();
        account2.withdraw();
        account2.balance();


    }
        
}
