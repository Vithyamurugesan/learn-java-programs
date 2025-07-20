public class StringBufferExample {
    public static void main(String[] args) {
        // Creating a StringBuffer
        StringBuffer sb = new StringBuffer("Hello");

        // 1. append()
        sb.append(" World");
        System.out.println("After append: " + sb); // Output: Hello World

        // 2. insert()
        sb.insert(6, "Java ");
        System.out.println("After insert: " + sb); // Output: Hello Java World

        // 3. replace()
        sb.replace(6, 10, "Python");
        System.out.println("After replace: " + sb); // Output: Hello Python World

        // 4. delete()
        sb.delete(6, 13);
        System.out.println("After delete: " + sb); // Output: Hello World

        // 5. reverse()
        sb.reverse();
        System.out.println("After reverse: " + sb); // Output: dlroW olleH

        // 6. charAt()
        sb.reverse(); // Reverse again to original
        System.out.println("Character at index 1: " + sb.charAt(1)); // Output: e

        // 7. setCharAt()
        sb.setCharAt(0, 'h');
        System.out.println("After setCharAt: " + sb); // Output: hello World

        // 8. length()
        System.out.println("Length: " + sb.length()); // Output: 11

        // 9. capacity()
        System.out.println("Capacity: " + sb.capacity()); // Default 16 + initial string length

        // 10. ensureCapacity()
        sb.ensureCapacity(50);
        System.out.println("Capacity after ensureCapacity(50): " + sb.capacity());

        // 11. substring()
        String sub = sb.substring(0, 5);
        System.out.println("Substring (0 to 5): " + sub); // Output: hello
    }
}
