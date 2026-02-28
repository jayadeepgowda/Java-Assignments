//Create a class BankAccount with attributes accountNumber and balance, and methods deposit and withdraw. Use encapsulation.

package Module3;

class BankAccount {

    private String accountNumber;
    private double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}

public class Bank {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount("ACC123", 5000);

        acc.deposit(1000);
        acc.withdraw(2000);

        System.out.println("Current Balance: " + acc.getBalance());
    }
}
