// Parent class
class Parent {
    int value = 100;
}

// Child class extending Parent
class Child extends Parent {
    int value = 200;

    void display() {
        System.out.println("Child value: " + value);       // Refers to Child's value
        System.out.println("Parent value: " + super.value); // Refers to Parent's value
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}
