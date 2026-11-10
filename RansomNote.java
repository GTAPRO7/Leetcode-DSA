public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }

        int[] charCount = new int[26];

        for (int i = 0; i < magazine.length(); i++) {
            charCount[magazine.charAt(i) - 'a']++;
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            int idx = ransomNote.charAt(i) - 'a';
            charCount[idx]--;
            if (charCount[idx] < 0) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        RansomNote solution = new RansomNote();

        String ransomNote1 = "a";
        String magazine1 = "b";
        System.out.println("Test Case 1:");
        System.out.println("ransomNote: \"" + ransomNote1 + "\", magazine: \"" + magazine1 + "\"");
        System.out.println("Output:     " + solution.canConstruct(ransomNote1, magazine1));
        System.out.println("Expected:   false\n");

        String ransomNote2 = "aa";
        String magazine2 = "ab";
        System.out.println("Test Case 2:");
        System.out.println("ransomNote: \"" + ransomNote2 + "\", magazine: \"" + magazine2 + "\"");
        System.out.println("Output:     " + solution.canConstruct(ransomNote2, magazine2));
        System.out.println("Expected:   false\n");

        String ransomNote3 = "aa";
        String magazine3 = "aab";
        System.out.println("Test Case 3:");
        System.out.println("ransomNote: \"" + ransomNote3 + "\", magazine: \"" + magazine3 + "\"");
        System.out.println("Output:     " + solution.canConstruct(ransomNote3, magazine3));
        System.out.println("Expected:   true\n");

        String ransomNote4 = "abcdef";
        String magazine4 = "abc";
        System.out.println("Test Case 4 (ransomNote longer than magazine):");
        System.out.println("ransomNote: \"" + ransomNote4 + "\", magazine: \"" + magazine4 + "\"");
        System.out.println("Output:     " + solution.canConstruct(ransomNote4, magazine4));
        System.out.println("Expected:   false");
    }
}