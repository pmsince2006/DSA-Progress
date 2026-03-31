// Make Fibonacci call stack on paper for understanding
// In reality, system uses only ONE call stack (not separate ones)

// Example:
// fib(5) = fib(5-1) + fib(5-2)
// next: fib(4) = fib(4-1) + fib(4-2)
// result of fib(4) goes back to fib(5-1)

// Tail Recursion:
// A function is tail recursive if NOTHING is left to execute after return

// Fibonacci is NON-tail recursive:
// because it does extra work after recursive calls (addition)

// Non-tail recursion (Fibonacci):
// multiple function calls stay in stack at same time

// Tail recursion:
// only one chain of calls (push then pop)

// Time Complexity of Fibonacci (recursive):
// O(2^n)
public class first {
    public static void main(String[] args) {
        System.out.println(printn(5));
        
    }

    // Printing name n times using recursion
    //  static void printn(int n){
    //     if(n == 0){
    //         return;
    //     }
    //     printn(n-1);
    //     System.out.println("Prins mathur");
    // }
    
}
