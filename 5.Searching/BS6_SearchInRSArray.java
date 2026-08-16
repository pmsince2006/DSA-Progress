public class SearchRotatedSortedArray {

    // Search in a Rotated Sorted Array
    // ----------------------------------
    // Idea:
    // A sorted array is rotated at some pivot.
    // Even though the complete array is not sorted,
    // at least ONE half of the current search space
    // will always be sorted.
    //
    // Example:
    // Original: 1 2 3 4 5 6 7
    // Rotated : 4 5 6 7 1 2 3
    //
    // We use Binary Search by identifying which half
    // is sorted and checking whether the target lies
    // inside that half.


    // Working:
    // 1. Find mid
    // 2. If arr[mid] == target -> return mid
    // 3. Check which half is sorted
    //
    //    If arr[low] <= arr[mid]:
    //        Left half is sorted
    //
    //    Otherwise:
    //        Right half is sorted
    //
    // 4. Check if target lies inside the sorted half
    // 5. Search that half if it does
    // 6. Otherwise, search the other half
    // 7. Continue until target is found or search space is empty


    // Key Points:
    // - Array must be a rotated sorted array
    // - No duplicate elements assumed
    // - At least one half is always sorted
    // - Use the sorted half to decide where to search
    //
    // Time Complexity: O(log n)
    // Space Complexity: O(1)
    //
    // Important Pattern:
    // Find Sorted Half -> Check Target Range -> Eliminate Other Half


    static int searchRotatedSortedArray(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            // Target found
            if (arr[mid] == target) {
                return mid;
            }


            // -----------------------------------------
            // Left half is sorted
            // -----------------------------------------

            if (arr[low] <= arr[mid]) {

                // Check whether target lies inside
                // the sorted left half
                if (arr[low] <= target && target < arr[mid]) {

                    // Search left half
                    high = mid - 1;
                }
                else {

                    // Target must be in right half
                    low = mid + 1;
                }
            }


            // -----------------------------------------
            // Right half is sorted
            // -----------------------------------------

            else {

                // Check whether target lies inside
                // the sorted right half
                if (arr[mid] < target && target <= arr[high]) {

                    // Search right half
                    low = mid + 1;
                }
                else {

                    // Target must be in left half
                    high = mid - 1;
                }
            }
        }

        // Target not found
        return -1;
    }


    static void printResult(int index, int target) {

        if (index != -1) {
            System.out.println(
                "Element " + target +
                " found at index: " + index
            );
        }
        else {
            System.out.println(
                "Element " + target + " not found"
            );
        }
    }


    public static void main(String[] args) {

        int[] arr = {4, 5, 6, 7, 0, 1, 2};

        int target = 0;

        int index = searchRotatedSortedArray(arr, target);

        printResult(index, target);
    }
}
