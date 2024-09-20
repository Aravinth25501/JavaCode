public class ArrayMaxNumbers {
    public static void main(String[] args) {
        int[] numbers = { 5, 10, 3, 8, 2 };
        int max = findMaximum(numbers);
        System.out.println("Maximum value: " + max);
    }

    public static int findMaximum(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty.");
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            
        }
        return max;
    }
}
