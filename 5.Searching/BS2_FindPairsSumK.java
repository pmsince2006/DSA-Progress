public class CountPairsUsingBinarySearch {

    // Count Pairs With Given Sum Using Binary Search
    // -----------------------------------------------
    // Idea:
    // For every element arr[i], find its complement:
    //
    //      target = k - arr[i]
    //
    // Then use Binary Search to find how many times the
    // complement occurs in the remaining part of the array.
    //
    // Since the array is sorted, we can efficiently find
    // the first and last occurrence of the complement.
    
    
    // Working:
    // 1. Pick an element arr[i]
    // 2. Calculate its required complement:
    //      target = k - arr[i]
    // 3. Binary Search for the FIRST occurrence of target
    // 4. Binary Search for the LAST occurrence of target
    // 5. Number of occurrences =
    //      last - first + 1
    // 6. Add this to the total count
    //
    // Important:
    // We search only from i + 1 onwards so that
    // each pair is counted only once.
    
    
    // Key Points:
    // - Array must be sorted
    // - Uses Binary Search to find first & last occurrence
    // - Handles duplicate elements
    // - Each pair is counted only once
    //
    // Time Complexity:
    // - For each element:
    //      2 Binary Searches -> O(log n)
    // - For n elements:
    //      O(n log n)
    //
    // Space Complexity:
    // - O(1)
    //
    // Important Pattern:
    // Find Complement -> First Occurrence -> Last Occurrence
    // -> Count Occurrences
    
    
    static int getPairsCount(int[] arr, int n, int k) {

        int count = 0;

        // Pick each element one by one
        for (int i = 0; i < n - 1; i++) {

            // Required element to make sum equal to k
            int target = k - arr[i];

            // Search only after i
            // This prevents counting the same pair twice
            int low = i + 1;
            int high = n - 1;


            // -----------------------------------------
            // Find First Occurrence of target
            // -----------------------------------------

            int first = -1;

            while (low <= high) {

                int mid = low + (high - low) / 2;

                if (arr[mid] == target) {

                    first = mid;

                    // Continue searching on the left
                    // for an earlier occurrence
                    high = mid - 1;
                }
                else if (arr[mid] < target) {

                    // Target lies on the right
                    low = mid + 1;
                }
                else {

                    // Target lies on the left
                    high = mid - 1;
                }
            }


            // Target does not exist
            if (first == -1) {
                continue;
            }


            // -----------------------------------------
            // Find Last Occurrence of target
            // -----------------------------------------

            low = first;
            high = n - 1;

            int last = first;

            while (low <= high) {

                int mid = low + (high - low) / 2;

                if (arr[mid] == target) {

                    last = mid;

                    // Continue searching on the right
                    // for a later occurrence
                    low = mid + 1;
                }
                else if (arr[mid] < target) {

                    // Target lies on the right
                    low = mid + 1;
                }
                else {

                    // Target lies on the left
                    high = mid - 1;
                }
            }


            // Number of occurrences of target
            // = last index - first index + 1
            count += last - first + 1;
        }

        return count;
    }


    public static void main(String[] args) {

        // Array must be sorted
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 5};

        int k = 5;

        int result = getPairsCount(arr, arr.length, k);

        System.out.println("Number of pairs: " + result);
    }
}
