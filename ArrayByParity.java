import java.util.Arrays;

public class ArrayByParity{
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int even = 0;
        int odd = 1;

        while (even < n && odd < n) {
            while (even < n && nums[even] % 2 == 0) {
                even += 2;
            }
            while (odd < n && nums[odd] % 2 != 0) {
                odd += 2;
            }

            if (even < n && odd < n) {
                int temp = nums[even];
                nums[even] = nums[odd];
                nums[odd] = temp;
                even += 2;
                odd += 2;
            }
        }

        return nums;
    }

    private static boolean isValid(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0 && nums[i] % 2 != 0) return false;
            if (i % 2 != 0 && nums[i] % 2 == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayByParity solution = new ArrayByParity();

        int[] nums1 = {4, 2, 5, 7};
        System.out.println("Test Case 1:");
        System.out.println("Input:    " + Arrays.toString(nums1));
        int[] res1 = solution.sortArrayByParityII(nums1);
        System.out.println("Output:   " + Arrays.toString(res1));
        System.out.println("Is Valid: " + isValid(res1) + "\n");

        int[] nums2 = {2, 3};
        System.out.println("Test Case 2:");
        System.out.println("Input:    " + Arrays.toString(nums2));
        int[] res2 = solution.sortArrayByParityII(nums2);
        System.out.println("Output:   " + Arrays.toString(res2));
        System.out.println("Is Valid: " + isValid(res2) + "\n");

        int[] nums3 = {3, 1, 4, 2};
        System.out.println("Test Case 3:");
        System.out.println("Input:    " + Arrays.toString(nums3));
        int[] res3 = solution.sortArrayByParityII(nums3);
        System.out.println("Output:   " + Arrays.toString(res3));
        System.out.println("Is Valid: " + isValid(res3));
    }
}