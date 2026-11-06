import java.util.Arrays;

public class NumberWithEvenNumber {
    public int findNumbers(int[] nums) {
        int count = 0;
        
        for (int num : nums) {
            if ((num >= 10 && num <= 99) || 
                (num >= 1000 && num <= 9999) || 
                (num == 100000)) {
                count++;
            }
        }
        
        return count;
    }
    public static void main(String[] args) {
        NumberWithEvenNumber solution = new NumberWithEvenNumber();

        int[] nums1 = {12, 345, 2, 6, 7896};
        System.out.println("Test Case 1:");
        System.out.println("Input:    " + Arrays.toString(nums1));
        System.out.println("Output:   " + solution.findNumbers(nums1));
        System.out.println("Expected: 2\n");

        int[] nums2 = {555, 901, 482, 1771};
        System.out.println("Test Case 2:");
        System.out.println("Input:    " + Arrays.toString(nums2));
        System.out.println("Output:   " + solution.findNumbers(nums2));
        System.out.println("Expected: 1\n");

        int[] nums3 = {1, 10, 99, 100, 1000, 9999, 10000, 100000};
        System.out.println("Test Case 3 (Boundary values):");
        System.out.println("Input:    " + Arrays.toString(nums3));
        System.out.println("Output:   " + solution.findNumbers(nums3));
        System.out.println("Expected: 5");
    }
}