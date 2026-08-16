import java.util.Scanner;

public class CountOccurrences {

    // Count Occurrences of an Element
    // ---------------------------------
    // Idea:
    // In a sorted array with duplicates, find the first and
    // last occurrence of the target.
    //
    // Number of occurrences:
    //
    //      last - first + 1
    //
    // Instead of checking every element, use Binary Search
    // to find both boundaries in O(log n).


    // Working:
    // 1. Find the FIRST occurrence of the target
    // 2. Find the LAST occurrence of the target
    // 3. If first == -1, target does not exist -> return 0
    // 4. Otherwise:
    //      count = last - first + 1


    // Key Points:
    // - Array must be sorted
    // - Duplicates are allowed
    // - Uses two Binary Searches
    // - First occurrence -> move LEFT after finding target
    // - Last occurrence -> move RIGHT after finding target
    //
    // Time Complexity:
    // - First occurrence: O(log n)
    // - Last occurrence: O(log n)
    // - Overall: O(log n)
    //
    // Space Complexity: O(1)
    //
    // Important Pattern:
    // First Occurrence + Last Occurrence
    //              ↓
    //       last - first + 1


    // ------------------------------------------------
    // Find First Occurrence
    // ------------------------------------------------

    static int firstOccurrence(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;

        int answer = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {

                // Store current position
                answer = mid;

                // Continue searching towards LEFT
                high = mid - 1;
            }
            else if (arr[mid] < target) {

                // Target lies in the RIGHT half
                low = mid + 1;
            }
            else {

                // Target lies in the LEFT half
                high = mid - 1;
            }
        }

        return answer;
    }


    // ------------------------------------------------
    // Find Last Occurrence
    // ------------------------------------------------

    static int lastOccurrence(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;

        int answer = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {

                // Store current position
                answer = mid;

                // Continue searching towards RIGHT
                low = mid + 1;
            }
            else if (arr[mid] < target) {

                // Target lies in the RIGHT half
                low = mid + 1;
            }
            else {

                // Target lies in the LEFT half
                high = mid - 1;
            }
        }

        return answer;
    }


    // ------------------------------------------------
    // Count Occurrences
    // ------------------------------------------------

    static int countOccurrences(int[] arr, int target) {

        int first = firstOccurrence(arr, target);

        // Target does not exist
        if (first == -1) {
            return 0;
        }

        int last = lastOccurrence(arr, target);

        // Number of occurrences
        return last - first + 1;
    }


    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 2, 2, 4, 5, 7};

        int target = 2;

        int count = countOccurrences(arr, target);

        System.out.println(
            "Number of occurrences of " + target + ": " + count
        );
    }
}
