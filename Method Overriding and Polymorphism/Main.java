// Example 2: Method Overriding and Polymorphism

// Parent class
class Animal {
    void sound() {
        System.out.println("Some generic animal sound");
    }
}

// Child class: Cat
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

// Child class: Dog
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Animal a1 = new Cat(); // Upcasting: Animal reference, Cat object
        Animal a2 = new Dog(); // Upcasting: Animal reference, Dog object

        a1.sound(); // Output: Cat meows
        a2.sound(); // Output: Dog barks
    }
}
