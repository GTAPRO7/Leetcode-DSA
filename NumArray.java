public class NumArray {
    private int[] prefix;

    public NumArray(int[] nums) {
        prefix = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        return prefix[right + 1] - prefix[left];
    }
    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        NumArray numArray = new NumArray(nums);

        System.out.println("--- Range Sum Queries ---");

        int q1 = numArray.sumRange(0, 2);
        System.out.println("sumRange(0, 2) = " + q1 + " (Expected: 1)");

        int q2 = numArray.sumRange(2, 5);
        System.out.println("sumRange(2, 5) = " + q2 + " (Expected: -1)");

        int q3 = numArray.sumRange(0, 5);
        System.out.println("sumRange(0, 5) = " + q3 + " (Expected: -3)");
    }
}