import java.util.Arrays;

public class CountCharacters {
    public int countCharacters(String[] words, String chars) {
        int[] charCounts = new int[26];
        for (int i = 0; i < chars.length(); i++) {
            charCounts[chars.charAt(i) - 'a']++;
        }

        int totalLength = 0;

        for (String word : words) {
            if (word.length() > chars.length()) {
                continue;
            }

            if (canForm(word, charCounts)) {
                totalLength += word.length();
            }
        }

        return totalLength;
    }

    private boolean canForm(String word, int[] charCounts) {
        int[] wordCounts = new int[26];
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            wordCounts[idx]++;
            if (wordCounts[idx] > charCounts[idx]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        CountCharacters solution = new CountCharacters();

        String[] words1 = {"cat", "bt", "hat", "tree"};
        String chars1 = "atach";
        System.out.println("Test Case 1:");
        System.out.println("words:    " + Arrays.toString(words1));
        System.out.println("chars:    \"" + chars1 + "\"");
        System.out.println("Output:   " + solution.countCharacters(words1, chars1));
        System.out.println("Expected: 6\n");

        String[] words2 = {"hello", "world", "leetcode"};
        String chars2 = "welldonehoneyr";
        System.out.println("Test Case 2:");
        System.out.println("words:    " + Arrays.toString(words2));
        System.out.println("chars:    \"" + chars2 + "\"");
        System.out.println("Output:   " + solution.countCharacters(words2, chars2));
        System.out.println("Expected: 10\n");

        String[] words3 = {"abc", "def", "ghi"};
        String chars3 = "xyz";
        System.out.println("Test Case 3 (No good strings):");
        System.out.println("words:    " + Arrays.toString(words3));
        System.out.println("chars:    \"" + chars3 + "\"");
        System.out.println("Output:   " + solution.countCharacters(words3, chars3));
        System.out.println("Expected: 0");
    }
}
