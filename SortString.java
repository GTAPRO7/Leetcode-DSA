public class SortString {
    public String sortString(String s) {
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        int totalChars = s.length();

        while (sb.length() < totalChars) {
            // Ascending pass: from 'a' to 'z'
            for (int i = 0; i < 26; i++) {
                if (count[i] > 0) {
                    sb.append((char) ('a' + i));
                    count[i]--;
                }
            }

            // Descending pass: from 'z' to 'a'
            for (int i = 25; i >= 0; i--) {
                if (count[i] > 0) {
                    sb.append((char) ('a' + i));
                    count[i]--;
                }
            }
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        SortString solution = new SortString();

        // Test Case 1
        String s1 = "aaaabbbbcccc";
        System.out.println("Test Case 1:");
        System.out.println("Input:    \"" + s1 + "\"");
        System.out.println("Output:   \"" + solution.sortString(s1) + "\"");
        System.out.println("Expected: \"abccbaabccba\"\n");

        // Test Case 2
        String s2 = "rat";
        System.out.println("Test Case 2:");
        System.out.println("Input:    \"" + s2 + "\"");
        System.out.println("Output:   \"" + solution.sortString(s2) + "\"");
        System.out.println("Expected: \"art\"\n");

        // Test Case 3: Single character repetitions
        String s3 = "ggggggg";
        System.out.println("Test Case 3:");
        System.out.println("Input:    \"" + s3 + "\"");
        System.out.println("Output:   \"" + solution.sortString(s3) + "\"");
        System.out.println("Expected: \"ggggggg\"\n");

        // Test Case 4: Alternating letters
        String s4 = "leetcode";
        System.out.println("Test Case 4:");
        System.out.println("Input:    \"" + s4 + "\"");
        System.out.println("Output:   \"" + solution.sortString(s4) + "\"");
        System.out.println("Expected: \"cdelotee\"");
    }
}