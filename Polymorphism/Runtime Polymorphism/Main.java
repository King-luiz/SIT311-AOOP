// Example: Method Overriding in Java

// Parent class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class: Dog
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Child class: Cat
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

// Main class to test overriding
public class Main {
    public static void main(String[] args) {
        // Upcasting: Parent reference, Child object
        Animal a1 = new Dog(); 
        Animal a2 = new Cat();

        // Dynamic method dispatch (runtime polymorphism)
        a1.sound(); // Calls Dog's sound()
        a2.sound(); // Calls Cat's sound()
    }
}
