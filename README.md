# Radix Sort in Java

This Java program demonstrates the Radix Sort algorithm, which is a non-comparative sorting algorithm used to sort integers. Radix Sort is based on the idea of sorting integers by their individual digits. It sorts numbers by processing individual digits from the least significant digit (LSD) to the most significant digit (MSD) or vice versa.

## How Radix Sort Works

1. Find the maximum number to determine the number of digits.
2. Create temporary arrays for counting and the sorted output.
3. Perform counting sort for every digit, starting from the LSD.
4. Build the sorted output array by placing elements in their correct positions.
5. Repeat the above steps for each digit place (units, tens, hundreds, etc.).

## Usage

To run this Radix Sort program:

1. Make sure you have Java installed on your system.

2. Compile the Java program:

   ```sh
   javac radixSort.java
