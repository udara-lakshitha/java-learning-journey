# Project 012: Basic Class - BankAccount

This project demonstrates basic Object-Oriented Programming (OOP) concepts by creating and using a `BankAccount` class. It reinforces encapsulation and introduces simple business logic within methods.

## Core Concepts Learned

*   Defining classes (`BankAccount`).
*   Creating objects/instances (`new BankAccount(...)`).
*   Using `private` fields (`balance`, `accountNumber`) for encapsulation.
*   Implementing constructors for object initialization.
*   Defining `public` methods (`deposit`, `withdraw`, `getBalance`, `getAccountNumber`) for behavior and controlled access.
*   Implementing conditional logic within methods (deposit/withdrawal validation).
*   Returning values from methods (boolean from `withdraw`, double from `getBalance`).
*   Separating the class definition (`BankAccount.java`) from the testing/driver class (`BankAccountDemo.java` with `main`).
*   Overriding the `toString()` method for better object representation.
*   Using `String.format()` for basic currency formatting.

## How to Run

1.  Ensure you have a Java Development Kit (JDK) installed.
2.  Open a terminal or command prompt.
3.  Navigate to the `project-012-basic-class-bankaccount` directory.
4.  Compile both Java files:
    ```bash
    javac BankAccount.java BankAccountDemo.java
    # Or: javac *.java
    ```
5.  Run the `BankAccountDemo` class (which contains the `main` method):
    ```bash
    java BankAccountDemo
    ```
6.  Observe the output showing account creation, transactions, error messages, and final balances.

## Example Output Snippet
```
--- Bank Account Demo ---
Account ACC1001 created with initial balance: 500.75
Account ACC1002 created with initial balance: 100.00
Warning: Initial balance cannot be negative. Set to 0 for account ACC1003
Account ACC1003 created with initial balance: 0.00
--- Initial States ---
BankAccount[Account Number=ACC1001, Balance=500.75]
BankAccount[Account Number=ACC1002, Balance=100.00]
BankAccount[Account Number=ACC1003, Balance=0.00]
--- Transactions for ACC1001 ---
Deposited: 150.25 into account ACC1001. New balance: 651.00
Withdrew: 100.00 from account ACC1001. New balance: 551.00
Error: Insufficient funds for withdrawal of 600.00 from account ACC1001. Current balance: 551.00
Error: Deposit amount must be positive for account ACC1001
... (output continues) ...
--- Final Balances ---
Account ACC1001 final balance: 551.00
Account ACC1002 final balance: 320.50
Account ACC1003 final balance: 0.00