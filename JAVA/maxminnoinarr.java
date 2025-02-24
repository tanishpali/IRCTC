import java.util.*;
public class maxminnoinarr{
5


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        
        if (size <= 0) {
            System.out.println("Array size must be greater than 0.");
            return;
        }

        // Input the array elements
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Initialize max and min variables
        int max = arr[0]; // Assume the first element is the maximum
        int min = arr[0]; // Assume the first element is the minimum

        // Traverse the array
        for (int i = 1; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Update max if the current element is greater
            }
            if (arr[i] < min) {
                min = arr[i]; // Update min if the current element is smaller
            }
        }

        // Output the results
        System.out.println("Maximum number in the array: " + max);
        System.out.println("Minimum number in the array: " + min);
    }
}

