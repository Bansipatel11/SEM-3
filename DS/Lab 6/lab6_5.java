import java.util.Scanner;

 public class BankAccount {
    private String accountNumber;
    private double balance;
    private String accountHolderName;

    // Constructor
    public BankAccount(String accountNumber, double balance, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited $" + amount);
        } else {
            System.out.println("Deposit amount must be greater than zero.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Successfully withdrew $" + amount);
            } else{
                System.out.println("Withdraw amount must be greater than of your balance");
            }
        } else{
            System.out.println("Withdraw amount must be greater than zero");
        }
    }
      public double checkBalance() {
        return balance;
    }

    // Getters and setters (optional, depending on requirements)
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }
}
    
public class lab6_5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
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
