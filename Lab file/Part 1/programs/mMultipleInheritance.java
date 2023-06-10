// Write a Java program to show multiple inheritance

// in java, multiple inheritance is not supported
// but it can be achieved using interfaces

interface Animal{
    // abstract methods
    public void eat();
    public void move();
}
 
interface Mammal{
    // abstract method
    public void giveBirth();
}
 
class Dog implements Animal, Mammal{
    // multiple inheritance is achieved using interfaces
    public void eat(){
        System.out.println("The dog is eating.");
    }
    public void move(){
        System.out.println("The dog is moving.");
    }
    public void giveBirth(){
        System.out.println("The dog is giving birth.");
    }
}
 
public class mMultipleInheritance {
    public static void main(String[] args){
        Dog dog0 = new Dog();
        dog0.eat();
        dog0.move();
        dog0.giveBirth();
    }
}

 
