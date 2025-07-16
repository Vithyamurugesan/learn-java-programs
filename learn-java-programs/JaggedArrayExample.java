public class JaggedArrayExample {
    public static void main(String[] args) {
        // Declare a jagged array with 3 rows
        int[][] jaggedArray = new int[3][];
        
        // Initialize each row with different number of columns
        jaggedArray[0] = new int[] {1, 2, 3};       // 3 elements
        jaggedArray[1] = new int[] {4, 5};          // 2 elements
        jaggedArray[2] = new int[] {6, 7, 8, 9};    // 4 elements

        // Print the jagged array
        System.out.println("Jagged Array:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
