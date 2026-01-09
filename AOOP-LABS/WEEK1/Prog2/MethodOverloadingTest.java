// Title: Method Overloading Demonstration
// Description: Shows how one method name can have multiple forms
//              depending on the number and type of parameters.

class InfoPrinter {

    // Method with no parameters
    public void printInfo() {
        System.out.println("No information provided.");
    }

    // Overloaded method: one parameter
    public void printInfo(String name) {
        System.out.println("Name: " + name);
    }

    // Overloaded method: two parameters
    public void printInfo(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class MethodOverloadingTest {
    public static void main(String[] args) {

        InfoPrinter printer = new InfoPrinter();

        // Calling overloaded methods
        printer.printInfo();                        // No info
        printer.printInfo("Lewins Luiz");           // Name only
        printer.printInfo("Lewins Luiz", 22);       // Name + age
    }
}
