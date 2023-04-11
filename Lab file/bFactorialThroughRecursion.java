// Write a Java program  to find out factorial of a number through recursion

// This is a recursive function which finds the factorial of an integer n.
// n is the input integer.
// The function returns the factorial of n.

class bFactorialThroughRecursion{
    static int factorial(int n){
        if (n == 0)
            return 1; // base case
        return n*factorial(n-1); // recursive call
    }
    public static void main(String[] args){
        int n = 7;
        System.out.println("Factorial of " + n + " is " + factorial(n));
    }
}