public class methodoverloading {
    // Method 1: No parameter
    void greet() {
        System.out.println("Hello!");
    }

    // Method 2: One parameter
    void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Method 3: Two parameters
    void greet(String name, int age) {
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
    }

    public static void main(String[] args) {
        methodoverloading obj = new methodoverloading();

        obj.greet();                       // Calls method 1
        obj.greet("Harry");               // Calls method 2
        obj.greet("Luna", 12);            // Calls method 3
    }
}

    

