public class LowerCase {
    public String toLowerCase(String s) {
        char[] chars = s.toCharArray();
        
        for (int i = 0; i < chars.length; i++) {
            // Check if character is between 'A' and 'Z'
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] = (char) (chars[i] + 32);
            }
        }
        
        return new String(chars);
    }
    public static void main(String[] args) {
        LowerCase solution = new LowerCase ();

        String s1 = "Hello";
        System.out.println("Test Case 1:");
        System.out.println("Input:    \"" + s1 + "\"");
        System.out.println("Output:   \"" + solution.toLowerCase(s1) + "\"");
        System.out.println("Expected: \"hello\"\n");

        String s2 = "here";
        System.out.println("Test Case 2:");
        System.out.println("Input:    \"" + s2 + "\"");
        System.out.println("Output:   \"" + solution.toLowerCase(s2) + "\"");
        System.out.println("Expected: \"here\"\n");

        String s3 = "LOVELY";
        System.out.println("Test Case 3:");
        System.out.println("Input:    \"" + s3 + "\"");
        System.out.println("Output:   \"" + solution.toLowerCase(s3) + "\"");
        System.out.println("Expected: \"lovely\"\n");

        String s4 = "Hello, World! 123";
        System.out.println("Test Case 4 (Punctuation & Numbers):");
        System.out.println("Input:    \"" + s4 + "\"");
        System.out.println("Output:   \"" + solution.toLowerCase(s4) + "\"");
        System.out.println("Expected: \"hello, world! 123\"");
    }
}