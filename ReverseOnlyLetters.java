public class ReverseOnlyLetters {
    public String reverseOnlyLetters(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            if (!Character.isLetter(chars[left])) {
                left++;
            } else if (!Character.isLetter(chars[right])) {
                right--;
            } else {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }

        return new String(chars);
    }
    public static void main(String[] args) {
        ReverseOnlyLetters solution = new ReverseOnlyLetters();

        String s1 = "ab-cd";
        System.out.println("Test Case 1:");
        System.out.println("Input:    \"" + s1 + "\"");
        System.out.println("Output:   \"" + solution.reverseOnlyLetters(s1) + "\"");
        System.out.println("Expected: \"dc-ba\"\n");

        String s2 = "a-bC-dEf-ghIj";
        System.out.println("Test Case 2:");
        System.out.println("Input:    \"" + s2 + "\"");
        System.out.println("Output:   \"" + solution.reverseOnlyLetters(s2) + "\"");
        System.out.println("Expected: \"j-Ih-gfE-dCba\"\n");

        String s3 = "Test1ng-Leet=code-Q!";
        System.out.println("Test Case 3:");
        System.out.println("Input:    \"" + s3 + "\"");
        System.out.println("Output:   \"" + solution.reverseOnlyLetters(s3) + "\"");
        System.out.println("Expected: \"Qedo1ct-eeLg=ntse-T!\"\n");

        String s4 = "123-456!@#";
        System.out.println("Test Case 4 (Only symbols & digits):");
        System.out.println("Input:    \"" + s4 + "\"");
        System.out.println("Output:   \"" + solution.reverseOnlyLetters(s4) + "\"");
        System.out.println("Expected: \"123-456!@#\"");
    }
}