class DefaultExample {  // No access modifier = default
    int value = 30;

    void show() {
        System.out.println("Default value: " + value);
    }
}
public class MainDefault {
    public static void main(String[] args) {
        DefaultExample obj = new DefaultExample();
        obj.show();  // Accessible in same package
    }
}
