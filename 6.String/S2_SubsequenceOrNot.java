public class StringSubsequence {

    // String Subsequence
    // ----------------------------
    // Idea:
    // Check whether all characters of str2 appear in str1
    // in the same order, but not necessarily continuously.
    //
    // Working:
    // 1. Use two pointers i and j
    // 2. i traverses str1
    // 3. j traverses str2
    // 4. If characters match, move j
    // 5. Always move i
    // 6. If j reaches the end of str2, it is a subsequence
    //
    // Example:
    // str1 = "abcde"
    // str2 = "ace"
    //
    // a → match
    // b → skip
    // c → match
    // d → skip
    // e → match
    //
    // Result: true
    //
    // Key Pattern:
    // Two Pointers → one pointer scans str1,
    // second pointer searches for str2 characters
    //
    // Time Complexity: O(n)
    // Space Complexity: O(1)


    // ------------------------------------------------
    // Check String Subsequence
    // ------------------------------------------------

    static boolean strSubsequence(String str1, String str2) {

        int i = 0;
        int j = 0;

        while (i < str1.length() && j < str2.length()) {

            if (str1.charAt(i) == str2.charAt(j)) {
                j++;
            }

            i++;
        }

        return j == str2.length();
    }


    public static void main(String[] args) {

        String str1 = "abcde";
        String str2 = "ace";

        boolean result = strSubsequence(str1, str2);

        System.out.println("Is \"" + str2 +
                "\" a subsequence of \"" + str1 + "\"? " + result);
    }
}
