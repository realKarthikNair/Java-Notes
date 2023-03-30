// Superclass
class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("The animal is eating.");
    }
}

// Subclass
class Dog extends Animal {
    private String breed;

    public Dog(String name, String breed) {
        super(name); // Call superclass constructor
        this.breed = breed;
    }

    public void bark() {
        System.out.println("The " + breed + " dog named " + name + " is barking.");
    }

    @Override // Override superclass method
    public void eat() {
        super.eat(); // Call superclass method
        System.out.println("The " + breed + " dog named " + name + " is also eating.");
    }
}

// Main class
public class SuperKeywordExample {
    public static void main(String[] args) {
        // Create a Dog object and call its methods
        Dog dog = new Dog("Buddy", "Labrador Retriever");
        dog.bark();
        dog.eat();
    }
}
