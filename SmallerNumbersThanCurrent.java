import java.util.Arrays;

public class SmallerNumbersThanCurrent {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[101];

        for (int num : nums) {
            count[num]++;
        }

        int total = 0;
        for (int i = 0; i <= 100; i++) {
            int freq = count[i];
            count[i] = total;
            total += freq;
        }

        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = count[nums[i]];
        }

        return result;
    }
    public static void main(String[] args) {
        SmallerNumbersThanCurrent solution = new SmallerNumbersThanCurrent();

        int[] nums1 = {8, 1, 2, 2, 3};
        System.out.println("Test Case 1:");
        System.out.println("Input:    " + Arrays.toString(nums1));
        System.out.println("Output:   " + Arrays.toString(solution.smallerNumbersThanCurrent(nums1)));
        System.out.println("Expected: [4, 0, 1, 1, 3]\n");

        int[] nums2 = {6, 5, 4, 8};
        System.out.println("Test Case 2:");
        System.out.println("Input:    " + Arrays.toString(nums2));
        System.out.println("Output:   " + Arrays.toString(solution.smallerNumbersThanCurrent(nums2)));
        System.out.println("Expected: [2, 1, 0, 3]\n");

        int[] nums3 = {7, 7, 7, 7};
        System.out.println("Test Case 3:");
        System.out.println("Input:    " + Arrays.toString(nums3));
        System.out.println("Output:   " + Arrays.toString(solution.smallerNumbersThanCurrent(nums3)));
        System.out.println("Expected: [0, 0, 0, 0]");
    }
}