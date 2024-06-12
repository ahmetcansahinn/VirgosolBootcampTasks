package Day4;

import java.util.Arrays;

public class Task16 {

    public static int[] mergeArr(int[] array1, int[] array2) {
        int length1 = array1.length;
        int length2 = array2.length;

        int mergedLength = length1 + length2;

        int[] mergedArray = new int[mergedLength];

        for (int i = 0; i < length1; i++) {
            mergedArray[i] = array1[i];
        }

        for (int i = 0; i < length2; i++) {
            mergedArray[length1 + i] = array2[i];
        }

        return mergedArray;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6, 7};

        int[] mergedArray = mergeArr(array1, array2);

        System.out.println("Dizi 1: " + Arrays.toString(array1));
        System.out.println("Dizi 2: " + Arrays.toString(array2));
        System.out.println("Toplam : " + Arrays.toString(mergedArray));
    }

    /* 16) İki diziyi birleştiren ve yeni bir dizi oluşturan bir metod yazın.
(ipucu: method iki adet parametre (int[] dizi1, int[] dizi2) alıyor) */
}
