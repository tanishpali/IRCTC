import java.util.Scanner;

public class secondLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        
        if (size < 2) {
            System.out.println("Array not suitable");
            return; // Exit the program
        }

        // Input array elements
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Initialize largest and secondLargest
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Traverse the array to find largest and secondLargest
        for (int i = 0; i < size; i++) {
            if (arr[i] > largest) {
                secondLargest = largest; // Update second largest
                largest = arr[i];        // Update largest
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i]; // Update second largest
            }
        }

        // Check if secondLargest was updated
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("All elements are the same. No second largest element.");
        } else {
            System.out.println("The second largest element is: " + secondLargest);
        }
    }
}
