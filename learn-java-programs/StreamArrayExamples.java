import java.util.stream.IntStream;
import java.util.Arrays;

public class StreamArrayExamples {
    public static void main(String[] args) {
        
        // Using IntStream.range(startInclusive, endExclusive)
        int[] arr1 = IntStream.range(1, 5).toArray(); // 1 to 4
        System.out.println("IntStream.range(1, 5): " + Arrays.toString(arr1));

        // Using IntStream.rangeClosed(startInclusive, endInclusive)
        int[] arr2 = IntStream.rangeClosed(1, 4).toArray(); // 1 to 4
        System.out.println("IntStream.rangeClosed(1, 4): " + Arrays.toString(arr2));

        // Using IntStream.of(values...)
        int[] arr3 = IntStream.of(1, 2, 3, 4).toArray();
        System.out.println("IntStream.of(1, 2, 3, 4): " + Arrays.toString(arr3));
    }
}

    

