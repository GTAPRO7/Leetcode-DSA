public class TitleToNumber {
    public int titleToNumber(String columnTitle) {
        int result = 0;

        for (int i = 0; i < columnTitle.length(); i++) {
            int charValue = columnTitle.charAt(i) - 'A' + 1;
            result = result * 26 + charValue;
        }

        return result;
    }
    public static void main(String[] args) {
        TitleToNumber solution = new TitleToNumber();

        String col1 = "A";
        System.out.println("Test Case 1:");
        System.out.println("Input:    \"" + col1 + "\"");
        System.out.println("Output:   " + solution.titleToNumber(col1));
        System.out.println("Expected: 1\n");

        String col2 = "AB";
        System.out.println("Test Case 2:");
        System.out.println("Input:    \"" + col2 + "\"");
        System.out.println("Output:   " + solution.titleToNumber(col2));
        System.out.println("Expected: 28\n");

        String col3 = "ZY";
        System.out.println("Test Case 3:");
        System.out.println("Input:    \"" + col3 + "\"");
        System.out.println("Output:   " + solution.titleToNumber(col3));
        System.out.println("Expected: 701\n");

        String col4 = "FXSHRXW";
        System.out.println("Test Case 4 (Upper boundary):");
        System.out.println("Input:    \"" + col4 + "\"");
        System.out.println("Output:   " + solution.titleToNumber(col4));
        System.out.println("Expected: 2147483647 (Integer.MAX_VALUE)");
    }
}