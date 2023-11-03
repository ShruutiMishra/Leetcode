package Easy.Arrays;

public class Sort123 {
    public static void sort012(int[] arr) {
        // Write your code here
        int[] temp = new int[3];

        for (int i = 0; i < arr.length; i++) {

            temp[arr[i]]++;
        }
        int k = 0;

        for (int i = 0; i < 3; i++) {

            while (temp[i] > 0) {

                arr[k] = i;

                temp[i]--;

                k++;

            }

        }
    }

}
