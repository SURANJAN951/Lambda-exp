//@FunctionalInterface
package Interface;

// Define the functional interface A
interface A {
    void drive();
}

class Laptop {

    // Inner class B inside Laptop
    class B {
        void display() {
            System.out.println("This is inner function display");
        }
    }
}

public class Interface {
    public static void main(String[] args) {

        // Use lambda expression to instantiate the functional interface A
        A a = () -> System.out.println("Hello world");

        // Call the drive method of the lambda expression
        a.drive();
    }
}
