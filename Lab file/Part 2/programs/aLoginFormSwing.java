// Create a login form using Swing controls like Jlabels, Jbuttons, Jtextboxes, Jcheckboxes.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class aLoginFormSwing extends JFrame implements ActionListener {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JCheckBox rememberMeCheckbox;
    private JButton loginButton;

    public aLoginFormSwing() {
        // frame 
        setTitle("Login Form");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // components
        JLabel usernameLabel = new JLabel("Username:");
        JLabel passwordLabel = new JLabel("Password:");
        usernameField = new JTextField(20);
        passwordField = new JPasswordField(20);
        rememberMeCheckbox = new JCheckBox("Remember me");
        loginButton = new JButton("Login");
        loginButton.addActionListener(this);
        // layout
        JPanel panel = new JPanel(new GridLayout(4, 2));
        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(new JLabel());
        panel.add(rememberMeCheckbox);
        panel.add(new JLabel());
        panel.add(loginButton);
        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new aLoginFormSwing();
    }

    public void actionPerformed(ActionEvent e) {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());
        boolean rememberMe = rememberMeCheckbox.isSelected();
        JOptionPane.showMessageDialog(this, "Logged in as " + username);
    }
}