import java.util.Arrays;

public class SmallestRangeI {
    public int smallestRangeI(int[] nums, int k) {
        int minVal = nums[0];
        int maxVal = nums[0];

        for (int num : nums) {
            if (num < minVal) {
                minVal = num;
            }
            if (num > maxVal) {
                maxVal = num;
            }
        }

        return Math.max(0, (maxVal - minVal) - 2 * k);
    }
    public static void main(String[] args) {
        SmallestRangeI solution = new SmallestRangeI();

        int[] nums1 = {1};
        int k1 = 0;
        System.out.println("Test Case 1:");
        System.out.println("nums = " + Arrays.toString(nums1) + ", k = " + k1);
        System.out.println("Output:   " + solution.smallestRangeI(nums1, k1));
        System.out.println("Expected: 0\n");

        int[] nums2 = {0, 10};
        int k2 = 2;
        System.out.println("Test Case 2:");
        System.out.println("nums = " + Arrays.toString(nums2) + ", k = " + k2);
        System.out.println("Output:   " + solution.smallestRangeI(nums2, k2));
        System.out.println("Expected: 6\n");

        int[] nums3 = {1, 3, 6};
        int k3 = 3;
        System.out.println("Test Case 3:");
        System.out.println("nums = " + Arrays.toString(nums3) + ", k = " + k3);
        System.out.println("Output:   " + solution.smallestRangeI(nums3, k3));
        System.out.println("Expected: 0");
    }
}