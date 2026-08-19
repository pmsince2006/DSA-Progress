public class ReverseWordsOrder {

    // Reverse Words Order
    // ----------------------------
    // Idea:
    // Reverse the order of words in a string while keeping
    // the characters inside each word unchanged.
    
    // Working:
    // 1. Split the string into words using space
    // 2. Start traversing from the last word
    // 3. Append each word to StringBuilder
    // 4. Add a space between words
    // 5. Return the resulting string
    //
    // Example:
    // "I love coding"
    //        ↓
    // ["I", "love", "coding"]
    //        ↓
    // "coding love I"
    //
    // Key Points:
    // - Words are reversed, NOT individual characters
    // - String.split(" ") is used to separate words
    // - StringBuilder is used to efficiently build the result
    // - Traverse the array from right to left
    //
    // Time Complexity:
    // - O(n) -> Each character/word is processed
    //
    // Space Complexity:
    // - O(n) -> String array + StringBuilder
    //
    // Important Pattern:
    // String → Split → Traverse Backwards → Build Result


    // ------------------------------------------------
    // Reverse Words Order
    // ------------------------------------------------

    static String revWordsOrder(String str) {

        String[] arr = str.split(" ");

        StringBuilder sb = new StringBuilder();

        for (int i = arr.length - 1; i >= 0; i--) {

            sb.append(arr[i]);

            if (i > 0) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }


    public static void main(String[] args) {

        String str = "I love coding";

        String result = revWordsOrder(str);

        System.out.println("Original String: " + str);
        System.out.println("Reversed Words: " + result);
    }
}
