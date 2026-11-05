import java.util.Arrays;

public class ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }

        return ans;
    }
    public static void main(String[] args) {
        ConcatenationOfArray solution = new ConcatenationOfArray();

        int[] nums1 = {1, 2, 1};
        int[] res1 = solution.getConcatenation(nums1);
        System.out.println("Test Case 1:");
        System.out.println("Input:    " + Arrays.toString(nums1));
        System.out.println("Output:   " + Arrays.toString(res1));
        System.out.println("Expected: [1, 2, 1, 1, 2, 1]\n");

        int[] nums2 = {1, 3, 2, 1};
        int[] res2 = solution.getConcatenation(nums2);
        System.out.println("Test Case 2:");
        System.out.println("Input:    " + Arrays.toString(nums2));
        System.out.println("Output:   " + Arrays.toString(res2));
        System.out.println("Expected: [1, 3, 2, 1, 1, 3, 2, 1]\n");

        int[] nums3 = {5};
        int[] res3 = solution.getConcatenation(nums3);
        System.out.println("Test Case 3:");
        System.out.println("Input:    " + Arrays.toString(nums3));
        System.out.println("Output:   " + Arrays.toString(res3));
        System.out.println("Expected: [5, 5]");
    }
}