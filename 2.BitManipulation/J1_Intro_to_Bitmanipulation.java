// Conversion from a decimal to binary takes division by 2 unitl the remainder is 1
// Conversion from binary to decimal takes multiplication from right to left with 2 raised to the power of the index

// Function to covert decimal to binary equivalent
// public class bit {
//     static String converted(int n){
//         String res = "";
//         while(n > 0){
//             if(n % 2 == 1){
//                 res += '1';
//             }
//             else{
//                 res += '0';
//             }
//             n = n / 2;
//         }
//         String rev = "";
//         for(int i = res.length() - 1; i>= 0 ;i--){
//             rev += res.charAt(i);
//         }
//         return rev;
//     }
//     public static void main(String[] args) {
//         System.out.println(converted(13));
//     }
// }

// Function to covert binary to decimal
// public class bit {
//     static int binaryToDecimal(String binary) {
//         int result = 0;

//         for (int i = 0; i < binary.length(); i++) {
//             result = result * 2 + (binary.charAt(i) - '0');
//         }

//         return result;
//     }
//     public static void main(String[] args) {
//         System.out.println(binaryToDecimal("1101"));
//     }
// }


