# Radix Sort Application

## Problem Statement

This application demonstrates the Radix Sort algorithm for sorting a list of integers. Radix Sort is a non-comparative sorting algorithm that works by processing individual digits of the numbers in the list. It is useful for sorting integers, especially when the numbers have a fixed number of digits or have approximately the same number of digits.

## Setup Instructions

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Apache Maven (for building and running the application)

### OS Compatibility

This application is compatible with various operating systems, including Windows, macOS, and Linux.

### Installation Steps

1. **Java Development Kit (JDK):** Ensure that you have Java JDK 8 or a higher version installed on your system. You can download and install it from the official Oracle website (https://www.oracle.com/java/technologies/javase-downloads.html) or use an OpenJDK distribution.

2. **Apache Maven (Maven):** If you don't have Maven installed, you can download it from the official Apache Maven website (https://maven.apache.org/download.cgi) and follow the installation instructions for your platform.

3. **Clone the Repository:** Clone this repository to your local machine using Git:

   ```bash
   git clone https://github.com/Vamshida/radix-sort-application.git
   
### Build the Application: 
Navigate to the project directory:


### Build the application using Maven:
mvn clean package
This will compile the source code and create an executable JAR file.

### How to Use the Application

## Running the Application

After successfully building the application, you can run it using the following command:

java -jar target/radix-sort-application.jar

Sorting a List of Integers
The application includes a sample list of integers that will be sorted using the Radix Sort algorithm. You can modify the list as needed in the main method of the radixSort class.

To sort your own list of integers, simply replace the elements in the ArrayList with your desired values.
Run the application, and it will display the sorted list of integers in ascending order using the Radix Sort algorithm.
