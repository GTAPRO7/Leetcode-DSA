import java.util.Arrays;

public class RunningSum1DArray {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
    public static void main(String[] args) {
        RunningSum1DArray solution = new RunningSum1DArray();

        int[] nums1 = {1, 2, 3, 4};
        System.out.println("Test Case 1:");
        System.out.println("Input:    " + Arrays.toString(nums1));
        int[] res1 = solution.runningSum(nums1.clone());
        System.out.println("Output:   " + Arrays.toString(res1));
        System.out.println("Expected: [1, 3, 6, 10]\n");

        int[] nums2 = {1, 1, 1, 1, 1};
        System.out.println("Test Case 2:");
        System.out.println("Input:    " + Arrays.toString(nums2));
        int[] res2 = solution.runningSum(nums2.clone());
        System.out.println("Output:   " + Arrays.toString(res2));
        System.out.println("Expected: [1, 2, 3, 4, 5]\n");

        int[] nums3 = {3, 1, 2, 10, 1};
        System.out.println("Test Case 3:");
        System.out.println("Input:    " + Arrays.toString(nums3));
        int[] res3 = solution.runningSum(nums3.clone());
        System.out.println("Output:   " + Arrays.toString(res3));
        System.out.println("Expected: [3, 4, 6, 16, 17]");
    }
}