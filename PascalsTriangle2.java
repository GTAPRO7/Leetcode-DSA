import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle2 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>(rowIndex + 1);
        row.add(1);

        for (int i = 1; i <= rowIndex; i++) {
            for (int j = i - 1; j >= 1; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
            row.add(1);
        }

        return row;
    }
    public static void main(String[] args) {
        PascalsTriangle2 solution = new PascalsTriangle2();

        int rowIndex1 = 3;
        System.out.println("Test Case 1:");
        System.out.println("Input:    rowIndex = " + rowIndex1);
        System.out.println("Output:   " + solution.getRow(rowIndex1));
        System.out.println("Expected: [1, 3, 3, 1]\n");

        int rowIndex2 = 0;
        System.out.println("Test Case 2:");
        System.out.println("Input:    rowIndex = " + rowIndex2);
        System.out.println("Output:   " + solution.getRow(rowIndex2));
        System.out.println("Expected: [1]\n");

        int rowIndex3 = 1;
        System.out.println("Test Case 3:");
        System.out.println("Input:    rowIndex = " + rowIndex3);
        System.out.println("Output:   " + solution.getRow(rowIndex3));
        System.out.println("Expected: [1, 1]\n");

        int rowIndex4 = 4;
        System.out.println("Test Case 4:");
        System.out.println("Input:    rowIndex = " + rowIndex4);
        System.out.println("Output:   " + solution.getRow(rowIndex4));
        System.out.println("Expected: [1, 4, 6, 4, 1]");
    }
}