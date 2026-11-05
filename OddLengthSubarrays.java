import java.util.Arrays;

public class OddLengthSubarrays {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int totalSum = 0;

        for (int i = 0; i < n; i++) {
            int total = (i + 1) * (n - i);
            int oddCount = (total + 1) / 2;
            totalSum += arr[i] * oddCount;
        }

        return totalSum;
    }
    public static void main(String[] args) {
        OddLengthSubarrays solution = new OddLengthSubarrays();

        int[] arr1 = {1, 4, 2, 5, 3};
        System.out.println("Test Case 1:");
        System.out.println("Input:    " + Arrays.toString(arr1));
        System.out.println("Output:   " + solution.sumOddLengthSubarrays(arr1));
        System.out.println("Expected: 58\n");

        int[] arr2 = {1, 2};
        System.out.println("Test Case 2:");
        System.out.println("Input:    " + Arrays.toString(arr2));
        System.out.println("Output:   " + solution.sumOddLengthSubarrays(arr2));
        System.out.println("Expected: 3\n");

        int[] arr3 = {10, 11, 12};
        System.out.println("Test Case 3:");
        System.out.println("Input:    " + Arrays.toString(arr3));
        System.out.println("Output:   " + solution.sumOddLengthSubarrays(arr3));
        System.out.println("Expected: 66");
    }
}