package SD_Programs;

import java.util.Scanner;

public class Recursive_Array_Manipulator {

		
		
		    static int[] arr;
		    static int size = 0;  // Tracks how many elements inserted
		    static Scanner scanner = new Scanner(System.in);

		    public static void main(String[] args) {
		        System.out.print("Enter the size of the array: ");
		        int capacity = scanner.nextInt();
		        arr = new int[capacity];

		        menu();
		    }

		    // Recursive menu method
		    public static void menu() {
		        System.out.println("\n=== Array Manipulator Menu ===");
		        System.out.println("1. Insert Element");
		        System.out.println("2. Display Array");
		        System.out.println("3. Find Maximum");
		        System.out.println("4. Find Minimum");
		        System.out.println("5. Exit");
		        System.out.print("Choose an option: ");
		        
		        int choice = scanner.nextInt();

		        switch (choice) {
		            case 1:
		                insertElement();
		                break;
		            case 2:
		                displayArray();
		                break;
		            case 3:
		                if (size == 0) {
		                    System.out.println("Array is empty.");
		                } else {
		                    System.out.println("Maximum element is: " + findMax(0, arr[0]));
		                }
		                break;
		            case 4:
		                if (size == 0) {
		                    System.out.println("Array is empty.");
		                } else {
		                    System.out.println("Minimum element is: " + findMin(0, arr[0]));
		                }
		                break;
		            case 5:
		                System.out.println("Exiting...");
		                return;
		            default:
		                System.out.println("Invalid choice! Try again.");
		        }
		        menu(); // Recursively call menu again after operation
		    }

		    // Insert element into array if space is available
		    public static void insertElement() {
		        if (size == arr.length) {
		            System.out.println("Array is full! Cannot insert more elements.");
		            return;
		        }
		        System.out.print("Enter element to insert: ");
		        int element = scanner.nextInt();
		        arr[size++] = element;
		        System.out.println("Element inserted.");
		    }

		    // Display array elements recursively
		    public static void displayArray() {
		        if (size == 0) {
		            System.out.println("Array is empty.");
		            return;
		        }
		        System.out.print("Array elements: ");
		        displayRec(0);
		        System.out.println();
		    }

		    public static void displayRec(int index) {
		        if (index == size) {
		            return;
		        }
		        System.out.print(arr[index] + " ");
		        displayRec(index + 1);
		    }

		    // Find max element recursively
		    public static int findMax(int index, int currentMax) {
		        if (index == size) {
		            return currentMax;
		        }
		        if (arr[index] > currentMax) {
		            currentMax = arr[index];
		        }
		        return findMax(index + 1, currentMax);
		    }

		    // Find min element recursively
		    public static int findMin(int index, int currentMin) {
		        if (index == size) {
		            return currentMin;
		        }
		        if (arr[index] < currentMin) {
		            currentMin = arr[index];
		        }
		        return findMin(index + 1, currentMin);
		    }
		}





