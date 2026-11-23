public class SortSentence {
    public String sortSentence(String s) {
        String[] tokens = s.split(" ");
        String[] ordered = new String[tokens.length];

        for (String token : tokens) {
            int lastIdx = token.length() - 1;
            int position = token.charAt(lastIdx) - '1';
            ordered[position] = token.substring(0, lastIdx);
        }

        return String.join(" ", ordered);
    }

    public static void main(String[] args) {
        SortSentence solution = new SortSentence();

        String s1 = "is2 sentence4 This1 a3";
        System.out.println("Test Case 1:");
        System.out.println("Input:    \"" + s1 + "\"");
        System.out.println("Output:   \"" + solution.sortSentence(s1) + "\"");
        System.out.println("Expected: \"This is a sentence\"\n");

        String s2 = "Myself2 Me1 I4 and3";
        System.out.println("Test Case 2:");
        System.out.println("Input:    \"" + s2 + "\"");
        System.out.println("Output:   \"" + solution.sortSentence(s2) + "\"");
        System.out.println("Expected: \"Me Myself and I\"\n");

        String s3 = "Hello1";
        System.out.println("Test Case 3 (Single word):");
        System.out.println("Input:    \"" + s3 + "\"");
        System.out.println("Output:   \"" + solution.sortSentence(s3) + "\"");
        System.out.println("Expected: \"Hello\"");
    }
}