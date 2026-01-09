// Base class
class A {
    void commonMethod() {
        System.out.println("Common method in Class A");
    }
}

// Class B extends A
class B extends A {
    void methodB() {
        System.out.println("Class B method");
    }
}

// Class C extends A
class C extends A {
    void methodC() {
        System.out.println("Class C method");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Object of class B
        B objB = new B();
        objB.commonMethod(); // Inherited from A
        objB.methodB();      // Defined in B

        // Object of class C
        C objC = new C();
        objC.commonMethod(); // Inherited from A
        objC.methodC();      // Defined in C
    }
}
