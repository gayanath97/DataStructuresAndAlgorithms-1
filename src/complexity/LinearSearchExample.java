package complexity;

public class LinearSearchExample {

    public static int linearSearch(int[] array, int target) {
        // Iterate through the array
        for (int i = 0; i < array.length; i++) {
            // If the current element is equal to the target, return the index
            if (array[i] == target) {
                return i;
            }
        }
        // If the target is not found, return -1
        return -1;
    }

    public static void main(String[] args) {
        // Example array
        int[] numbers = { 4, 2, 7, 1, 9, 5, 8 };

        // Element to search for
        int target = 5;

        // Perform linear search
        int result = linearSearch(numbers, target);

        // Display the result
        if (result != -1) {
            System.out.println("Element " + target + " found at index " + result);
        } else {
            System.out.println("Element " + target + " not found in the array");
        }
    }
}

