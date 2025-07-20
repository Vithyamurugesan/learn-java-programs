public class strsplitexample {
     public static void main(String[] args) {
        String str = "  Hello Java World  ";
        String[] words = str.trim().split(" ");
        System.out.print("Split words: ");
        for (String word : words) {
            System.out.print(word + " ");
        }
        System.out.println();
    }
}
