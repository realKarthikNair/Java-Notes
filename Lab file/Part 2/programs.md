### 1.  Create a login form using Swing controls like Jlabels, Jbuttons, Jtextboxes, Jcheckboxes.
```c

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
```

### 2.  Write a Java program to show all layout managers. (4 layout managers)
```c

import javax.swing.*;
import java.awt.*;

public class bLayoutManagers extends JFrame {
    public bLayoutManagers() {
        // frame
        setTitle("Layout Managers");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // components
        JLabel label1 = new JLabel("Label 1");
        JLabel label2 = new JLabel("Label 2");
        JLabel label3 = new JLabel("Label 3");
        JLabel label4 = new JLabel("Label 4");
        JTextField textField = new JTextField(20);
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");
        // layouts
        setLayout(new GridLayout(2, 2));
        JPanel panel1 = new JPanel(new BorderLayout());
        panel1.add(label1, BorderLayout.NORTH);
        panel1.add(textField, BorderLayout.CENTER);
        panel1.add(button1, BorderLayout.SOUTH);
        add(panel1);
        JPanel panel2 = new JPanel(new FlowLayout());
        panel2.add(label2);
        panel2.add(button2);
        add(panel2);
        JPanel panel3 = new JPanel(new GridLayout(2, 2));
        panel3.add(label3);
        panel3.add(button3);
        panel3.add(new JLabel());
        panel3.add(new JLabel());
        add(panel3);
        JPanel panel4 = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        panel4.add(label4, c);
        c.gridy = 1;
        panel4.add(button4, c);
        add(panel4);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new bLayoutManagers();
    }
}
```

### 3.  Create an applet with two buttons named ‘audio’ and ‘image’. 
```c
// When user will press button ‘audio’ then an audio file should play in applet, 
// and if user press button ‘image’ then an image should see in applet window

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.sound.sampled.*;
import javax.imageio.ImageIO;

public class cImageAudio extends JFrame implements ActionListener {
    private JButton audioButton;
    private JButton imageButton;

    public cImageAudio() {
        // frame
        setTitle("Image and Audio");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // components
        audioButton = new JButton("Audio");
        imageButton = new JButton("Image");
        // action listeners
        audioButton.addActionListener(this);
        imageButton.addActionListener(this);
        // layout
        setLayout(new FlowLayout());
        add(audioButton);
        add(imageButton);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new cImageAudio();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == audioButton) {
            // try play the audio file else 
            try {
                File audioFile = new File("res/temp.wav");
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
                Clip clip = AudioSystem.getClip();
                clip.open(audioStream);
                clip.start();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else if (e.getSource() == imageButton) {
            // display the image
            try {
                File imageFile = new File("res/linux.jpg");
                Image image = ImageIO.read(imageFile);
                ImageIcon icon = new ImageIcon(image);
                JLabel label = new JLabel(icon);
                JOptionPane.showMessageDialog(this, label);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
```

