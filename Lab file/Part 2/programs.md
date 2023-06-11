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

### 4.  Create a Java applet with three buttons ‘red’,’green’,’blue’. 
```c
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
```

### 5.  Write a Java program  in Java to implement the concept of ‘synchronization’ using thread
```c

class Incrementer {
    private int count = 0;
    public synchronized void increment() {
        count++;
        System.out.println("Count is now " + count);
    }
}

class MyThread implements Runnable {
    private Incrementer Incrementer;
    private String name;

    public MyThread(Incrementer Incrementer, String name) {
        this.Incrementer = Incrementer;
        this.name = name;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            Incrementer.increment();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class eSynchronizationUsingThread {
    public static void main(String[] args) {
        Incrementer Incrementer = new Incrementer();
        Thread thread1 = new Thread(new MyThread(Incrementer, "Thread 1"));
        Thread thread2 = new Thread(new MyThread(Incrementer, "Thread 2"));
        thread1.start();
        thread2.start();
    }
}
```

### 6.  Create a simple JDBC program that creates a table, 
```c
// stores data into it, retrieves & prints the data

import java.sql.*;

public class fSimpleJDBCProgram {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "12345678");
            stmt = conn.createStatement();
            String sql = "CREATE DATABASE IF NOT EXISTS javatemp";
            stmt.executeUpdate(sql);
            sql = "USE javatemp";
            stmt.executeUpdate(sql);
            sql = "CREATE TABLE if not exists shopping_list (id INT NOT NULL AUTO_INCREMENT, item VARCHAR(255), PRIMARY KEY (id), quantity INT, price DOUBLE)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO shopping_list (item, quantity, price) VALUES ('Apple', 5, 10.0)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO shopping_list (item, quantity, price) VALUES ('Orange', 10, 5.0)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO shopping_list (item, quantity, price) VALUES ('Banana', 15, 2.0)";
            stmt.executeUpdate(sql);

            sql = "SELECT * FROM shopping_list";
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getString("item") + " " + rs.getInt("quantity") + " " + rs.getDouble("price"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}   
```

### 7.  Write a Java program in Java to create database table using Java
```c

import java.sql.*;

public class gCreateDatabaseTable {
    public static void main(String[] args) {

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

    try {
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "12345678");
        stmt = conn.createStatement();
        String sql = "CREATE DATABASE IF NOT EXISTS TestDB";
        stmt.executeUpdate(sql);
        System.out.println("Database TestDB created successfully...");
        sql = "USE TestDB";
        stmt.executeUpdate(sql);
        sql = "CREATE TABLE if not exists student (id INT NOT NULL, name VARCHAR(255), enrol_num INT, status INT, PRIMARY KEY (id))";
        stmt.executeUpdate(sql);
        System.out.println("Table student created successfully...");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
```

### 8.  Write a Java program in Java to insert, update, delete & select records
```c

import java.sql.*;

public class hInsertUpdateDeleteSelect {
    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/TestDB", "root", "12345678");
            String insertSql = "INSERT INTO student (id, name, enrol_num, status) VALUES (?, ?, ?, ?)";
            pstmt = conn.prepareStatement(insertSql);
            pstmt.setInt(1, 1);
            pstmt.setString(2, "Ramesh Kumar");
            pstmt.setInt(3, 12345);
            pstmt.setInt(4, 1);
            pstmt.executeUpdate();
            System.out.println("Record inserted successfully.");
            pstmt.setInt(1, 2);
            pstmt.setString(2, "Sandra");
            pstmt.setInt(3, 23456);
            pstmt.setInt(4, 1);
            pstmt.executeUpdate();
            System.out.println("Record inserted successfully.");


            String updateSql = "UPDATE student SET name = ?, enrol_num = ?, status = ? WHERE id = ?";
            pstmt = conn.prepareStatement(updateSql);
            pstmt.setString(1, "Jane");
            pstmt.setInt(2, 54321);
            pstmt.setInt(3, 0);
            pstmt.setInt(4, 1);
            pstmt.executeUpdate();
            System.out.println("Record updated successfully.");

            String deleteSql = "DELETE FROM student WHERE id = ?";
            pstmt = conn.prepareStatement(deleteSql);
            pstmt.setInt(1, 1);
            pstmt.executeUpdate();
            System.out.println("Record deleted successfully.");

            String selectSql = "SELECT * FROM student";
            pstmt = conn.prepareStatement(selectSql);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int enrolNum = rs.getInt("enrol_num");
                int status = rs.getInt("status");
                System.out.println("id: " + id + ", name: " + name + ", enrol_num: " + enrolNum + ", status: " + status);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
```

### 9.  Write Java program to read input from java console
```c

import java.util.Scanner;

public class iInputFromJavaConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Your name is " + name + " and your age is " + age);

        scanner.close();
    }
}
```

### 10.  Write a Java program  to implement file handling(both reading & writing to a file)
```c

import java.io.*;

public class jFileHandling {
    public static void main(String[] args) {
        try {
            File file = new File("res/temp.txt");
            FileWriter writer = new FileWriter(file);
            writer.write("Hello World! This line was added to the file");
            writer.close();
            System.out.println("Data written into file successfully.");
            System.out.println("Reading file...");
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

### 11.  Write a Java program on anonymous classes
```c

public class kAnonymousClasses {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            public void run() {
                System.out.println("Hello from an anonymous class!");
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
```

