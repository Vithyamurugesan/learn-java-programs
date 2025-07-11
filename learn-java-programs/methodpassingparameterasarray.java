public class methodpassingparameterasarray {
    void printArray(int[] numbers) {
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
    public static void main(String[] args) {
        methodpassingparameterasarray obj = new methodpassingparameterasarray();
        int[] nums = {10, 20, 30, 40};
        obj.printArray(nums);
    }
}

