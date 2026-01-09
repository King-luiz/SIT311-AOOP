//Example 1: Class with Instance and Static Members
class Student {
 String name; // instance field
 int age; // instance field
 static int total = 0; // static field
 // Constructor
 Student(String n, int a) {
 name = n;
 age = a;
 total++;
 }
 void display() {
 System.out.println(name + " is " + age + " years old.");
 }
 static void displayTotal() {
 System.out.println("Total students: " + total);
 }
}
public class TestStudents {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 20);
        Student s2 = new Student("Bob", 22);
        s1.display();
        s2.display();
        Student.displayTotal();
    }
}