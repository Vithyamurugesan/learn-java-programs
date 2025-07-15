public class method4 {
    // Method with return and without arguments
    String getGreeting() {
        return "Good Morning!";
    }

    public static void main(String[] args) {
        method4 obj = new method4();
        String message = obj.getGreeting();
        System.out.println(message);
    }
}
