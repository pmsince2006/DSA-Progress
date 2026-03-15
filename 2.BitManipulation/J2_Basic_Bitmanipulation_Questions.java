// Swap to number without using third variable:

// public class bitproblem {
//     public static void main(String[] args) {
//         int a = 5;
//         int b = 7;

//         a = a ^ b;
//         b = a ^ b; // (a ^ b) ^ b = a;
//         a = a ^ b; // (a ^ b) ^ a = b;
//         // swapped successfully

//         System.out.println(a);
//         System.out.println(b);
//     }
// }



// Check if the ith bit is set or not:
// public class bitproblem {
//     public static void main(String[] args) {

//         // Using left shift operator
//         int i = 1;
//         int n = 13;

//         if ((n & (1 << i)) != 0) {
//             System.out.println("Bit is set");
//         } else {
//             System.out.println("Bit is not set");
//         }

//         // Using right shift operator
//         int j = 1;
//         int x = 13;

//         if (((x >> j) & 1) == 1) {
//             System.out.println("Bit is set");
//         } else {
//             System.out.println("Bit is not set");
//         }
//     }
// }



// Setting an ith bit
// public class bitproblem{
//     static int setBit(int n, int i) {
//         return n | (1 << i);
//     }

//     public static void main(String[] args) {
//         int n = 10;
//         int i = 2;

//         int result = setBit(n, i);

//         System.out.println("Original number: " + n);
//         System.out.println("Number after setting " + i + "th bit: " + result);
//     }
// }



// Clearing the ith bit
// public class bitproblem{
//     static int clrbit(int n,int i){
//         return n & ~(1 << i);
//     }
//     public static void main(String[] args) {
//         int n = 13;
//         int i = 2;

//         int result = clrbit(n,i);

//         System.out.println("Original number: " + n);
//         System.out.println("Number after setting " + i + "th bit: " + result);
//     }
// }
