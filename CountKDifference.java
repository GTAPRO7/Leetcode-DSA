import java.util.Arrays;

public class CountKDifference {
    public int countKDifference(int[] nums, int k) {
        int[] freq = new int[101];
        int pairs = 0;

        for (int num : nums) {
            if (num - k >= 1) {
                pairs += freq[num - k];
            }
            if (num + k <= 100) {
                pairs += freq[num + k];
            }
            freq[num]++;
        }

        return pairs;
    }

    public static void main(String[] args) {
        CountKDifference solution = new CountKDifference();

        int[] nums1 = {1, 2, 2, 1};
        int k1 = 1;
        System.out.println("Test Case 1:");
        System.out.println("Input:    nums = " + Arrays.toString(nums1) + ", k = " + k1);
        System.out.println("Output:   " + solution.countKDifference(nums1, k1));
        System.out.println("Expected: 4\n");

        int[] nums2 = {1, 3};
        int k2 = 3;
        System.out.println("Test Case 2:");
        System.out.println("Input:    nums = " + Arrays.toString(nums2) + ", k = " + k2);
        System.out.println("Output:   " + solution.countKDifference(nums2, k2));
        System.out.println("Expected: 0\n");

        int[] nums3 = {3, 2, 1, 5, 4};
        int k3 = 2;
        System.out.println("Test Case 3:");
        System.out.println("Input:    nums = " + Arrays.toString(nums3) + ", k = " + k3);
        System.out.println("Output:   " + solution.countKDifference(nums3, k3));
        System.out.println("Expected: 3");
    }
}