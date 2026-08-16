public class MergeSort {

    // Merge Sort
    // ----------------------------
    // Idea:
    // Divide the array into two halves recursively,
    // sort both halves, and then merge them into one sorted array.

    // Working:
    // 1. Find the middle of the current range
    // 2. Recursively divide the left half
    // 3. Recursively divide the right half
    // 4. Merge the two sorted halves
    // 5. Continue until each subarray contains only one element
    // 6. Merge the sorted subarrays back together

    // Key Points:
    // - Divide and Conquer algorithm
    // - Time Complexity: O(n log n) in best, average & worst cases
    // - Space Complexity: O(n) due to temporary array
    // - Stable: Yes
    // - In-place: No
    // - Does not depend on the initial order of elements
    //
    // Important Pattern:
    // Divide -> Sort Left -> Sort Right -> Merge


    static void mergeSort(int[] arr, int low, int high) {

        // Base case:
        // If only one element (or no element) is present,
        // the subarray is already sorted
        if (low >= high) {
            return;
        }

        // Find middle index
        int mid = (low + high) / 2;

        // Divide and sort left half
        mergeSort(arr, low, mid);

        // Divide and sort right half
        mergeSort(arr, mid + 1, high);

        // Merge both sorted halves
        merge(arr, low, mid, high);
    }


    static void merge(int[] arr, int low, int mid, int high) {

        int left = low;
        int right = mid + 1;

        // Temporary array to store merged result
        int[] temp = new int[high - low + 1];

        int k = 0;

        // Compare elements from both sorted halves
        while (left <= mid && right <= high) {

            if (arr[left] <= arr[right]) {
                temp[k] = arr[left];
                left++;
            }
            else {
                temp[k] = arr[right];
                right++;
            }

            k++;
        }

        // Copy remaining elements from left half
        while (left <= mid) {
            temp[k++] = arr[left++];
        }

        // Copy remaining elements from right half
        while (right <= high) {
            temp[k++] = arr[right++];
        }

        // Copy merged elements back into original array
        for (int i = 0; i < temp.length; i++) {
            arr[low + i] = temp[i];
        }
    }


    static void print(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {

        int[] arr = {2, 7, 4, 1, 5, 3};

        System.out.println("Original Array:");
        print(arr);

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array:");
        print(arr);
    }
}
