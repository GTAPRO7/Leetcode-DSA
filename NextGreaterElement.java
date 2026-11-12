import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class NextGreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> nextGreaterMap = new HashMap<>();
        Deque<Integer> stack = new ArrayDeque<>();

        // Step 1: Precompute next greater elements for nums2 using a monotonic stack
        for (int num : nums2) {
            while (!stack.isEmpty() && num > stack.peek()) {
                nextGreaterMap.put(stack.pop(), num);
            }
            stack.push(num);
        }

        // Step 2: Answer queries for nums1
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = nextGreaterMap.getOrDefault(nums1[i], -1);
        }

        return ans;
    }
    public static void main(String[] args) {
        NextGreaterElement solution = new NextGreaterElement();

        int[] nums1_1 = {4, 1, 2};
        int[] nums2_1 = {1, 3, 4, 2};
        System.out.println("Test Case 1:");
        System.out.println("nums1:    " + Arrays.toString(nums1_1));
        System.out.println("nums2:    " + Arrays.toString(nums2_1));
        System.out.println("Output:   " + Arrays.toString(solution.nextGreaterElement(nums1_1, nums2_1)));
        System.out.println("Expected: [-1, 3, -1]\n");

        int[] nums1_2 = {2, 4};
        int[] nums2_2 = {1, 2, 3, 4};
        System.out.println("Test Case 2:");
        System.out.println("nums1:    " + Arrays.toString(nums1_2));
        System.out.println("nums2:    " + Arrays.toString(nums2_2));
        System.out.println("Output:   " + Arrays.toString(solution.nextGreaterElement(nums1_2, nums2_2)));
        System.out.println("Expected: [3, -1]\n");

        int[] nums1_3 = {5, 3, 1};
        int[] nums2_3 = {5, 4, 3, 2, 1};
        System.out.println("Test Case 3 (Strictly decreasing nums2):");
        System.out.println("nums1:    " + Arrays.toString(nums1_3));
        System.out.println("nums2:    " + Arrays.toString(nums2_3));
        System.out.println("Output:   " + Arrays.toString(solution.nextGreaterElement(nums1_3, nums2_3)));
        System.out.println("Expected: [-1, -1, -1]");
    }
}