import java.util.Arrays;

public class OddCells {
    public int oddCells(int m, int n, int[][] indices) {
        boolean[] oddRows = new boolean[m];
        boolean[] oddCols = new boolean[n];

        for (int[] idx : indices) {
            oddRows[idx[0]] = !oddRows[idx[0]];
            oddCols[idx[1]] = !oddCols[idx[1]];
        }

        int rOdd = 0;
        for (boolean isOdd : oddRows) {
            if (isOdd) {
                rOdd++;
            }
        }

        int cOdd = 0;
        for (boolean isOdd : oddCols) {
            if (isOdd) {
                cOdd++;
            }
        }

        return rOdd * (n - cOdd) + (m - rOdd) * cOdd;
    }
    public static void main(String[] args) {
        OddCells solution = new OddCells();

        int m1 = 2, n1 = 3;
        int[][] indices1 = {{0, 1}, {1, 1}};
        System.out.println("Test Case 1:");
        System.out.println("m = " + m1 + ", n = " + n1 + ", indices = " + Arrays.deepToString(indices1));
        System.out.println("Output:   " + solution.oddCells(m1, n1, indices1));
        System.out.println("Expected: 6\n");

        int m2 = 2, n2 = 2;
        int[][] indices2 = {{1, 1}, {0, 0}};
        System.out.println("Test Case 2:");
        System.out.println("m = " + m2 + ", n = " + n2 + ", indices = " + Arrays.deepToString(indices2));
        System.out.println("Output:   " + solution.oddCells(m2, n2, indices2));
        System.out.println("Expected: 0\n");

        int m3 = 1, n3 = 1;
        int[][] indices3 = {{0, 0}};
        System.out.println("Test Case 3 (1x1 matrix):");
        System.out.println("m = " + m3 + ", n = " + n3 + ", indices = " + Arrays.deepToString(indices3));
        System.out.println("Output:   " + solution.oddCells(m3, n3, indices3));
        System.out.println("Expected: 0"); 
    }
}