// Parent class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class overriding the parent method
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    // Method to call parent class method using super
    void printParentSound() {
        super.sound(); // Calls Animal's sound()
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.sound();            // Calls Dog’s overridden sound()
        d.printParentSound(); // Calls Animal’s original sound()
    }
}
