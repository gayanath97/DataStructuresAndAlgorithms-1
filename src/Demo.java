import java.util.List;

public class Demo {
    public static void main(String[] args) {
        int num[] = {1, 2, 3, 5, 7, 9, 11, 13};
        int target = 11;

        //Linear search
        int result1 = linearSearch(num, target);
        if (result1 != -1)
            System.out.println("LinearSearch-Element found of Index : " + result1);
        else
            System.out.println("LinearSearch-Element not found");
        System.out.println("------------------------------------------");
        //Binary Search
        int result2 = binarySearch(num, target);
        if (result2 != -1)
            System.out.println("BinarySearch-Element found of Index : " + result1);
        else
            System.out.println("BinarySearch-Element not found");

    }

    public static int linearSearch(int[] num, int target) {
        int steps = 0;
        for (int i = 0; i < num.length; i++) {
            steps++;
            if (num[i] == target) {
                System.out.println("steps taken by LinearSearch = " + steps);
                return i;
            }
        }

        System.out.println("steps taken by LinearSearch = " + steps);
        return -1;
    }

    public static int binarySearch(int[] num, int target) {
        int steps = 0;
        //5,7,9,11,13
        int left = 0;
        int right = num.length - 1;
        while (left <= right) {
            steps++;
            int mid = (left + right) / 2;
            if (num[mid] == target) {
                System.out.println("steps taken by BinarySearch = " + steps);
                return mid;
            } else if (num[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("steps taken by BinarySearch = " + steps);
        return -1;
    }

//end Demo class
}
