// Write a Java program  to demonstrate the use of equals() and == in Java

public class vEquals {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

        System.out.println("s1 == s2: " + (s1 == s2)); 
        System.out.println("s1 == s3: " + (s1 == s3)); 
        System.out.println("s1.equals(s2): " + s1.equals(s2));
        System.out.println("s1.equals(s3): " + s1.equals(s3)); 
    }
}

// equals method compares the contents of the string
// == compares the the memory location of the string
