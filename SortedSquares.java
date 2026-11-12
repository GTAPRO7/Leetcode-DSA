import java.util.Arrays;

public class SortedSquares {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0;
        int right = n - 1;
        int pos = n - 1;

        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                result[pos] = leftSquare;
                left++;
            } else {
                result[pos] = rightSquare;
                right--;
            }
            pos--;
        }

        return result;
    }
    public static void main(String[] args) {
        SortedSquares solution = new SortedSquares();

        int[] nums1 = {-4, -1, 0, 3, 10};
        System.out.println("Test Case 1:");
        System.out.println("Input:    " + Arrays.toString(nums1));
        System.out.println("Output:   " + Arrays.toString(solution.sortedSquares(nums1)));
        System.out.println("Expected: [0, 1, 9, 16, 100]\n");

        int[] nums2 = {-7, -3, 2, 3, 11};
        System.out.println("Test Case 2:");
        System.out.println("Input:    " + Arrays.toString(nums2));
        System.out.println("Output:   " + Arrays.toString(solution.sortedSquares(nums2)));
        System.out.println("Expected: [4, 9, 9, 49, 121]\n");

        int[] nums3 = {-5, -4, -3, -2, -1};
        System.out.println("Test Case 3 (All negative):");
        System.out.println("Input:    " + Arrays.toString(nums3));
        System.out.println("Output:   " + Arrays.toString(solution.sortedSquares(nums3)));
        System.out.println("Expected: [1, 4, 9, 16, 25]");
    }
}