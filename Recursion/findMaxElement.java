
import java.util.Scanner;
public class findMaxElement {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int result = maxOfArray(arr, 0);
        System.out.println(result);
    }

    public static int maxOfArray(int[] arr, int idx) {

        if (idx == arr.length) {
            return idx;
        }

        int misa = maxOfArray(arr, idx + 1);

        if (arr[idx] < misa) {
            return misa;
        } else {
            return arr[idx];
        }

        // return 0;

    }
}

