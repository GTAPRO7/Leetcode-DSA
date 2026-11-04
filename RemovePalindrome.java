public class RemovePalindrome {
    public int removePalindromeSub(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return 2;
            }
            left++;
            right--;
        }

        return 1;
    }
    public static void main(String[] args) {
        RemovePalindrome solution = new RemovePalindrome();

        String s1 = "ababa";
        System.out.println("Test Case 1:");
        System.out.println("Input:    \"" + s1 + "\"");
        System.out.println("Output:   " + solution.removePalindromeSub(s1));
        System.out.println("Expected: 1\n");

        String s2 = "abb";
        System.out.println("Test Case 2:");
        System.out.println("Input:    \"" + s2 + "\"");
        System.out.println("Output:   " + solution.removePalindromeSub(s2));
        System.out.println("Expected: 2\n");

        String s3 = "baabb";
        System.out.println("Test Case 3:");
        System.out.println("Input:    \"" + s3 + "\"");
        System.out.println("Output:   " + solution.removePalindromeSub(s3));
        System.out.println("Expected: 2\n");

        String s4 = "a";
        System.out.println("Test Case 4:");
        System.out.println("Input:    \"" + s4 + "\"");
        System.out.println("Output:   " + solution.removePalindromeSub(s4));
        System.out.println("Expected: 1");
    }
}