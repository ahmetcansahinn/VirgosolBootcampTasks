package Day4;

import java.util.Arrays;

public class Task14 {

    public static void main(String[] args) {
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(findOdd(numbers)));
    }

    public static int[] findOdd(int[] arr) {

        int count = 0;
        for (int num : arr) {
            if (num % 2 != 0) {
                count++;
            }
        }

        int[] oddNumbers = new int[count];
        int index = 0;
        for (int num : arr) {
            if (num % 2 != 0) {
                oddNumbers[index++] = num;
            }
        }

        return oddNumbers;
    }

    /* 14) Bir dizideki tek sayıları bulan ve bunları başka bir diziye ekleyen bir metod yazın.
 */
}
