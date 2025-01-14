A comprehensive banking system designed using Java, featuring multiple account types and functionalities. This project demonstrates object-oriented programming principles with a focus on modularity and reusability.

Programming Language:
Java

Files and Classes Used:

SavingsAccount.java / SavingsAccount.class:
Implements the functionality specific to savings accounts, such as interest calculations and minimum balance requirements.
DebitAccount.java / DebitAccount.class:
Represents debit accounts, allowing transactions directly linked to account balances.
CreditAccount.java / CreditAccount.class:
Handles credit accounts, including credit limits, repayments, and balance tracking.
Account.java / Account.class:
A base class providing shared attributes and methods for all account types, ensuring code reuse and consistency.
Bank.java / Bank.class:
The core application logic that integrates all account types and manages user interactions. Handles tasks like account creation, transactions, and reporting.
Bank.txt:
A file used for data persistence, storing account details, transaction logs, or configurations.
Key Features:

Account Management: Supports multiple account types with unique rules and behaviors.
Object-Oriented Design: Modular class architecture for easy scalability and maintenance.
Data Persistence: Uses Bank.txt to store and retrieve data for consistent application states.
Core Functionalities:
Deposit and withdrawal operations.
Credit and debit tracking.
Savings account interest calculations.
This project serves as a strong example of how to build a scalable banking system using Java while adhering to software engineering best practices.
