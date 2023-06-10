// Write a Java program to print all odd numbers between 1 to 10

// This code prints odd numbers from 1 to n
// where n is the input for the program
public class aPrintOddNumbers{
    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i <= n; i+=2) {
                System.out.print(i+" ");
        }
        System.out.println();
    }
}

