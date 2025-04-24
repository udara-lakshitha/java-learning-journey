public class BankAccountDemo {
    public static void main(String[] args) {
        System.out.println("--- Bank Account Demo ---");

        BankAccount account1 = new BankAccount("ACC1001", 500.75);
        BankAccount account2 = new BankAccount("ACC1002", 100.00);
        BankAccount account3 = new BankAccount("ACC1003", -50.00);

        System.out.println("\n--- Initial States ---");
        System.out.println(account1);
        System.out.println(account2);
        System.out.println(account3);

        System.out.println("\n--- Transactions for " + account1.getAccountnumber() + " ---");
        account1.deposit(150.25);
        account1.withdraw(100.00);
        account1.withdraw(600.0);
        account1.deposit(-20.00);

        System.out.println("\n--- Transactions for " + account2.getAccountnumber() + " ---");
        account2.withdraw(30.00);
        System.out.println("Withdrawal of 80.00 successfull? " + account2.withdraw(80.00));
        account2.deposit(250.50);

        System.out.println("\n--- Final Balances ---");
        System.out.println("Account " + account1.getAccountnumber() + " final balance : " + String.format("%.2f", account1.getBalance()));
        System.out.println("Account " + account2.getAccountnumber() + " final balance : " + String.format("%.2f", account2.getBalance()));
        System.out.println("Account " + account3.getAccountnumber() + " final balance : " + String.format("%.2f", account3.getBalance()));
    }    
}
