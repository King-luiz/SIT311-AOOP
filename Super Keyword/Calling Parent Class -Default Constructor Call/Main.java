// Parent class
class Parent {
    // Constructor
    Parent() {
        System.out.println("Parent class constructor called");
    }
}

// Child class extending Parent
class Child extends Parent {
    // Constructor
    Child() {
        super(); // Calls Parent class constructor (added implicitly by Java if omitted)
        System.out.println("Child class constructor called");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Creating Child object triggers both constructors
        Child c = new Child();
    }
}
