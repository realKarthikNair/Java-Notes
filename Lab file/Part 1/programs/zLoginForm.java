// Create a login form using AWT controls like labels, buttons, textboxes, 
// checkboxes, list, checkboxgroup. The selected checkbox item names should be displayed

import java.awt.*;
import java.awt.event.*;

public class zLoginForm extends Frame implements ActionListener {
    private TextField usernameField;
    private TextField passwordField;
    private Checkbox rememberMeCheckbox;
    private Button loginButton;

    public zLoginForm() {
        // frame
        setTitle("Login Form");
        setSize(300, 200);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
        // create the components
        Label usernameLabel = new Label("Username:");
        Label passwordLabel = new Label("Password:");
        usernameField = new TextField(20);
        passwordField = new TextField(20);
        passwordField.setEchoChar('*');
        rememberMeCheckbox = new Checkbox("Remember me");
        loginButton = new Button("Login");
        loginButton.addActionListener(this);
        // set up the layout
        setLayout(new GridLayout(4, 2));
        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(new Label());
        add(rememberMeCheckbox);
        add(new Label());
        add(loginButton);
        setVisible(true);
    }

    public static void main(String[] args) {
        new zLoginForm();
    }

    public void actionPerformed(ActionEvent e) {
        String username = usernameField.getText();
        String password = passwordField.getText();
        boolean rememberMe = rememberMeCheckbox.getState();
        System.out.println("Logged in as " + username);
    }
}