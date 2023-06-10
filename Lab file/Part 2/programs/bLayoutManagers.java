// Write a Java program to show all layout managers. (4 layout managers)

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