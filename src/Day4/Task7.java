package Day4;

import java.util.Arrays;

public class Task7 {

    public static void main(String[] args) {

        int[] numbers = {3, 6, 8, 9, 2};

        sort(numbers);

        System.out.println("Dizinin sıralanmış hali: " + Arrays.toString(numbers));
    }

    public static void sort(int[] array) {
        Arrays.sort(array);
    }

    /* 7) Bir dizinin elemanlarını küçükten büyüğe sıralayan bir metod yazın.
*/
}
