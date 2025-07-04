public class privateexample {
    private int number = 20;

    private void show() {
        System.out.println("Private number: " + number);
    }

    public static void main(String[] args) {
        privateexample obj = new privateexample();
        obj.show();  // Accessible inside same class
    }
}

    