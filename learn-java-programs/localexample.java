public class localexample {
    public static void main(String[] args) {
        int number = 10; 
        System.out.println("Number inside main: " + number);
        
        displayMessage();  // calling another method
    }

    public static void displayMessage() {
        String message = "Hello, I am a local variable!";
        System.out.println(message);
        //System.out.println(number); // This would cause an error (number is not accessible here)
    }
}
