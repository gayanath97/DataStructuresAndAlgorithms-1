package sorting;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums = { 1, 6, 5, 8, 2, 9, 3, 4, 7 };
        quickSort(nums, 0, nums.length - 1);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void quickSort(int[] nums, int low, int high) {
        if (low < high) {
            // Partition the array
            int pivot = partition(nums, low, high);
            // Sort the left subarray
            quickSort(nums, low, pivot - 1);
            // Sort the right subarray
            quickSort(nums, pivot + 1, high);
        }
    }

    public static int partition(int[] nums, int low, int high) {
        // Choose the rightmost element as the pivot
        int pivot = nums[high];
        // Index indicating the first element that's greater than the pivot
        int i = low - 1;
        // Traverse through the array
        for (int j = low; j < high; j++) {
            // If the current element is smaller than or equal to the pivot
            if (nums[j] <= pivot) {
                // Increment the index of smaller elements
                i++;
                // Swap the current element with the element at the index
                // of smaller elements
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        // Swap the pivot with the element at the index of smaller elements
        int temp = nums[i + 1];
        nums[i + 1] = nums[high];
        nums[high] = temp;
        // Return the partition point
        return i + 1;
    }
}
