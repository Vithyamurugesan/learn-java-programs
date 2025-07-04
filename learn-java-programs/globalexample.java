public class globalexample {
    static int globalCount = 0;
    public static void main(String[] args) {
        // Accessing and modifying the global variable
        System.out.println("Initial Count: " + globalCount);
        incrementCount();
        System.out.println("After Increment: " + globalCount);
    }

    public static void incrementCount() {
        globalCount++; // Modifying the global variable
    }
}
