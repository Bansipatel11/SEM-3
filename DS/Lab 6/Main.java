// BankAccount class definition
class BankAccount {
    private int accountNumber;
    private double balance;
    private String accountHolderName;

    // Constructor
    public BankAccount(int accountNumber, double balance, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully.");
        } else {
            System.out.println("Invalid amount. Deposit amount should be greater than zero.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println(amount + " withdrawn successfully.");
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Invalid amount. Withdraw amount should be greater than zero.");
        }
    }

    // Method to check balance
    public double checkBalance() {
        return balance;
    }

    // Getters and setters (optional, depending on requirements)
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
}

// Main class to demonstrate the usage
public class Main {
    public static void main(String[] args) {
        // Creating an array of BankAccount objects
        BankAccount[] accounts = new BankAccount[3]; // Example with 3 accounts

        // Initializing accounts
        accounts[0] = new BankAccount(1001, 5000.0, "John Doe");
        accounts[1] = new BankAccount(1002, 10000.0, "Jane Smith");
        accounts[2] = new BankAccount(1003, 1500.0, "Alice Johnson");

        // Performing operations on accounts
        // Example: Deposit money
        accounts[0].deposit(1000);
        // Example: Withdraw money
        accounts[1].withdraw(500);
        // Example: Check balance
        double balance = accounts[2].checkBalance();
        System.out.println("Balance of account 1003: " + balance);
    }
}
