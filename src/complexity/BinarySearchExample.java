package complexity;

public class BinarySearchExample {

    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if the target is present at the middle
            if (array[mid] == target) {
                return mid;
            }

            // If the target is greater, ignore the left half
            if (array[mid] < target) {
                left = mid + 1;
            }
            // If the target is smaller, ignore the right half
            else {
                right = mid - 1;
            }
        }

        // If the target is not present in the array
        return -1;
    }

    public static void main(String[] args) {
        // Example sorted array
        int[] numbers = { 1, 2, 4, 5, 7, 8, 9 };

        // Element to search for
        int target = 5;

        // Perform binary search
        int result = binarySearch(numbers, target);

        // Display the result
        if (result != -1) {
            System.out.println("Element " + target + " found at index " + result);
        } else {
            System.out.println("Element " + target + " not found in the array");
        }
    }
}

