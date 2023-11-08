package Easy.Arrays;

public class LeftRotate1 {
    static void rotate(int[] arr) {
        int[] temp = new int[arr.length];
        for (int i = 1; i < arr.length; i++) {
            temp[i - 1] = arr[i];
        }
        /*
         * optimal soln here is to store the first element
         * in temp and shift the val at i to i-1 and
         * the store the tem val at n-1 place
         */
        temp[(arr.length) - 1] = arr[0];
        for (int i = 0; i < arr.length; i++) {
            System.out.print(temp[i] + " ");
        }
        /*
         * int temp = arr[0];
         * for loop
         * arr[i] = arr[i+1];
         * then
         * arr[n-1]=temp;
         * print arr[i] using for loop
         */
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        rotate(arr);
    }
}
