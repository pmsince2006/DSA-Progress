import java.util.*;

public class BubbleSort {

    // Bubble Sort
    // ----------------------------
    // Idea:
    // Repeatedly compare adjacent elements and swap if they are in wrong order

    // Working:
    // 1. Traverse the array multiple times
    // 2. In each pass, compare adjacent elements
    // 3. Swap if left > right
    // 4. After each pass, largest element moves to the end
    // 5. Repeat until array is sorted

    // Key Points:
    // - Time Complexity: O(n^2) worst & average, O(n) best (optimized)
    // - Space Complexity: O(1)
    // - Stable: Yes
    // - In-place: Yes

    static void bubble(int[] arr){
        int n = arr.length;

        for(int i = 0; i < n - 1; i++){
            boolean swapped = false;

            for(int j = 0; j < n - i - 1; j++){
                if(arr[j] > arr[j + 1]){

                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;

                }
            }

            // Stop if already sorted
            if(!swapped) break;
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

        System.out.println("Original Array:");
        print(arr);

        bubble(arr);

        System.out.println("Sorted Array:");
        print(arr);
    }
}
