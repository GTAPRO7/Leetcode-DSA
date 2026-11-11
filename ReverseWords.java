public class ReverseWords {
    public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int n = chars.length;
        int start = 0;

        for (int i = 0; i <= n; i++) {
            if (i == n || chars[i] == ' ') {
                reverse(chars, start, i - 1);
                start = i + 1;
            }
        }

        return new String(chars);
    }

    private void reverse(char[] chars, int left, int right) {
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        ReverseWords solution = new ReverseWords();

        String s1 = "Let's take LeetCode contest";
        System.out.println("Test Case 1:");
        System.out.println("Input:    \"" + s1 + "\"");
        System.out.println("Output:   \"" + solution.reverseWords(s1) + "\"");
        System.out.println("Expected: \"s'teL ekat edoCteeL tsetnoc\"\n");

        String s2 = "Mr Ding";
        System.out.println("Test Case 2:");
        System.out.println("Input:    \"" + s2 + "\"");
        System.out.println("Output:   \"" + solution.reverseWords(s2) + "\"");
        System.out.println("Expected: \"rM gniD\"\n");

        String s3 = "Java";
        System.out.println("Test Case 3 (Single word):");
        System.out.println("Input:    \"" + s3 + "\"");
        System.out.println("Output:   \"" + solution.reverseWords(s3) + "\"");
        System.out.println("Expected: \"avaJ\"\n");

        String s4 = "a b c d";
        System.out.println("Test Case 4 (Single letter words):");
        System.out.println("Input:    \"" + s4 + "\"");
        System.out.println("Output:   \"" + solution.reverseWords(s4) + "\"");
        System.out.println("Expected: \"a b c d\"");
    }
}