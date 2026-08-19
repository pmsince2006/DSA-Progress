public class IntegerToWords {

    // Integer to English Words
    // ----------------------------
    // Idea:
    // Convert a number into its English phrase using the
    // Indian number system (lakhs and thousands).
    //
    // Working:
    // 1. Handle numbers from 1-19 using the ones array
    // 2. Handle 20-99 using tens + ones
    // 3. Break the number into:
    //    - Lakhs
    //    - Thousands
    //    - Hundreds
    //    - Last two digits
    // 4. Convert each part separately and append its word
    //
    // Example:
    // 12345
    //   ↓
    // 12 thousand + 345
    //   ↓
    // twelve thousand three hundred forty five
    //
    // Key Pattern:
    // Number → Lakhs → Thousands → Hundreds → Last 2 digits
    //
    // Time Complexity: O(log n)
    // Space Complexity: O(n) -> StringBuilder


    static String[] ones = {
        "", "one", "two", "three", "four",
        "five", "six", "seven", "eight", "nine",
        "ten", "eleven", "twelve", "thirteen", "fourteen",
        "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };


    static String[] ten = {
        "", "", "twenty", "thirty", "forty",
        "fifty", "sixty", "seventy", "eighty", "ninety"
    };


    // ------------------------------------------------
    // Convert number from 1 to 99 into words
    // ------------------------------------------------

    static String twodigits(int n) {

        if (n < 20) {
            return ones[n];
        }

        return ten[n / 10] +
               (n % 10 != 0 ? " " + ones[n % 10] : "");
    }


    // ------------------------------------------------
    // Integer to English Words
    // ------------------------------------------------

    static void intToWord(int n) {

        if (n == 0) {
            System.out.print("zero");
            return;
        }

        StringBuilder sb = new StringBuilder();


        // Lakhs
        if (n >= 100000) {

            sb.append(twodigits(n / 100000));
            sb.append(" lakhs ");

            n %= 100000;
        }


        // Thousands
        if (n >= 1000) {

            sb.append(twodigits(n / 1000));
            sb.append(" thousand ");

            n %= 1000;
        }


        // Hundreds
        if (n >= 100) {

            sb.append(ones[n / 100]);
            sb.append(" hundred ");

            n %= 100;
        }


        // Last two digits
        if (n > 0) {
            sb.append(twodigits(n));
        }


        System.out.print(sb.toString().trim());
    }


    public static void main(String[] args) {

        int n = 999999;

        System.out.print("Number in words: ");
        intToWord(n);
    }
}
