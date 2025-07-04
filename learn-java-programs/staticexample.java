public class staticexample {
    static int number = 10;  // static variable

    static void displayNumber() {  // static method
        System.out.println("The value of number is: " + number);
    }

    public static void main(String[] args) {
        displayNumber();  // calling static method directly
    }
}
