// Create an applet with two buttons named ‘audio’ and ‘image’. 
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