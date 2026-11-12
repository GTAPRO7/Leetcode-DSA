import java.util.Arrays;

public class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            if (nums[left] % 2 > nums[right] % 2) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }

            if (nums[left] % 2 == 0) {
                left++;
            }
            if (nums[right] % 2 == 1) {
                right--;
            }
        }

        return nums;
    }
    public static void main(String[] args) {
        SortArrayByParity solution = new SortArrayByParity();

        int[] nums1 = {3, 1, 2, 4};
        System.out.println("Test Case 1:");
        System.out.println("Input:    " + Arrays.toString(nums1));
        int[] res1 = solution.sortArrayByParity(nums1.clone());
        System.out.println("Output:   " + Arrays.toString(res1));
        System.out.println("Expected: [4, 2, 1, 3] (or any valid even-then-odd permutation)\n");

        int[] nums2 = {0};
        System.out.println("Test Case 2:");
        System.out.println("Input:    " + Arrays.toString(nums2));
        int[] res2 = solution.sortArrayByParity(nums2.clone());
        System.out.println("Output:   " + Arrays.toString(res2));
        System.out.println("Expected: [0]\n");

        int[] nums3 = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Test Case 3:");
        System.out.println("Input:    " + Arrays.toString(nums3));
        int[] res3 = solution.sortArrayByParity(nums3.clone());
        System.out.println("Output:   " + Arrays.toString(res3));
        System.out.println("Expected: [8, 2, 6, 4, 5, 3, 7, 1]");
    }
}