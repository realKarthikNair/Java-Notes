// Write a Java program  to implement keyboard events

import java.awt.*;
import java.awt.event.*;

public class xKeyboardEvents extends Frame implements KeyListener {
    private Label label;

    public xKeyboardEvents() {
        label = new Label();
        add(label, BorderLayout.SOUTH);
        addKeyListener(this);
        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new xKeyboardEvents();
    }

    public void keyPressed(KeyEvent e) {
        label.setText("Key pressed: " + e.getKeyChar());
    }

    public void keyReleased(KeyEvent e) {
        label.setText("Key released: " + e.getKeyChar());
    }

    public void keyTyped(KeyEvent e) {
        label.setText("Key typed: " + e.getKeyChar());
    }
}