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
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Upcasting: Parent reference to Child object
        Animal a = new Dog();

        // Calls Dog's overridden method (runtime polymorphism)
        a.sound();
    }
}
