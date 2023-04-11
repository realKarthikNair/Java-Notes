// Create a user defined exception named “nomatchexception” that is fired when the string entered by the user is not “india”

// import the required packages and classes to use the Scanner class
import java.util.Scanner;

// create a user defined exception
class nomatchexception extends Exception{
    nomatchexception(String s){
        super(s);
    }
}

public class pUserDefinedException{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        // read the string from the user 
        String s = sc.nextLine();
        sc.close();
        try{
            // check if the string entered is india 
            if(s.equals("india")){
                System.out.println("The string entered is: "+s);
            }
            else{
                // throw the exception if the string is not india
                throw new nomatchexception("The string entered is not india");
            }
        }
        // catch the exception and print the message 
        catch(nomatchexception e){
            System.out.println(e);
        }
    }
}