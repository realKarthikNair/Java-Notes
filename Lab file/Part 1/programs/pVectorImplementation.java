// Write a Java program to implement vector
// [use: addelement(),elementat().removeelement(),size().]

import java.util.Vector;

public class pVectorImplementation {
    public static void main(String[] args){
        Vector<Integer> v = new Vector<Integer>();
        v.addElement(1);
        v.addElement(2);
        v.addElement(3);
        v.addElement(4);
        System.out.println("The vector is: "+v);
        System.out.println("The size of the vector is: "+v.size());
        System.out.println("The element at index 2 is: "+v.elementAt(2));
        System.out.println("Removing element at index 2...");
        v.removeElementAt(2);
        System.out.println("The vector is: "+v);
        System.out.println("The size of the vector is: "+v.size());
    }
}