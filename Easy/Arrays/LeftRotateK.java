package Easy.Arrays;

public class LeftRotateK {
    static void rotateLeft(int[] arr, int n, int k) {
        k = k % n;
        if (n == 0) {
            return;
        }
        if (k > n) {
            return;
        }
        // storing the k elements in temp array
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }
        // shifting the rest of elments in begning
        for (int i = 0; i < n - k; i++) {
            arr[i] = arr[i + k];
        }
        // copying back the temp elements at end of original array
        for (int i = n - k; i < n; i++) {
            arr[i] = temp[i - n + k];
        }
    }

    public static void main(String[] args) {
        int n = 7;
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        rotateLeft(arr, n, k);
        System.out.println("after rotating the elements to left");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
