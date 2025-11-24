 // Base class
class A {
    void methodA() {
        System.out.println("Class A method");
    }
}

// Class B extends A
class B extends A {
    void methodB() {
        System.out.println("Class B method");
    }
}

// Class C extends B
class C extends B {
    void methodC() {
        System.out.println("Class C method");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Object of class C
        C obj = new C();

        // Calling methods from different levels of inheritance
        obj.methodA(); // From A
        obj.methodB(); // From B
        obj.methodC(); // From C
    }
}
