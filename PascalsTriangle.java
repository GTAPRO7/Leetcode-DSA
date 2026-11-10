import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int r = 0; r < numRows; r++) {
            List<Integer> row = new ArrayList<>();

            for (int c = 0; c <= r; c++) {
                if (c == 0 || c == r) {
                    row.add(1);
                } else {
                    List<Integer> prevRow = triangle.get(r - 1);
                    row.add(prevRow.get(c - 1) + prevRow.get(c));
                }
            }

            triangle.add(row);
        }

        return triangle;
    }
    public static void main(String[] args) {
        PascalsTriangle solution = new PascalsTriangle();

        int numRows1 = 5;
        System.out.println("Test Case 1:");
        System.out.println("Input:    numRows = " + numRows1);
        System.out.println("Output:   " + solution.generate(numRows1));
        System.out.println("Expected: [[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]\n");

        int numRows2 = 1;
        System.out.println("Test Case 2:");
        System.out.println("Input:    numRows = " + numRows2);
        System.out.println("Output:   " + solution.generate(numRows2));
        System.out.println("Expected: [[1]]\n");

        int numRows3 = 6;
        System.out.println("Test Case 3:");
        System.out.println("Input:    numRows = " + numRows3);
        System.out.println("Output:   " + solution.generate(numRows3));
        System.out.println("Expected: [[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1], [1, 5, 10, 10, 5, 1]]");
    }
}