public class SingleNumber {

    public int singleNumberSolution(int[] nums) {
        int single = 0;

        for(int num : nums){
            single ^= num;
        }

        return single;
    }
public static void main(String[] args) {
        SingleNumber solver = new SingleNumber();
        
        int[] nums1 = {2, 2, 1};
        System.out.println("Example 1 Output: " + solver.singleNumberSolution(nums1)); // Should output 1
        
        int[] nums2 = {4, 1, 2, 1, 2};
        System.out.println("Example 2 Output: " + solver.singleNumberSolution(nums2)); // Should output 4
        
        int[] nums3 = {1};
        System.out.println("Example 3 Output: " + solver.singleNumberSolution(nums3));
    }
}