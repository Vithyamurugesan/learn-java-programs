public class strstartsendswithexample {
     public static void main(String[] args) {
        String str = "  Hello Java World  ";
        System.out.println("Starts with '  He'? " + str.startsWith("  He"));  // true
        System.out.println("Ends with 'ld  '? " + str.endsWith("ld  "));      // true
    }
    
}
