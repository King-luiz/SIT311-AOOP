// Parent class
class Parent {
    // Parameterized constructor
    Parent(String msg) {
        System.out.println("Parent constructor: " + msg);
    }
}

// Child class extending Parent
class Child extends Parent {
    // Parameterized constructor
    Child(String msg) {
        super(msg); // Explicitly call Parent’s constructor
        System.out.println("Child constructor: " + msg);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Creating a Child object invokes both Parent and Child constructors
        Child c = new Child("Hello World");
    }
}
