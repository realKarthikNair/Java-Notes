// Create a Java applet with three buttons ‘red’,’green’,’blue’. 
// Whenever user presses any button the corresponding color 
// should be seen as background color in an applet window.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class dColorBG extends JFrame implements ActionListener {
    private JButton redButton;
    private JButton greenButton;
    private JButton blueButton;

    public dColorBG() {
        // frame
        setTitle("Background Color");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // components
        redButton = new JButton("Red");
        greenButton = new JButton("Green");
        blueButton = new JButton("Blue");
        // action listeners
        redButton.addActionListener(this);
        greenButton.addActionListener(this);
        blueButton.addActionListener(this);
        // layout
        setLayout(new FlowLayout());
        add(redButton);
        add(greenButton);
        add(blueButton);
        // frame
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new dColorBG();
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == redButton) {
            getContentPane().setBackground(Color.RED);
        } else if (e.getSource() == greenButton) {
            getContentPane().setBackground(Color.GREEN);
        } else if (e.getSource() == blueButton) {
            getContentPane().setBackground(Color.BLUE);
        }
    }
}