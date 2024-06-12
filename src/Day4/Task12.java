package Day4;

import java.util.Arrays;

public class Task12 {

    public static int[] copyArr(int[] original, int start, int end) {

        if (start < 0 || end > original.length || start > end) {
            throw new IllegalArgumentException("Geçersiz aralık.");
        }

        return Arrays.copyOfRange(original, start, end);
    }

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] copiedArray = copyArr(originalArray, 2, 7);

        System.out.println("İlk Dizi: ");
        for (int i : originalArray) {
            System.out.print(i + " ");
        }

        System.out.println("\nKopyalana: (2 - 7): ");
        for (int i : copiedArray) {
            System.out.print(i + " ");
        }
    }
    /* 12) Bir dizinin belirli bir aralıktaki elemanlarını kopyalayan ve yeni bir dizi oluşturan bir metod yazın.
 */
}
