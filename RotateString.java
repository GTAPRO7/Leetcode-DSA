public class RotateString {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        
        String doubled = s + s;
        return doubled.contains(goal);
    }
    public static void main(String[] args) {
        RotateString solution = new RotateString();

        String s1 = "abcde";
        String goal1 = "cdeab";
        boolean res1 = solution.rotateString(s1, goal1);
        System.out.println("Test Case 1:");
        System.out.println("s:        \"" + s1 + "\"");
        System.out.println("goal:     \"" + goal1 + "\"");
        System.out.println("Result:   " + res1);
        System.out.println("Expected: true\n");

        String s2 = "abcde";
        String goal2 = "abced";
        boolean res2 = solution.rotateString(s2, goal2);
        System.out.println("Test Case 2:");
        System.out.println("s:        \"" + s2 + "\"");
        System.out.println("goal:     \"" + goal2 + "\"");
        System.out.println("Result:   " + res2);
        System.out.println("Expected: false\n");

        String s3 = "aa";
        String goal3 = "a";
        boolean res3 = solution.rotateString(s3, goal3);
        System.out.println("Test Case 3 (Different Lengths):");
        System.out.println("s:        \"" + s3 + "\"");
        System.out.println("goal:     \"" + goal3 + "\"");
        System.out.println("Result:   " + res3);
        System.out.println("Expected: false");
    }
}