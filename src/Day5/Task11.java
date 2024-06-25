package Day5;

import java.util.Arrays;

public class Task11 {

    public static void main(String[] args) {
        int[] array = {24, 32, 22, 9, 5};

        int[] sortedArray = sortArray(array);

        System.out.println("Sıralı Dizi: " + Arrays.toString(sortedArray));
    }

    public static int[] sortArray(int[] array) {
        int[] copyArray = Arrays.copyOf(array, array.length);

        Arrays.sort(copyArray);

        return copyArray;
    }
    /* 11. int tipinde bir dizi oluşturun ve bu diziyi sıralayan bir metot yazın.
    Bu metodu çağırarak sonucu ekrana yazdırın.
     */
}
