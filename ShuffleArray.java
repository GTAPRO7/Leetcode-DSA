import java.util.Arrays;

public class ShuffleArray {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        
        for (int i = 0; i < n; i++) {
            result[2 * i] = nums[i];         
            result[2 * i + 1] = nums[i + n]; 
        }
        
        return result;
    }
    public static void main(String[] args) {
        ShuffleArray solution = new ShuffleArray();

        int[] nums1 = {2, 5, 1, 3, 4, 7};
        int n1 = 3;
        System.out.println("Test Case 1:");
        System.out.println("Input:    nums = " + Arrays.toString(nums1) + ", n = " + n1);
        System.out.println("Output:   " + Arrays.toString(solution.shuffle(nums1, n1)));
        System.out.println("Expected: [2, 3, 5, 4, 1, 7]\n");

        int[] nums2 = {1, 2, 3, 4, 4, 3, 2, 1};
        int n2 = 4;
        System.out.println("Test Case 2:");
        System.out.println("Input:    nums = " + Arrays.toString(nums2) + ", n = " + n2);
        System.out.println("Output:   " + Arrays.toString(solution.shuffle(nums2, n2)));
        System.out.println("Expected: [1, 4, 2, 3, 3, 2, 4, 1]\n");

        int[] nums3 = {1, 1, 2, 2};
        int n3 = 2;
        System.out.println("Test Case 3:");
        System.out.println("Input:    nums = " + Arrays.toString(nums3) + ", n = " + n3);
        System.out.println("Output:   " + Arrays.toString(solution.shuffle(nums3, n3)));
        System.out.println("Expected: [1, 2, 1, 2]");
    }
}