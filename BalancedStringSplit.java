public class BalancedStringSplit {
    public int balancedStringSplit(String s) {
        int balance = 0;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') {
                balance++;
            } else {
                balance--;
            }

            if (balance == 0) {
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        BalancedStringSplit solution = new BalancedStringSplit();

        String s1 = "RLRRLLRLRL";
        System.out.println("Test Case 1:");
        System.out.println("Input:    \"" + s1 + "\"");
        System.out.println("Output:   " + solution.balancedStringSplit(s1));
        System.out.println("Expected: 4\n");

        String s2 = "RLRRRLLRLL";
        System.out.println("Test Case 2:");
        System.out.println("Input:    \"" + s2 + "\"");
        System.out.println("Output:   " + solution.balancedStringSplit(s2));
        System.out.println("Expected: 2\n");

        String s3 = "LLLLRRRR";
        System.out.println("Test Case 3:");
        System.out.println("Input:    \"" + s3 + "\"");
        System.out.println("Output:   " + solution.balancedStringSplit(s3));
        System.out.println("Expected: 1");
    }
}