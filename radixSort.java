import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class radixSort {

    public static void radixSortImp(List<Integer> list) {
        if (list == null || list.size() <= 1) {
            return; // No need to sort an empty or single-element list
        }

        // Find the maximum number to determine the number of digits
        int max = list.get(0);
        for (Integer num : list) {
            if (num > max) {
                max = num;
            }
        }

        int exp = 1; // Initialize the place value
        int n = list.size();

        // Create temporary arrays for counting and the sorted output
        int[] count = new int[10]; // Assuming decimal digits (0-9)
        int[] output = new int[n];

        // Perform counting sort for every digit, starting from the least significant digit (LSD)
        while (max / exp > 0) {
            Arrays.fill(count, 0); // Reset the count array for each digit place

            // Count the occurrences of each digit at the current place value (exp)
            for (int i = 0; i < n; i++) {
                int digit = (list.get(i) / exp) % 10;
                count[digit]++;
            }

            // Calculate the cumulative count
            for (int i = 1; i < 10; i++) {
                count[i] += count[i - 1];
            }

            // Build the sorted output array by placing elements in their correct positions
            for (int i = n - 1; i >= 0; i--) {
                int digit = (list.get(i) / exp) % 10;
                output[count[digit] - 1] = list.get(i);
                count[digit]--;
            }

            // Copy the sorted elements back to the original list
            for (int i = 0; i < n; i++) {
                list.set(i, output[i]);
            }

            exp *= 10; // Move to the next digit place
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(170, 45, 75, 90, 802, 24, 2, 66));
        radixSortImp(list);

        System.out.println("Sorted list: " + list);
    }
}
