# ATM_java
A simple Java-based ATM simulation with a user-friendly Swing GUI for basic banking operations.

# ATM System Project

This project is a simple ATM system implemented in Java using the Swing framework for a graphical user interface (GUI). It simulates basic ATM functionalities such as balance checking, money deposit, withdrawal, and receipt printing.

## Features

- **Login System:** Users can log in using a predefined PIN.
- **Balance Inquiry:** Check the current account balance.
- **Deposit:** Add money to the account.
- **Withdrawal:** Withdraw money from the account, with a check for sufficient funds.
- **Receipt Printing:** Print a receipt showing the balance, total deposited, and total withdrawn amounts.
- **Exit:** Exit the ATM system.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed on your machine.
- An Integrated Development Environment (IDE) such as IntelliJ IDEA, Eclipse, or NetBeans.

### Installation

1. Clone the repository:
2. Open the project in your preferred IDE.
3. Compile and run the ATM_COMPLETED.java file.

Usage
1. Upon running the program, you will be prompted to enter your PIN.
2. If the PIN is correct, you will be prompted to enter your name.
3. Once logged in, you can:
   * Check your balance by clicking the "Check Balance" button.
   * Add an amount to your account by clicking the "Add Amount" button.
   * Withdraw an amount from your account by clicking the "Take Amount" button.
   * Print a receipt by clicking the "Take Receipt" button.
   * Exit the system by clicking the "Exit" button.
     
Code Explanation
* The project uses Java Swing for the GUI components.
* The main class ATM_COMPLETED initializes the GUI components and handles the logic for each ATM operation through button action listeners.
* The balance, deposit amount, and withdrawal amount are managed through static variables.
  
Contributing
   * Fork the repository.
   * Create your feature branch (git checkout -b feature/your-feature).
   * Commit your changes (git commit -m 'Add some feature').
   * Push to the branch (git push origin feature/your-feature).
   * Open a pull request.
     
License
This project is licensed under the MIT License - see the LICENSE file for details.

Acknowledgments
This project is for educational purposes and is a basic implementation of an ATM system.
Inspired by the need to understand Java Swing and basic ATM functionalities.
