package Day4;

import java.util.Arrays;

public class Task19 {

    public static int[] remove(int[] array, int target) {
        int newSize = array.length - 1;

        int[] newArray = new int[newSize];

        int newIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != target) {
                newArray[newIndex++] = array[i];
            }
        }

        return newArray;
    }

    public static void main(String[] args) {
        int[] array = {1, 4, 3, 7, 9};

        int target = 3;

        int[] newArray = remove(array, target);
        System.out.println("İlk dizi: " + Arrays.toString(array));
        System.out.println("Değiştirilecek olan: " + target);
        System.out.println("Yeni Dizi: " + Arrays.toString(newArray));
    }

    /* 19) Bir dizide belirli bir elemanı silen ve yeni bir dizi döndüren bir metod yazın.
(ipucu: yeni dizinin boyutu bir azalmalı) */
}
