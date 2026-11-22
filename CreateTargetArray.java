import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateTargetArray {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>(nums.length);

        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }

        int[] target = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            target[i] = list.get(i);
        }

        return target;
    }
    public static void main(String[] args) {
        CreateTargetArray solution = new CreateTargetArray();

        int[] nums1 = {0, 1, 2, 3, 4};
        int[] index1 = {0, 1, 2, 2, 1};
        System.out.println("Test Case 1:");
        System.out.println("nums:     " + Arrays.toString(nums1));
        System.out.println("index:    " + Arrays.toString(index1));
        System.out.println("Output:   " + Arrays.toString(solution.createTargetArray(nums1, index1)));
        System.out.println("Expected: [0, 4, 1, 3, 2]\n");

        int[] nums2 = {1, 2, 3, 4, 0};
        int[] index2 = {0, 1, 2, 3, 0};
        System.out.println("Test Case 2:");
        System.out.println("nums:     " + Arrays.toString(nums2));
        System.out.println("index:    " + Arrays.toString(index2));
        System.out.println("Output:   " + Arrays.toString(solution.createTargetArray(nums2, index2)));
        System.out.println("Expected: [0, 1, 2, 3, 4]\n");

        int[] nums3 = {1};
        int[] index3 = {0};
        System.out.println("Test Case 3:");
        System.out.println("nums:     " + Arrays.toString(nums3));
        System.out.println("index:    " + Arrays.toString(index3));
        System.out.println("Output:   " + Arrays.toString(solution.createTargetArray(nums3, index3)));
        System.out.println("Expected: [1]");
    }
}