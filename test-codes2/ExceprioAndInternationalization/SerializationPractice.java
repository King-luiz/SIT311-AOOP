import java.io.*;

// =====================================================
// Student class must implement Serializable
// This allows its objects to be saved to a file
// =====================================================
class Student implements Serializable {

    // serialVersionUID helps in version control
    private static final long serialVersionUID = 1L;

    private String name;
    private int regNumber;

    // Constructor
    public Student(String name, int regNumber) {
        this.name = name;
        this.regNumber = regNumber;
    }

    // Method to display student details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Registration Number: " + regNumber);
    }
}


// =====================================================
// Main class for Serialization and Deserialization
// =====================================================
public class SerializationPractice {

    public static void main(String[] args) {

        // Create a student object
        Student s1 = new Student("Alice", 12345);

        // ----------- SERIALIZATION -----------
        try {
            FileOutputStream fos = new FileOutputStream("student.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            // Write object to file
            oos.writeObject(s1);

            oos.close();
            fos.close();

            System.out.println("Object has been serialized (saved to file).");

        } catch (IOException e) {
            System.out.println("Error during serialization.");
        }

        // ----------- DESERIALIZATION -----------
        try {
            FileInputStream fis = new FileInputStream("student.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            // Read object from file
            Student s2 = (Student) ois.readObject();

            ois.close();
            fis.close();

            System.out.println("\nObject has been deserialized (read from file).");
            s2.display();

        } catch (Exception e) {
            System.out.println("Error during deserialization.");
        }
    }
}
