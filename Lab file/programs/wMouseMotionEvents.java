// Write a Java program  to implement all mouse events and mouse motion events

import java.awt.*;
import java.awt.event.*;

public class wMouseMotionEvents extends Frame implements MouseListener, MouseMotionListener {
    private Label label;

    public wMouseMotionEvents() {
        label = new Label();
        add(label, BorderLayout.SOUTH); // add label to the bottom of the frame
        addMouseListener(this);
        addMouseMotionListener(this);
        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new wMouseMotionEvents();
    }

    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse clicked at (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mousePressed(MouseEvent e) {
        label.setText("Mouse pressed at (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseReleased(MouseEvent e) {
        label.setText("Mouse released at (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseEntered(MouseEvent e) {
        label.setText("Mouse entered at (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseExited(MouseEvent e) {
        label.setText("Mouse exited at (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseDragged(MouseEvent e) {
        label.setText("Mouse dragged at (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseMoved(MouseEvent e) {
        label.setText("Mouse moved at (" + e.getX() + ", " + e.getY() + ")");
    }
}