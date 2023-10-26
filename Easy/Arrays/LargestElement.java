package Easy.Arrays;

/*
 * To find the largest element in an array
 */
import java.util.*;

public class LargestElement {
    static int largestElement(int[] arr, int n) {
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int n = arr.length;
        System.out.println("enter the " + arr.length + " elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int z = largestElement(arr, n);
        System.out.println("largest element is " + z);
        sc.close();
    }
}