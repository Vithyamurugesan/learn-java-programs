public class publicexample {
    public int number = 10;

    public void display() {
        System.out.println("Public number: " + number);
    }

    public static void main(String[] args) {
        publicexample obj = new publicexample();
        obj.display();  // Accessible
    }
}
