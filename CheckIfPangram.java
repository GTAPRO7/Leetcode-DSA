public class CheckIfPangram {
    public boolean checkIfPangram(String sentence) {
        boolean[] seen = new boolean[26];
        int uniqueCount = 0;

        for (int i = 0; i < sentence.length(); i++) {
            int idx = sentence.charAt(i) - 'a';
            if (!seen[idx]) {
                seen[idx] = true;
                uniqueCount++;
                if (uniqueCount == 26) {
                    return true;
                }
            }
        }

        return uniqueCount == 26;
    }
    public static void main(String[] args) {
        CheckIfPangram solution = new CheckIfPangram();

        String sentence1 = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println("Test Case 1:");
        System.out.println("Input:    \"" + sentence1 + "\"");
        System.out.println("Output:   " + solution.checkIfPangram(sentence1));
        System.out.println("Expected: true\n");

        String sentence2 = "leetcode";
        System.out.println("Test Case 2:");
        System.out.println("Input:    \"" + sentence2 + "\"");
        System.out.println("Output:   " + solution.checkIfPangram(sentence2));
        System.out.println("Expected: false\n");

        String sentence3 = "thequickbrownfoxjumpsoverthelaydog";
        System.out.println("Test Case 3 (Missing 'z'):");
        System.out.println("Input:    \"" + sentence3 + "\"");
        System.out.println("Output:   " + solution.checkIfPangram(sentence3));
        System.out.println("Expected: false");
    }
}