import java.util.*;

public class linearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking the size of the array as input
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        // Taking the elements of the array as input
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Taking the element to be searched as input
        System.out.print("Enter the element to be searched: ");
        int target = scanner.nextInt();

        // Performing linear search
        int result = linearS(arr, target);

        // Displaying the result
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }

        scanner.close();
    }

    // Method to perform linear search
    public static int linearS(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index of the found element
            }
        }
        return -1; // Return -1 if the element is not found
    }
}
