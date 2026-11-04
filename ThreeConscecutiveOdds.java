import java.util.Arrays;

public class ThreeConscecutiveOdds {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;
        
        for (int num : arr) {
            if (num % 2 != 0) {
                count++;
                if (count == 3) {
                    return true;
                }
            } else {
                count = 0;
            }
        }
        
        return false;
    }
    public static void main(String[] args) {
        ThreeConscecutiveOdds solution = new ThreeConscecutiveOdds();

        int[] arr1 = {2, 6, 4, 1};
        System.out.println("Test Case 1:");
        System.out.println("Input:    " + Arrays.toString(arr1));
        System.out.println("Output:   " + solution.threeConsecutiveOdds(arr1));
        System.out.println("Expected: false\n");

        int[] arr2 = {1, 2, 34, 3, 4, 5, 7, 23, 12};
        System.out.println("Test Case 2:");
        System.out.println("Input:    " + Arrays.toString(arr2));
        System.out.println("Output:   " + solution.threeConsecutiveOdds(arr2));
        System.out.println("Expected: true\n");

        int[] arr3 = {2, 4, 1, 3, 5};
        System.out.println("Test Case 3:");
        System.out.println("Input:    " + Arrays.toString(arr3));
        System.out.println("Output:   " + solution.threeConsecutiveOdds(arr3));
        System.out.println("Expected: true");
    }
}