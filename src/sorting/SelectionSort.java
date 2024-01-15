package sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 50, 43, 38, 27, 11,40 };
        System.out.println("Before sorting:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("\nAfter sorting:");
        selectionSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; ++i) {
            int minIndex = i;
            for (int j = i + 1; j < n; ++j) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
