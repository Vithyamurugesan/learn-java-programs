
class protectedexample {
    protected String message = "Hello from protected!";

    protected void greet() {
        System.out.println(message);
    }
}

public class MainProtected extends protectedexample {
    public static void main(String[] args) {
        MainProtected obj = new MainProtected();
        obj.greet();  //accessible in subclass
    }
}
