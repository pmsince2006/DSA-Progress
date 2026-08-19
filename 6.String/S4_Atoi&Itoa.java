public class AtoiItoa {

    // ATOI & ITOA
    // ----------------------------
    // Idea:
    // ATOI converts a String → Integer.
    // ITOA converts an Integer → String.
    //
    // ATOI Working:
    // - Process digits from left to right
    // - Convert character to digit using:
    //   char - '0'
    // - Build number using:
    //   num = num * 10 + digit
    // - Handle negative sign separately
    //
    // ITOA Working:
    // - Extract digits from right to left using % 10
    // - Convert digit to character using:
    //   (char)('0' + digit)
    // - Append digits to StringBuilder
    // - Reverse the result at the end
    //
    // Key Pattern:
    // ATOI: String → digits → Integer
    // ITOA: Integer → digits → String
    //
    // Time Complexity: O(n)
    // Space Complexity: O(n) for ITOA


    // ------------------------------------------------
    // ITOA: Integer to String
    // ------------------------------------------------

    static String itoa(int num) {

        StringBuilder sb = new StringBuilder();

        if (num == 0) {
            return "0";
        }

        boolean negative = num < 0;

        if (negative) {
            num = -num;
        }

        while (num > 0) {

            int digit = num % 10;

            sb.append((char)('0' + digit));

            num = num / 10;
        }

        if (negative) {
            sb.append('-');
        }

        return sb.reverse().toString();
    }


    // ------------------------------------------------
    // ATOI: String to Integer
    // ------------------------------------------------

    static int atoi(String str) {

        int num = 0;
        int sign = 1;
        int i = 0;

        if (str.charAt(0) == '-') {
            sign = -1;
            i++;
        }

        while (i < str.length()) {

            int digit = str.charAt(i) - '0';

            num = num * 10 + digit;

            i++;
        }

        return num * sign;
    }


    public static void main(String[] args) {

        int num = -12345;
        String str = "-12345";

        System.out.println("ITOA: " + itoa(num));
        System.out.println("ATOI: " + atoi(str));
    }
}
