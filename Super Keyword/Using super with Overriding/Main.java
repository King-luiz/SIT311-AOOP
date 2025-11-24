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
        // Call parent method first
        super.sound();
        // Then add Dog-specific behavior
        System.out.println("Dog barks");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound(); // Executes both Animal's and Dog's sound methods
    }
}
