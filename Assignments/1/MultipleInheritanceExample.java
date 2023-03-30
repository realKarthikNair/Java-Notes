// Interface 1
interface Vehicle {
    void move();
}

// Interface 2
interface Animal {
    void eat();
}

// Class implementing both interfaces
class Horse implements Vehicle, Animal {
    public void move() {
        System.out.println("Horse is running...");
    }

    public void eat() {
        System.out.println("Horse is eating...");
    }
}

// Main class
public class MultipleInheritanceExample {
    public static void main(String[] args) {
        // Create a Horse object and call methods
        Horse horse = new Horse();
        horse.move();
        horse.eat();
    }
}
