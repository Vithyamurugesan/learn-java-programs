public class method3 {
    // Method with return and with arguments
    int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        method3 obj = new method3();
        int result = obj.add(10, 20);
        System.out.println("Sum: " + result);
    }
}
