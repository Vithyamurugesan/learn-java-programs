public class methodpassingvariablearguments {

    void printNumbers(int... numbers) {
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        methodpassingvariablearguments obj = new methodpassingvariablearguments();

        obj.printNumbers(5);               // One argument
        System.out.println();
        obj.printNumbers(10, 20, 30, 40);  // Multiple arguments
    }
}
