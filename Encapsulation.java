class BankAccount {

    // 🔒 Hidden data (Encapsulation)
    private String accountHolder;
    private double balance;

    // ✅ Constructor
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // ✅ Controlled deposit
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // ✅ Controlled withdrawal
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance / Invalid amount");
        }
    }

    // ✅ Read-only access
    public double getBalance() {
        return balance;
    }

    // ✅ Display method
    public void printDetails() {
        System.out.println(accountHolder + " balance: " + balance);
    }
}

public class Encapsulation {

    public static void main(String[] args) {

        BankAccount acc = new BankAccount("Irshad", 10000);

        // acc.balance = -50000; ❌ NOT allowed (private variable)
        acc.deposit(2000);
        acc.withdraw(5000);
        acc.withdraw(20000);   // ❌ Blocked by validation

        acc.printDetails();
    }
}