import java.util.*;

public class FirstOccurrence {

    // First Occurrence of an Element
    // --------------------------------
    // Idea:
    // Find the FIRST position of a target element in a
    // sorted array that may contain duplicate elements.
    //
    // Normal Binary Search stops as soon as arr[mid] == target.
    // Here, when we find the target, we continue searching
    // towards the LEFT to check if an earlier occurrence exists.


    // Working:
    // 1. Set low = 0 and high = n - 1
    // 2. Find mid
    // 3. If arr[mid] == target:
    //      - Store mid as a possible answer
    //      - Move LEFT: high = mid - 1
    // 4. If arr[mid] < target:
    //      - Search RIGHT
    // 5. If arr[mid] > target:
    //      - Search LEFT
    // 6. Return the stored answer
    //
    // If target does not exist, answer remains -1.


    // Key Points:
    // - Array must be sorted
    // - Duplicates are allowed
    // - Do NOT stop when target is found
    // - Continue searching towards the left
    //
    // Time Complexity: O(log n)
    // Space Complexity: O(1)
    //
    // Important Pattern:
    // Target Found -> Store Answer -> Move LEFT
    //
    // Example:
    // arr = {1, 2, 2, 2, 4, 5}
    // target = 2
    //
    // Normal Binary Search may return index 2
    // First Occurrence must return index 1


    static int firstOccurrence(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;

        // Stores the best answer found so far
        int answer = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {

                // Possible first occurrence
                answer = mid;

                // Search further left
                high = mid - 1;
            }
            else if (arr[mid] < target) {

                // Target lies in the right half
                low = mid + 1;
            }
            else {

                // Target lies in the left half
                high = mid - 1;
            }
        }

        return answer;
    }


    static void printResult(int index, int target) {

        if (index != -1) {
            System.out.println(
                "First occurrence of " + target +
                " is at index: " + index
            );
        }
        else {
            System.out.println(
                target + " not found"
            );
        }
    }


    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 2, 4, 5, 7};

        int target = 2;

        int index = firstOccurrence(arr, target);

        printResult(index, target);
    }
}
