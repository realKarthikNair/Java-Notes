// Write Java program to read input from java console

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