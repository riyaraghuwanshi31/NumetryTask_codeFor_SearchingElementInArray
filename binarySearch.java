import java.util.*;

public class binarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking the size of the array as input
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        // Taking the elements of the array as input
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array (sorted order):");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }


        // Taking the element to be searched as input
        System.out.print("Enter the element to be searched: ");
        int target = scanner.nextInt();

        // Performing binary search
        int result = binaryS(arr, target);

        // Displaying the result
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }

        scanner.close();
    }

    // Method to perform binary search
    public static int binaryS(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if the target is present at mid
            if (arr[mid] == target) {
                return mid;
            }

            // If target is greater, ignore the left half
            if (arr[mid] < target) {
                left = mid + 1;
            }
            // If target is smaller, ignore the right half
            else {
                right = mid - 1;
            }
        }

        // If the target is not found
        return -1;
    }
}
