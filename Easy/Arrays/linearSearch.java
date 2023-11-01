import java.util.*;

class linearSearch {
    static int LinearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("enter " + arr.length + "elements in array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int num : arr) {
            System.out.print(num);
        }
        System.out.println("enter the element to be searched");
        int key = sc.nextInt();
        int result = LinearSearch(arr, key);
        System.out.println("element is found at index " + result);
    }
}