package Sorting;
import java.util.Scanner;

public class binarySearch {

    public static int[] take_input() {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static int binary_search(int[] arr, int key) {

        int size = arr.length;
        int start = 0;
        int end = size - 1;
        int mid;
        while (start <= end) {
            mid = (start + end) / 2;

            if (key == arr[mid])
                return mid;

            else if (key < arr[mid]) {
                end = mid - 1;
            }

            else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = take_input();

        System.out.println("Enter the element to search:");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int result = binary_search(arr, key);
        System.out.println("The element is in the index: " + result);
    }
}
