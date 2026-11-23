import java.util.Arrays;

public class MaxAscendingSum {
    public int maxAscendingSum(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                currentSum += nums[i];
            } else {
                currentSum = nums[i];
            }
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        MaxAscendingSum solution = new MaxAscendingSum();

        int[] nums1 = {10, 20, 30, 5, 10, 50};
        System.out.println("Test Case 1:");
        System.out.println("Input:    " + Arrays.toString(nums1));
        System.out.println("Output:   " + solution.maxAscendingSum(nums1));
        System.out.println("Expected: 65\n");

        int[] nums2 = {10, 20, 30, 40, 50};
        System.out.println("Test Case 2:");
        System.out.println("Input:    " + Arrays.toString(nums2));
        System.out.println("Output:   " + solution.maxAscendingSum(nums2));
        System.out.println("Expected: 150\n");

        int[] nums3 = {12, 17, 15, 13, 10, 11, 12};
        System.out.println("Test Case 3:");
        System.out.println("Input:    " + Arrays.toString(nums3));
        System.out.println("Output:   " + solution.maxAscendingSum(nums3));
        System.out.println("Expected: 33\n");

        int[] nums4 = {5, 5, 5};
        System.out.println("Test Case 4 (Equal values):");
        System.out.println("Input:    " + Arrays.toString(nums4));
        System.out.println("Output:   " + solution.maxAscendingSum(nums4));
        System.out.println("Expected: 5");
    }
}