public class LinearSearch {

    // Linear Search
    // ----------------------------
    // Idea:
    // Check every element one by one until the target element
    // is found or the entire array is traversed.

    // Working:
    // 1. Start from the first element
    // 2. Compare current element with target
    // 3. If equal, return its index
    // 4. Otherwise move to the next element
    // 5. If the entire array is searched, return -1

    // Key Points:
    // - Works on both sorted and unsorted arrays
    // - No preprocessing or sorting required
    // - Simple and useful for small datasets
    // - Can return the first occurrence of the target

    // Time Complexity:
    // - Best Case: O(1)     -> target is at the first position
    // - Average Case: O(n)
    // - Worst Case: O(n)    -> target is at the last position / not present
    //
    // Space Complexity:
    // - O(1)
    //
    // Important Pattern:
    // Traverse -> Compare -> Found? Return Index : Continue


    static int linearSearch(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                return i;
            }
        }

        // Target not found
        return -1;
    }


    static void printResult(int index, int target) {

        if (index != -1) {
            System.out.println("Element " + target + " found at index: " + index);
        }
        else {
            System.out.println("Element " + target + " not found");
        }
    }


    public static void main(String[] args) {

        int[] arr = {10, 25, 7, 32, 15, 40};

        int target = 32;

        int index = linearSearch(arr, target);

        printResult(index, target);
    }
}
