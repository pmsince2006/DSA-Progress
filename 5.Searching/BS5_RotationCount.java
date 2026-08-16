import java.util.Scanner;

public class RotationCount {

    // Rotation Count in a Rotated Sorted Array
    // ------------------------------------------
    // Idea:
    // A sorted array rotated some number of times has a point
    // where the order breaks.
    //
    // The smallest element is at this point.
    // Its index represents the number of rotations.
    //
    // Example:
    // Original: 1 2 3 4 5
    // Rotated : 3 4 5 1 2
    //
    // Minimum element = 1
    // Index of minimum = 3
    // Therefore, rotation count = 3


    // Working:
    // 1. Check if the array is already sorted
    // 2. If arr[0] <= arr[n-1], there is no rotation
    // 3. Use Binary Search to find the minimum element
    // 4. Compare arr[mid] with arr[high]
    //
    // If arr[mid] > arr[high]:
    //     Minimum lies on the RIGHT
    //
    // Else:
    //     Minimum is at mid or on the LEFT
    //
    // 5. Continue until low == high
    // 6. low is the index of the minimum element


    // Key Points:
    // - Array must be a rotated version of a sorted array
    // - Minimum element gives the rotation count
    // - Binary Search reduces the search space by half
    // - low == high -> minimum element found
    //
    // Time Complexity: O(log n)
    // Space Complexity: O(1)
    //
    // Important Pattern:
    // Find Minimum in Rotated Sorted Array
    //
    // arr[mid] > arr[high]
    //     -> minimum is RIGHT
    //
    // arr[mid] <= arr[high]
    //     -> minimum is at MID or LEFT


    static int rotationCount(int[] arr, int n) {

        // Already sorted
        if (arr[0] <= arr[n - 1]) {
            return -1;
        }

        int low = 0;
        int high = n - 1;

        // Continue until only one element remains
        while (low < high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] > arr[high]) {

                // Minimum lies on the RIGHT
                low = mid + 1;
            }
            else {

                // Minimum is at mid or on the LEFT
                high = mid;
            }
        }

        // low == high
        // Index of minimum element = rotation count
        return low;
    }


    public static void main(String[] args) {

        int[] arr = {4, 5, 6, 7, 1, 2, 3};

        int rotations = rotationCount(arr, arr.length);

        if (rotations == -1) {
            System.out.println("Array is already sorted");
        }
        else {
            System.out.println("Rotation Count: " + rotations);
        }
    }
}
