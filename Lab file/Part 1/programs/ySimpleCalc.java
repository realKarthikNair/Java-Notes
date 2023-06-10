// Write a Java program  using AWT to create a simple calculator

import java.awt.*;
import java.awt.event.*;

public class ySimpleCalc extends Frame implements ActionListener {
    private TextField num1, num2, result;
    private Button add, subtract, multiply, divide;

    public ySimpleCalc() {
        num1 = new TextField(10);
        num2 = new TextField(10);
        result = new TextField(10);
        result.setEditable(false);

        add = new Button("+");
        subtract = new Button("-");
        multiply = new Button("*");
        divide = new Button("/");

        add.addActionListener(this);
        subtract.addActionListener(this);
        multiply.addActionListener(this);
        divide.addActionListener(this);

        Label label1 = new Label("Number 1:");
        Label label2 = new Label("Number 2:");
        Label label3 = new Label("Result:");

        setLayout(new GridLayout(3, 4));

        add(label1);
        add(num1);
        add(label2);
        add(num2);

        add(add);
        add(subtract);
        add(multiply);
        add(divide);

        add(label3);
        add(result);

        setTitle("Simple Calculator");
        setSize(250, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ySimpleCalc();
    }

    public void actionPerformed(ActionEvent e) {
        int n1 = Integer.parseInt(num1.getText());
        int n2 = Integer.parseInt(num2.getText());
        int r = 0;

        if (e.getSource() == add) {
            r = n1 + n2;
        } else if (e.getSource() == subtract) {
            r = n1 - n2;
        } else if (e.getSource() == multiply) {
            r = n1 * n2;
        } else if (e.getSource() == divide) {
            r = n1 / n2;
        }

        result.setText(String.valueOf(r));
    }
}