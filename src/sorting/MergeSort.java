package sorting;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums = { 1, 6, 55, 8, 2, 99, 37, 4, 7 };
        mergeSort(nums, 0, nums.length - 1);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void mergeSort(int[] nums, int low, int high) {
        if (low < high) {
            // Find the middle point
            int mid = (low + high) / 2;
            // Sort the left subarray
            mergeSort(nums, low, mid);
            // Sort the right subarray
            mergeSort(nums, mid + 1, high);
            // Merge the sorted subarrays
            merge(nums, low, mid, high);
        }
    }

    public static void merge(int[] nums, int low, int mid, int high) {
        // Find the sizes of the two subarrays to be merged
        int n1 = mid - low + 1;
        int n2 = high - mid;

        // Create two temporary arrays
        int[] left = new int[n1];
        int[] right = new int[n2];

        // Copy the elements of the first subarray into the left array
        for (int i = 0; i < n1; i++) {
            left[i] = nums[low + i];
        }

        // Copy the elements of the second subarray into the right array
        for (int j = 0; j < n2; j++) {
            right[j] = nums[mid + 1 + j];
        }

        // Merge the two arrays
        // Initial indexes of the first and second subarrays
        int i = 0, j = 0;
        // Initial index of the merged subarray
        int k = low;

        // While there are still elements in both subarrays
        while (i < n1 && j < n2) {
            // If the current element in the left subarray is less than or equal to the
            // current element in the right subarray
            if (left[i] <= right[j]) {
                // Copy the current element in the left subarray into the merged subarray
                nums[k] = left[i];
                i++; // Increment the index of the left subarray
            } else {
                // Copy the current element in the right subarray into the merged subarray
                nums[k] = right[j];
                j++; // Increment the index of the right subarray
            }
            k++; // Increment the index of the merged subarray
        }

        // Copy any remaining elements of the left subarray
        while (i < n1) {
            nums[k] = left[i];
            i++;
            k++;
        }

        // Copy any remaining elements of the right subarray
        while (j < n2) {
            nums[k] = right[j];
            j++;
            k++;
        }
    }

}