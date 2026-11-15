import java.util.Arrays;

public class CountConsistentStrings {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] isAllowed = new boolean[26];
        for (int i = 0; i < allowed.length(); i++) {
            isAllowed[allowed.charAt(i) - 'a'] = true;
        }

        int consistentCount = 0;

        for (String word : words) {
            boolean isConsistent = true;
            for (int i = 0; i < word.length(); i++) {
                if (!isAllowed[word.charAt(i) - 'a']) {
                    isConsistent = false;
                    break;
                }
            }
            if (isConsistent) {
                consistentCount++;
            }
        }

        return consistentCount;
    }
    public static void main(String[] args) {
        CountConsistentStrings solution = new CountConsistentStrings();

        String allowed1 = "ab";
        String[] words1 = {"ad", "bd", "aaab", "baa", "badab"};
        System.out.println("Test Case 1:");
        System.out.println("allowed: \"" + allowed1 + "\", words: " + Arrays.toString(words1));
        System.out.println("Output:   " + solution.countConsistentStrings(allowed1, words1));
        System.out.println("Expected: 2\n");

        String allowed2 = "abc";
        String[] words2 = {"a", "b", "c", "ab", "ac", "bc", "abc"};
        System.out.println("Test Case 2:");
        System.out.println("allowed: \"" + allowed2 + "\", words: " + Arrays.toString(words2));
        System.out.println("Output:   " + solution.countConsistentStrings(allowed2, words2));
        System.out.println("Expected: 7\n");

        String allowed3 = "cad";
        String[] words3 = {"cc", "acd", "b", "ba", "bac", "bad", "ac", "d"};
        System.out.println("Test Case 3:");
        System.out.println("allowed: \"" + allowed3 + "\", words: " + Arrays.toString(words3));
        System.out.println("Output:   " + solution.countConsistentStrings(allowed3, words3));
        System.out.println("Expected: 4");
    }
}