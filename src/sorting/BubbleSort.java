package sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = { 11, 60, 5, 8, 29, 9, 33, 47, 78 };
        System.out.println("Unsorted array:");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        bubbleSort(nums);

        System.out.println();
        System.out.println("Sorted array:");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void bubbleSort(int[] nums) {
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < nums.length - 1; i++) {
                // if the current element is greater than the next element, swap them
                if (nums[i] > nums[i + 1]) {
                    // swap
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                    swapped = true;
                }
                System.out.println();
                for (int num : nums) {

                    System.out.print(num + " ");
                }
            }
        }
    }
}
