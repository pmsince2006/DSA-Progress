import java.util.*;

// Selection Sort
// ----------------------------
// Idea:
// Repeatedly find the minimum element from the unsorted part
// and place it at the beginning.

// Working:
// 1. Divide array into sorted (left) and unsorted (right) parts
// 2. Assume current index has minimum element
// 3. Traverse remaining array to find actual minimum
// 4. Swap minimum element with current index
// 5. Repeat for all positions

// Key Points:
// - Time Complexity: O(n^2) (best, average, worst)
// - Space Complexity: O(1) (in-place)
// - Stable: No
// - Number of swaps: Minimum (one per pass)

// Use Case:
// Useful when memory writes (swaps) are costly


public class SelectionSort {

    static void selection(int[] arr){
        int n = arr.length;

        for(int i = 0; i < n - 1; i++){

            int min = i;

            for(int j = i + 1;j < n; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }


    static void print(int[] arr){
        for(int val : arr){
            System.out.print(val + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {

        int[] arr = {64, 25, 12, 22, 11};

        System.out.println("Original Array: ");
        
        print(arr);

        System.out.println("Sorted Array: ");

        selection(arr);
        print(arr);

    }
}

