import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ATM_COMPLETED {
    private static int pin = 1234;
    private static int balance = 10000;
    private static int AddAmount = 0;
    private static int TakeAmount = 0;
    private static String name = "";

    public static void main(String[] args) {
        JFrame frame = new JFrame("ATM System");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new CardLayout());

        JPanel loginPanel = new JPanel();
        loginPanel.setLayout(null);
        loginPanel.setBackground(new Color(0, 153, 153));

        JLabel pinLabel = new JLabel("Enter your PIN:");
        pinLabel.setBounds(50, 30, 200, 25);
        pinLabel.setForeground(Color.WHITE);
        loginPanel.add(pinLabel);

        JPasswordField pinField = new JPasswordField();
        pinField.setBounds(180, 30, 120, 25);
        loginPanel.add(pinField);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(180, 70, 80, 25);
        loginPanel.add(loginButton);

        JLabel nameLabel = new JLabel("Enter your name:");
        nameLabel.setBounds(50, 110, 200, 25);
        nameLabel.setForeground(Color.WHITE);
        nameLabel.setVisible(false);
        loginPanel.add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(180, 110, 120, 25);
        nameField.setVisible(false);
        loginPanel.add(nameField);

        JButton submitNameButton = new JButton("Submit");
        submitNameButton.setBounds(180, 150, 80, 25);
        submitNameButton.setVisible(false);
        loginPanel.add(submitNameButton);

        JTextArea outputArea = new JTextArea();
        outputArea.setBounds(50, 190, 400, 120);
        outputArea.setBackground(new Color(0, 153, 153));
        outputArea.setForeground(Color.WHITE);
        outputArea.setEditable(false);
        loginPanel.add(outputArea);

        JButton checkBalanceButton = new JButton("Check Balance");
        checkBalanceButton.setBounds(50, 320, 150, 25);
        checkBalanceButton.setVisible(false);
        loginPanel.add(checkBalanceButton);

        JButton addAmountButton = new JButton("Add Amount");
        addAmountButton.setBounds(210, 320, 150, 25);
        addAmountButton.setVisible(false);
        loginPanel.add(addAmountButton);

        JButton takeAmountButton = new JButton("Take Amount");
        takeAmountButton.setBounds(370, 320, 150, 25);
        takeAmountButton.setVisible(false);
        loginPanel.add(takeAmountButton);

        JButton takeReceiptButton = new JButton("Take Receipt");
        takeReceiptButton.setBounds(50, 350, 150, 25);
        takeReceiptButton.setVisible(false);
        loginPanel.add(takeReceiptButton);

        JButton exitButton = new JButton("Exit");
        exitButton.setBounds(210, 350, 150, 25);
        exitButton.setVisible(false);
        loginPanel.add(exitButton);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputPin = new String(pinField.getPassword());
                try {
                    int password = Integer.parseInt(inputPin);
                    if (password == pin) {
                        pinLabel.setVisible(false);
                        pinField.setVisible(false);
                        loginButton.setVisible(false);

                        nameLabel.setVisible(true);
                        nameField.setVisible(true);
                        submitNameButton.setVisible(true);
                    } else {
                        outputArea.setText("Wrong PIN. Try again.\n");
                    }
                } catch (NumberFormatException ex) {
                    outputArea.setText("Invalid PIN format. Use numbers only.\n");
                }
            }
        });

        submitNameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                name = nameField.getText();
                outputArea.setText("Welcome " + name + "!\n");

                nameLabel.setVisible(false);
                nameField.setVisible(false);
                submitNameButton.setVisible(false);

                checkBalanceButton.setVisible(true);
                addAmountButton.setVisible(true);
                takeAmountButton.setVisible(true);
                takeReceiptButton.setVisible(true);
                exitButton.setVisible(true);
            }
        });

        checkBalanceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputArea.setText("Your current balance is: " + balance);
            }
        });

        addAmountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputAmount = JOptionPane.showInputDialog("Enter amount to deposit:");
                try {
                    AddAmount = Integer.parseInt(inputAmount);
                    balance += AddAmount;
                    outputArea.setText("Successfully credited. New balance is: " + balance);
                } catch (NumberFormatException ex) {
                    outputArea.setText("Invalid amount format. Use numbers only.\n");
                }
            }
        });

        takeAmountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputAmount = JOptionPane.showInputDialog("Enter amount to withdraw:");
                try {
                    TakeAmount = Integer.parseInt(inputAmount);
                    if (TakeAmount > balance) {
                        outputArea.setText("Insufficient balance. Try a lesser amount.\n");
                    } else {
                        balance -= TakeAmount;
                        outputArea.setText("Successfully withdrawn. New balance is: " + balance);
                    }
                } catch (NumberFormatException ex) {
                    outputArea.setText("Invalid amount format. Use numbers only.\n");
                }
            }
        });

        takeReceiptButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputArea.setText("Welcome to All in One Mini ATM\n");
                outputArea.append("Available balance: " + balance + "\n");
                outputArea.append("Amount deposited: " + AddAmount + "\n");
                outputArea.append("Amount withdrawn: " + TakeAmount + "\n");
                outputArea.append("Thanks for banking with us\n");
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputArea.setText("Thank you for using our ATM service. Goodbye!");
            }
        });

        frame.add(loginPanel);
        frame.setVisible(true);
    }
}
