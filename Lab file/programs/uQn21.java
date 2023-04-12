// Write a Java program  to demonstrate the use of equals(), trim() ,length() , substring(), compareto()  of string class

public class uQn21 {
    public static void main(String[] args) {
        String str1 = "    Some Text   ";
        String str2 = "some text";
        String str3 = "Some text";
        String str4 = "text";
        
        // equals() method returns true if the string is equal to the given string
        System.out.println(str1.equals(str2)); // false
        System.out.println(str2.equals(str3)); // true
        
        // trim() method removes the leading and trailing spaces
        System.out.println(str1.trim()); // "hello world"
        
        // length() method returns the length of the string
        System.out.println(str2.length()); // 11
        
        // substring() method returns the substring of the string
        System.out.println(str2.substring(6));
        
        // compareTo() method returns the difference of the ascii values of the first unmatched character
        System.out.println(str2.compareTo(str3));
        System.out.println(str2.compareTo(str4));
        System.out.println(str3.compareTo(str2));
    }
}

