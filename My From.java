
import java.util.*;
import javax.swing.*;

public class My Form extends JFrame {

    private JTextField nameField;
    private JTextField ageField;
    private JButton submitButton;
    private JLabel messageLabel;

    public MyForm() {
        super("My Form");

        // Create components
        nameField = new JTextField(10);
        ageField = new JTextField(10);
        submitButton = new JButton("Submit");
        messageLabel = new JLabel("");

        // Add action listeners
        submitButton.addActionListener(e -> {
            if (validateInput()) {
                handleFormSubmission();
            } else {
                messageLabel.setText("Please enter valid input.");
            }
        });

        // Set layout and add components to frame
        JPanel panel = new JPanel();
        panel.add(new JLabel("Name:"));
        panel.add(nameField);
        panel.add(new JLabel("Age:"));
        panel.add(ageField);
        panel.add(submitButton);
        panel.add(messageLabel);
        add(panel);

        // Set frame properties
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private boolean validateInput() {
        String name = nameField.getText();
        String age = ageField.getText();
        return!name.isEmpty() &&!age.isEmpty() && isNumeric(age);
    }

    private boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private void handleFormSubmission() {
        String name = nameField.getText();
        String age = ageField.getText();
        messageLabel.setText("Thank you for submitting " + name + " with age " + age + ".");
    }

    public static void main(String[] args) {
        new MyForm();
    }

}
