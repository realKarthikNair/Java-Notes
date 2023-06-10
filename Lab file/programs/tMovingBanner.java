// Write a Java program  to show moving banner

import javax.swing.*;
import java.awt.*;

public class tMovingBanner extends JPanel implements Runnable {
    private String message = "Moving Banner Text"; // The message to display
    private int x = 0; // coordinates of the message
    private int y = 100; 
    private int delay = 50; // The delay between updates

    public tMovingBanner() {
        Thread thread = new Thread(this); // updates the position of the banner
        thread.start();
    }

    
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // clears the screen and prepares it for redrawing
        g.drawString(message, x, y); // draws the message at the specified coordinates
    }

    // Update the position of the banner.
    // Override the run method of the Runnable interface.
    public void run() {
        while (true) {
            x += 5;
            if (x > getWidth()) {
                x = -100;
            }
            repaint();
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Moving Banner");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.add(new tMovingBanner());
        frame.setVisible(true);
    }
}