// Write a Java program to count the no. of objects created in a program

class CountObjects{
    static int count = 0;

    CountObjects(){
        // this function increments the count of objects created
        count++;
    }

    static int getCount(){
        // this function returns the count of objects created
        return count;
    }
}


class gObjectCounter{

public static void main(String[] args)
{
    // create two objects of CountObjects class
    CountObjects var1= new CountObjects();
    CountObjects var2= new CountObjects();
    // print the count of objects created using getCount() function
    System.out.println(CountObjects.getCount());
    }
}