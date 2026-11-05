public class StringGreat {
    public String makeGood(String s) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            int len = sb.length();
            if (len > 0 && Math.abs(sb.charAt(len - 1) - c) == 32) {
                sb.deleteCharAt(len - 1);
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        StringGreat solution = new StringGreat();

        String s1 = "leEeetcode";
        System.out.println("Test Case 1:");
        System.out.println("Input:    \"" + s1 + "\"");
        System.out.println("Output:   \"" + solution.makeGood(s1) + "\"");
        System.out.println("Expected: \"leetcode\"\n");

        String s2 = "abBAcC";
        System.out.println("Test Case 2:");
        System.out.println("Input:    \"" + s2 + "\"");
        System.out.println("Output:   \"" + solution.makeGood(s2) + "\"");
        System.out.println("Expected: \"\"\n");

        String s3 = "s";
        System.out.println("Test Case 3:");
        System.out.println("Input:    \"" + s3 + "\"");
        System.out.println("Output:   \"" + solution.makeGood(s3) + "\"");
        System.out.println("Expected: \"s\"\n");

        String s4 = "abBA";
        System.out.println("Test Case 4 (Cascading reaction):");
        System.out.println("Input:    \"" + s4 + "\"");
        System.out.println("Output:   \"" + solution.makeGood(s4) + "\"");
        System.out.println("Expected: \"\"");
    }
}