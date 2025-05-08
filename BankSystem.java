import java.util.*;

// Class to represent a customer's bank account
class Account {
    private String accountNumber;
    private String customerName;
    private double balance;

    // Constructor to initialize account details
    public Account(String accountNumber, String customerName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited into account " + accountNumber);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn from account " + accountNumber);
        } else {
            System.out.println("Invalid or insufficient funds for withdrawal.");
        }
    }

    // Getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    // Method to display account details
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Balance: $" + balance);
    }
}

// Class to represent a bank that manages multiple accounts
class Bank {
    private Map<String, Account> accounts;

    // Constructor to initialize the bank
    public Bank() {
        accounts = new HashMap<>();
    }

    // Method to add a new account
    public void addAccount(Account account) {
        if (!accounts.containsKey(account.getAccountNumber())) {
            accounts.put(account.getAccountNumber(), account);
            System.out.println("Account " + account.getAccountNumber() + " added.");
        } else {
            System.out.println("Account already exists.");
        }
    }

    // Method to remove an existing account
    public void removeAccount(String accountNumber) {
        if (accounts.remove(accountNumber) != null) {
            System.out.println("Account " + accountNumber + " removed.");
        } else {
            System.out.println("Account not found.");
        }
    }

    // Method to deposit money into a specific account
    public void depositToAccount(String accountNumber, double amount) {
        Account acc = accounts.get(accountNumber);
        if (acc != null) {
            acc.deposit(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    // Method to withdraw money from a specific account
    public void withdrawFromAccount(String accountNumber, double amount) {
        Account acc = accounts.get(accountNumber);
        if (acc != null) {
            acc.withdraw(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    // Method to display details of all accounts
    public void displayAllAccounts() {
        for (Account acc : accounts.values()) {
            acc.displayAccountInfo();
            System.out.println("-------------------------");
        }
    }
}

// Main class to test the Bank and Account classes
public class BankSystem {
    public static void main(String[] args) {
        // Create bank
        Bank bank = new Bank();

        // Create some accounts
        Account acc1 = new Account("1001", "Durjoy Barua", 5000.00);
        Account acc2 = new Account("1002", "Bob Marley", 3000.00);

        // Add accounts to the bank
        bank.addAccount(acc1);
        bank.addAccount(acc2);

        // Perform transactions
        bank.depositToAccount("1001", 1000);
        bank.withdrawFromAccount("1002", 500);

        // Try removing an account
        bank.removeAccount("1002");

        // Try to operate on a removed account
        bank.withdrawFromAccount("1002", 100);

        // Display all remaining accounts
        bank.displayAllAccounts();
    }
}
