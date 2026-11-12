import java.util.Arrays;

public class MinDeletionSize {
    public int minDeletionSize(String[] strs) {
        int numRows = strs.length;
        int numCols = strs[0].length();
        int deleteCount = 0;

        for (int col = 0; col < numCols; col++) {
            for (int row = 1; row < numRows; row++) {
                if (strs[row].charAt(col) < strs[row - 1].charAt(col)) {
                    deleteCount++;
                    break;
                }
            }
        }

        return deleteCount;
    }
    public static void main(String[] args) {
        MinDeletionSize solution = new MinDeletionSize();

        String[] strs1 = {"cba", "daf", "ghi"};
        System.out.println("Test Case 1:");
        System.out.println("Input:    " + Arrays.toString(strs1));
        System.out.println("Output:   " + solution.minDeletionSize(strs1));
        System.out.println("Expected: 1\n");

        String[] strs2 = {"a", "b"};
        System.out.println("Test Case 2:");
        System.out.println("Input:    " + Arrays.toString(strs2));
        System.out.println("Output:   " + solution.minDeletionSize(strs2));
        System.out.println("Expected: 0\n");

        String[] strs3 = {"zyx", "wvu", "tsr"};
        System.out.println("Test Case 3:");
        System.out.println("Input:    " + Arrays.toString(strs3));
        System.out.println("Output:   " + solution.minDeletionSize(strs3));
        System.out.println("Expected: 3\n");

        String[] strs4 = {"abc", "bce", "cae"};
        System.out.println("Test Case 4:");
        System.out.println("Input:    " + Arrays.toString(strs4));
        System.out.println("Output:   " + solution.minDeletionSize(strs4));
        System.out.println("Expected: 1");
    }
}