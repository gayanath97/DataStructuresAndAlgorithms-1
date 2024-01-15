package sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = { 18, 6, 50, 8, 2, 90, 3, 4, 7 };
        insertionSort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void insertionSort(int[] nums) {
        // Iterate through the array
        for (int i = 1; i < nums.length; i++) {
            // Store the current element
            int current = nums[i];
            // Store the previous index
            int j = i - 1;
            // While the previous index is greater than or equal to 0 and the previous
            // element is greater than the current element
            while (j >= 0 && nums[j] > current) {
                // Move the previous element to the next index
                nums[j + 1] = nums[j];
                // Decrement the previous index
                j--;
            }
            // Insert the current element at the previous index
            nums[j + 1] = current;
        }
    }
}
