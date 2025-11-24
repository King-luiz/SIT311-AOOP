// First interface
interface Interface1 {
    void method1();
}

// Second interface
interface Interface2 {
    void method2();
}

// Class implementing both interfaces
class MyClass implements Interface1, Interface2 {
    @Override
    public void method1() {
        System.out.println("Method from Interface1");
    }

    @Override
    public void method2() {
        System.out.println("Method from Interface2");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        // Calling methods from both interfaces
        obj.method1();
        obj.method2();
    }
}
