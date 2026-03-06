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


// 1's Complement - Simply flipping the bits
// 2's Complement - Adding 1 to the 1's complement


// AND Operator - Every bit should be true/1 to be true
// OR Operator - Even one false means false
// XOR Operator - Odd number of 1's give 1 and even number of 1's give 0
// Shift Operator - Right Shift means shifting the rightest bit off and 0 comes at leftest bit
// for right shift - num >> k = num / 2^k


// the computer stores the positive number with the first bit as 0 
// negative number with the first number as 1 (it does 2's complement to store it as negative number)


// Shift Operator - Left shift means the leftest bit goes off and a 0 comes at the rightest bit
// for left shifting - num << k = num * 2^k


// NOT operator - first it flips the bits, then checks if it is negative 
// If it is negative then it stores the 2's complement or it stops 


