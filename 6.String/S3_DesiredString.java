public class RemoveConsecutiveDuplicates {

    // Remove Consecutive Duplicate Characters
    // ----------------------------
    // Idea:
    // Remove repeated characters that occur consecutively,
    // keeping only the first occurrence.
    //
    // Working:
    // 1. Traverse the string from left to right
    // 2. Always keep the first character
    // 3. Compare the current character with the previous one
    // 4. Add it only if they are different
    //
    // Example:
    // "aaabbccdaa"
    //      ↓
    // "abcda"
    //
    // Key Pattern:
    // Compare current character with previous character
    //
    // Time Complexity: O(n)
    // Space Complexity: O(n) -> StringBuilder


    // ------------------------------------------------
    // Remove Consecutive Duplicates
    // ------------------------------------------------

    static String getDesiredString(String str) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            if (i == 0 || str.charAt(i) != str.charAt(i - 1)) {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }


    public static void main(String[] args) {

        String str = "aaabbccdaa";

        String result = getDesiredString(str);

        System.out.println("Original String: " + str);
        System.out.println("Updated String: " + result);
    }
}
