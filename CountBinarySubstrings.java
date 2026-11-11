public class CountBinarySubstrings {
    public int countBinarySubstrings(String s) {
        int ans = 0;
        int prevCount = 0;
        int currCount = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                currCount++;
            } else {
                ans += Math.min(prevCount, currCount);
                prevCount = currCount;
                currCount = 1;
            }
        }

        ans += Math.min(prevCount, currCount);

        return ans;
    }
    public static void main(String[] args) {
        CountBinarySubstrings solution = new CountBinarySubstrings();

        String s1 = "00110011";
        System.out.println("Test Case 1:");
        System.out.println("Input:    \"" + s1 + "\"");
        System.out.println("Output:   " + solution.countBinarySubstrings(s1));
        System.out.println("Expected: 6\n");

        String s2 = "10101";
        System.out.println("Test Case 2:");
        System.out.println("Input:    \"" + s2 + "\"");
        System.out.println("Output:   " + solution.countBinarySubstrings(s2));
        System.out.println("Expected: 4\n");

        String s3 = "00000";
        System.out.println("Test Case 3:");
        System.out.println("Input:    \"" + s3 + "\"");
        System.out.println("Output:   " + solution.countBinarySubstrings(s3));
        System.out.println("Expected: 0\n");

        String s4 = "0001111";
        System.out.println("Test Case 4:");
        System.out.println("Input:    \"" + s4 + "\"");
        System.out.println("Output:   " + solution.countBinarySubstrings(s4));
        System.out.println("Expected: 3");
    }
}