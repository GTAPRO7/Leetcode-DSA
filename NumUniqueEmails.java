import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NumUniqueEmails {
    public int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet<>();

        for (String email : emails) {
            StringBuilder cleanEmail = new StringBuilder();
            int atIndex = email.indexOf('@');

            for (int i = 0; i < atIndex; i++) {
                char c = email.charAt(i);
                if (c == '+') {
                    break;
                }
                if (c != '.') {
                    cleanEmail.append(c);
                }
            }

            cleanEmail.append(email.substring(atIndex));
            uniqueEmails.add(cleanEmail.toString());
        }

        return uniqueEmails.size();
    }
    public static void main(String[] args) {
        NumUniqueEmails solution = new NumUniqueEmails();

        String[] emails1 = {
            "test.email+alex@leetcode.com",
            "test.e.mail+bob.cathy@leetcode.com",
            "testemail+david@lee.tcode.com"
        };
        System.out.println("Test Case 1:");
        System.out.println("Input:    " + Arrays.toString(emails1));
        System.out.println("Output:   " + solution.numUniqueEmails(emails1));
        System.out.println("Expected: 2\n");

        String[] emails2 = {
            "a@leetcode.com",
            "b@leetcode.com",
            "c@leetcode.com"
        };
        System.out.println("Test Case 2:");
        System.out.println("Input:    " + Arrays.toString(emails2));
        System.out.println("Output:   " + solution.numUniqueEmails(emails2));
        System.out.println("Expected: 3\n");

        String[] emails3 = {
            "alice.smith+work@sub.domain.com",
            "alicesmith+personal@sub.domain.com",
            "alicesmith@subdomain.com"
        };
        System.out.println("Test Case 3 (Domain preservation check):");
        System.out.println("Input:    " + Arrays.toString(emails3));
        System.out.println("Output:   " + solution.numUniqueEmails(emails3));
        System.out.println("Expected: 2");
    }
}