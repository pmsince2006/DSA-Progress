public class StringRotation {

    // String Rotation
    // ----------------------------
    // Idea:
    // Check whether str2 is a rotation of str1.
    //
    // Working:
    // 1. Rotations must have the same length
    // 2. Concatenate str1 with itself
    // 3. If str2 is present in str1 + str1,
    //    then str2 is a rotation of str1
    //
    // Example:
    // str1 = "abcd"
    // str2 = "cdab"
    //
    // str1 + str1 = "abcdabcd"
    // "cdab" is present → Rotation
    //
    // Key Pattern:
    // Same Length + (str1 + str1).contains(str2)
    //
    // Time Complexity: O(n)
    // Space Complexity: O(n)


    // ------------------------------------------------
    // Check String Rotation
    // ------------------------------------------------

    static int isRotation(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return 0;
        }

        String test = str1 + str1;

        if (test.contains(str2)) {
            return 1;
        }

        return 0;
    }


    public static void main(String[] args) {

        String str1 = "abcd";
        String str2 = "cdab";

        int result = isRotation(str1, str2);

        System.out.println("Is Rotation: " + (result == 1 ? "YES" : "NO"));
    }
}
