import java.util.Arrays;

public class ArrayPartition {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        
        // Sum every alternate element starting from index 0
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        
        return sum;
    }
    public static void main(String[] args) {
        ArrayPartition solution = new ArrayPartition();

        int[] nums1 = {1, 4, 3, 2};
        int result1 = solution.arrayPairSum(nums1);
        System.out.println("Test Case 1:");
        System.out.println("Input: [1, 4, 3, 2]");
        System.out.println("Output: " + result1);
        System.out.println("Expected: 4\n");

        int[] nums2 = {6, 2, 6, 5, 1, 2};
        int result2 = solution.arrayPairSum(nums2);
        System.out.println("Test Case 2:");
        System.out.println("Input: [6, 2, 6, 5, 1, 2]");
        System.out.println("Output: " + result2);
        System.out.println("Expected: 9");
    }
}