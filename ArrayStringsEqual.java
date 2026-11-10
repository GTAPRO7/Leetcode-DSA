import java.util.Arrays;

public class ArrayStringsEqual {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int w1 = 0, c1 = 0;
        int w2 = 0, c2 = 0;

        while (w1 < word1.length && w2 < word2.length) {

            if (word1[w1].charAt(c1) != word2[w2].charAt(c2)) {
                return false;
            }

            c1++;
            c2++;

            if (c1 == word1[w1].length()) {
                w1++;
                c1 = 0;
            }

            if (c2 == word2[w2].length()) {
                w2++;
                c2 = 0;
            }
        }

        return w1 == word1.length && w2 == word2.length;
    }
    public static void main(String[] args) {
        ArrayStringsEqual solution = new ArrayStringsEqual();

        String[] word1_1 = {"ab", "c"};
        String[] word2_1 = {"a", "bc"};
        System.out.println("Test Case 1:");
        System.out.println("word1:    " + Arrays.toString(word1_1));
        System.out.println("word2:    " + Arrays.toString(word2_1));
        System.out.println("Output:   " + solution.arrayStringsAreEqual(word1_1, word2_1));
        System.out.println("Expected: true\n");

        String[] word1_2 = {"a", "cb"};
        String[] word2_2 = {"ab", "c"};
        System.out.println("Test Case 2:");
        System.out.println("word1:    " + Arrays.toString(word1_2));
        System.out.println("word2:    " + Arrays.toString(word2_2));
        System.out.println("Output:   " + solution.arrayStringsAreEqual(word1_2, word2_2));
        System.out.println("Expected: false\n");

        String[] word1_3 = {"abc", "d", "defg"};
        String[] word2_3 = {"abcddefg"};
        System.out.println("Test Case 3:");
        System.out.println("word1:    " + Arrays.toString(word1_3));
        System.out.println("word2:    " + Arrays.toString(word2_3));
        System.out.println("Output:   " + solution.arrayStringsAreEqual(word1_3, word2_3));
        System.out.println("Expected: true");
    }
}