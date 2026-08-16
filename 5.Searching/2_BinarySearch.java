public class BinarySearch {

    // Binary Search
    // ----------------------------
    // Idea:
    // Search for an element in a SORTED array by repeatedly
    // dividing the search space into half.
    
    // Working:
    // 1. Set low = 0 and high = n - 1
    // 2. Find the middle element
    // 3. If arr[mid] == target -> element found
    // 4. If arr[mid] < target -> search in right half
    // 5. If arr[mid] > target -> search in left half
    // 6. Repeat until low > high
    
    // Key Points:
    // - Array MUST be sorted
    // - Works by eliminating half of the search space
    //   in every step
    // - Much faster than Linear Search for large sorted arrays
    // - Can be implemented using iteration or recursion
    //
    // Time Complexity:
    // - Best Case: O(1)       -> target is at middle
    // - Average Case: O(log n)
    // - Worst Case: O(log n)
    //
    // Space Complexity:
    // - Iterative: O(1)
    // - Recursive: O(log n) -> recursion stack
    //
    // Important Pattern:
    // low -> mid -> high
    //
    // If arr[mid] < target:
    //     Search Right -> low = mid + 1
    //
    // If arr[mid] > target:
    //     Search Left -> high = mid - 1


    // ------------------------------------------------
    // Iterative Binary Search
    // ------------------------------------------------

    static int binarySearch(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            // Avoids integer overflow
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[mid] < target) {
                // Target lies in right half
                low = mid + 1;
            }
            else {
                // Target lies in left half
                high = mid - 1;
            }
        }

        // Target not found
        return -1;
    }


    // ------------------------------------------------
    // Recursive Binary Search
    // ------------------------------------------------

    static int binarySearchRecursive(int[] arr, int low, int high, int target) {

        // Base case:
        // Search space becomes empty
        if (low > high) {
            return -1;
        }

        // Avoids integer overflow
        int mid = low + (high - low) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        // Search right half
        if (arr[mid] < target) {
            return binarySearchRecursive(arr, mid + 1, high, target);
        }

        // Search left half
        return binarySearchRecursive(arr, low, mid - 1, target);
    }


    static void printResult(int index, int target) {

        if (index != -1) {
            System.out.println(
                "Element " + target + " found at index: " + index
            );
        }
        else {
            System.out.println(
                "Element " + target + " not found"
            );
        }
    }


    public static void main(String[] args) {

        // Binary Search requires a sorted array
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72};

        int target = 23;

        // Iterative Binary Search
        int index = binarySearch(arr, target);

        System.out.println("Iterative Binary Search:");
        printResult(index, target);


        // Recursive Binary Search
        int recursiveIndex =
                binarySearchRecursive(arr, 0, arr.length - 1, target);

        System.out.println("\nRecursive Binary Search:");
        printResult(recursiveIndex, target);
    }
}
