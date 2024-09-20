import java.util.Random;

abstract class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount() {
       
        Random random = new Random();
        this.accountNumber = String.format("%012d", random.nextInt(1000000000));
        this.balance = 0.0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of " + amount + " successful.");
    }

    public void withdraw(double amount){
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " successful.");
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }

    public abstract void displayAccountDetails();
}

// Save Account class
class SaveAccount extends BankAccount {
    private static final double INTEREST_RATE = 2.5;

    public SaveAccount() {
        super();
    }

    public double calculateInterest() {
        return (getBalance() * INTEREST_RATE) / 100;
    }

    @Override
    public void displayAccountDetails() {
        System.out.println("Save Account Details:");
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Balance: " + getBalance());
        System.out.println("Interest Rate: " + INTEREST_RATE);
    }
}

// Pay Account class
class PayAccount extends BankAccount {
    public PayAccount() {
        super();
    }

    @Override
    public void displayAccountDetails() {
        System.out.println("Pay Account Details:");
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Balance: " + getBalance());
    }
}

// Main class
public class IDBCBank {
    public static void main(String[] args) {
        SaveAccount saveAccount = new SaveAccount();
        saveAccount.deposit(10);
        saveAccount.withdraw(500);
        saveAccount.displayAccountDetails();
        System.out.println("Interest: " + saveAccount.calculateInterest());

        PayAccount payAccount = new PayAccount();
        payAccount.deposit(500);
        payAccount.withdraw(80);
        payAccount.displayAccountDetails();
    }
}