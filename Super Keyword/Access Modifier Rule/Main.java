// Parent class
class Parent {
    // Protected method (accessible in subclasses and same package)
    protected void display() {
        System.out.println("Parent method");
    }
}

// Child class overriding Parent's method
class Child extends Parent {
    @Override
    public void display() { // Visibility can be increased (protected → public)
        System.out.println("Child method");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Parent reference, Parent object
        Parent p = new Parent();
        p.display(); // Calls Parent's display()

        // Child reference, Child object
        Child c = new Child();
        c.display(); // Calls Child's overridden display()

        // Parent reference, Child object (Upcasting)
        Parent pc = new Child();
        pc.display(); // Calls Child's overridden display() (runtime polymorphism)
    }
}
