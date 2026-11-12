public class RemoveDuplicates {
    public String removeDuplicates(String s) {
        StringBuilder stack = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int len = stack.length();

            if (len > 0 && stack.charAt(len - 1) == c) {
                stack.deleteCharAt(len - 1);
            } else {
                stack.append(c);
            }
        }

        return stack.toString();
    }
    public static void main(String[] args) {
        RemoveDuplicates solution = new RemoveDuplicates();

        String s1 = "abbaca";
        System.out.println("Test Case 1:");
        System.out.println("Input:    \"" + s1 + "\"");
        System.out.println("Output:   \"" + solution.removeDuplicates(s1) + "\"");
        System.out.println("Expected: \"ca\"\n");

        String s2 = "azxxzy";
        System.out.println("Test Case 2:");
        System.out.println("Input:    \"" + s2 + "\"");
        System.out.println("Output:   \"" + solution.removeDuplicates(s2) + "\"");
        System.out.println("Expected: \"ay\"\n");

        String s3 = "abccba";
        System.out.println("Test Case 3 (Complete cancellation):");
        System.out.println("Input:    \"" + s3 + "\"");
        System.out.println("Output:   \"" + solution.removeDuplicates(s3) + "\"");
        System.out.println("Expected: \"\"\n");

        String s4 = "aaa";
        System.out.println("Test Case 4 (Odd consecutive run):");
        System.out.println("Input:    \"" + s4 + "\"");
        System.out.println("Output:   \"" + solution.removeDuplicates(s4) + "\"");
        System.out.println("Expected: \"a\"");
    }
}