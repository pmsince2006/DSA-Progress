public class QuickSort {

    // Quick Sort
    // ----------------------------
    // Idea:
    // Choose an element as a pivot and place it at its correct
    // position such that:
    // - Elements smaller than pivot are on the left
    // - Elements greater than or equal to pivot are on the right
    //
    // Then recursively apply the same process to the left and right parts.

    // Working:
    // 1. Choose a pivot element
    // 2. Partition the array around the pivot
    // 3. Pivot reaches its correct position
    // 4. Recursively sort the left part
    // 5. Recursively sort the right part
    // 6. Stop when the subarray has 0 or 1 element

    // Key Points:
    // - Divide and Conquer algorithm
    // - Average Time Complexity: O(n log n)
    // - Worst Time Complexity: O(n^2)
    // - Space Complexity: O(log n) average due to recursion stack
    // - Worst Space Complexity: O(n) due to recursion stack
    // - Stable: No
    // - In-place: Yes
    //
    // Important Pattern:
    // Choose Pivot -> Partition -> Pivot at Correct Position
    // -> Recursively Sort Left & Right


    static void quickSort(int[] arr, int low, int high) {

        // Base case:
        // If the subarray has 0 or 1 element,
        // it is already sorted
        if (low >= high) {
            return;
        }

        // Partition the array
        // Pivot is placed at its correct position
        int pivot = partition(arr, low, high);

        // Recursively sort the left part
        quickSort(arr, low, pivot - 1);

        // Recursively sort the right part
        quickSort(arr, pivot + 1, high);
    }


    static int partition(int[] arr, int low, int high) {

        // Choose last element as pivot
        int pivot = arr[high];

        // i keeps track of the position
        // where the next smaller element should go
        int i = low - 1;

        // Traverse elements before the pivot
        for (int j = low; j < high; j++) {

            // If current element is smaller than pivot
            if (arr[j] < pivot) {

                i++;

                // Move smaller element to the left side
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place pivot between smaller and larger elements
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        // Return pivot's final position
        return i + 1;
    }


    static void print(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {

        int[] arr = {10, 7, 8, 9, 1, 5};

        System.out.println("Original Array:");
        print(arr);

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array:");
        print(arr);
    }
}
