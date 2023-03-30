// Superclass
class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

// Subclass 1
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}

// Subclass 2
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

// Main class
public class DynamicMethodDispatchExample {
    public static void main(String[] args) {
        // Create Animal objects of different types
        Animal animal1 = new Animal();
        Animal animal2 = new Cat();
        Animal animal3 = new Dog();

        // Call the makeSound() method for each object
        animal1.makeSound();
        animal2.makeSound();
        animal3.makeSound();
    }
}
