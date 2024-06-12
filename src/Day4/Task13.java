package Day4;

import java.util.Arrays;

public class Task13 {

    public static int[] findNumbers(int[] original) {
        return Arrays.stream(original)
                .filter(num -> num % 2 == 0)
                .toArray();
    }

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] evenNumbersArray = findNumbers(originalArray);

        System.out.println("İlk dizi: " + Arrays.toString(originalArray));
        System.out.println("İkinci dizi: " + Arrays.toString(evenNumbersArray));
    }
    /* 13) Bir dizideki çift sayıları bulan ve bunları başka bir diziye ekleyen bir metod yazın.
 */
}
