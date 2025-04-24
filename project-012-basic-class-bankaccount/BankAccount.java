public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialAmount) {
        this.accountNumber = accountNumber;

        if (initialAmount < 0) {
            this.balance = 0.0;
            System.out.println("Warning: Initial balance cannot be negative. Set to 0 for account "
            + this.accountNumber);
        } else {
            this.balance = initialAmount;
        }
        System.out.println("Account " + this.accountNumber + " created with initial balance "
        + String.format("%.2f", this.balance));
    }

    public String getAccountnumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Error: Deposit amount must be positive for account " + this.accountNumber);
        } else {
            this.balance += amount;
            System.out.println("Deposited " + String.format("%.2f", amount) + " for account "
            + this.accountNumber + ". New balance is " + String.format("%.2f", this.balance));
        }
    }

    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Withdrawal amount must be positive for account " + this.accountNumber);
            return false;
        } else if (amount > this.balance) {
            System.out.println("Error: Insufficient funds for withdrawal of " + String.format("%.2f", amount)
            + " from account " + this.accountNumber + ".Current balance is " + String.format("%.2f", this.balance));
            return false;
        } else {
            this.balance -= amount;
            System.out.println("Withdrew: " + String.format("%.2f", amount) + " from account "
            + this.accountNumber + ".New balance is " + String.format("%.2f", this.balance));
            return true;
        }
    }

    @Override
    public String toString() {
        return "BankAccount [accountNumber=" + this.accountNumber + ", balance=" + String.format("%.2f", this.balance) + "]";
    }
}
