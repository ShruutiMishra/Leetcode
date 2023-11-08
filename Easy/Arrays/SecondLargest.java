package Easy.Arrays;

public class SecondLargest {

    public static int[] getSecondOrderElements(int n, int[] a) {

        // Write your code here.

        int largest = Integer.MIN_VALUE;

        int sslargest = Integer.MIN_VALUE;

        int ssmallest = Integer.MAX_VALUE;

        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {

            if (a[i] > largest) {

                sslargest = largest;

                largest = a[i];

            } else if (a[i] > sslargest && a[i] != largest) {

                sslargest = a[i];

            }

        }

        for (int i = 0; i < n; i++)

        {

            if (a[i] < smallest)

            {

                ssmallest = smallest;

                smallest = a[i];

            }

            else if (a[i] < ssmallest && a[i] != smallest)

            {

                ssmallest = a[i];

            }

        }

        int[] result = new int[2];

        result[0] = sslargest;

        result[1] = ssmallest;

        return result;

    }

}
