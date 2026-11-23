import java.util.Arrays;

public class HeightChecker {
    public int heightChecker(int[] heights) {
        int[] freq = new int[101];
        for (int h : heights) {
            freq[h]++;
        }

        int mismatches = 0;
        int currentHeight = 1;

        for (int h : heights) {
            while (freq[currentHeight] == 0) {
                currentHeight++;
            }
            if (h != currentHeight) {
                mismatches++;
            }
            freq[currentHeight]--;
        }

        return mismatches;
    }

    public static void main(String[] args) {
        HeightChecker solution = new HeightChecker();

        int[] heights1 = {1, 1, 4, 2, 1, 3};
        System.out.println("Test Case 1:");
        System.out.println("Input:    " + Arrays.toString(heights1));
        System.out.println("Output:   " + solution.heightChecker(heights1));
        System.out.println("Expected: 3\n");

        int[] heights2 = {5, 1, 2, 3, 4};
        System.out.println("Test Case 2:");
        System.out.println("Input:    " + Arrays.toString(heights2));
        System.out.println("Output:   " + solution.heightChecker(heights2));
        System.out.println("Expected: 5\n");

        int[] heights3 = {1, 2, 3, 4, 5};
        System.out.println("Test Case 3:");
        System.out.println("Input:    " + Arrays.toString(heights3));
        System.out.println("Output:   " + solution.heightChecker(heights3));
        System.out.println("Expected: 0");
    }
}