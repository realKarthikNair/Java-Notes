public class OverloadingExample {
    private int value;

    // Constructor with no arguments
    public OverloadingExample() {
        this.value = 0;
    }

    // Constructor with one argument
    public OverloadingExample(int value) {
        this.value = value;
    }

    // Method with no arguments
    public void setValue() {
        this.value = 0;
    }

    // Method with one argument
    public void setValue(int value) {
        this.value = value;
    }

    // Main method
    public static void main(String[] args) {
        // Create objects using different constructors
        OverloadingExample obj1 = new OverloadingExample();
        OverloadingExample obj2 = new OverloadingExample(10);

        // Call methods with different arguments
        obj1.setValue();
        obj2.setValue(20);

        // Print the values of the objects
        System.out.println("obj1 value: " + obj1.value);
        System.out.println("obj2 value: " + obj2.value);
    }
}
