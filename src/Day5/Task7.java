package Day5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task7 {

    public static void main(String[] args) {

        Integer[] numbers = {21, 24, 29, 33, 44};

        reverseArray(numbers);

        System.out.print("Tersine çevrilmiş dizi: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    public static void reverseArray(Integer[] array) {
        List<Integer> list = Arrays.asList(array);
        Collections.reverse(list);
    }
    /* 7. int tipinde bir dizi oluşturun ve bu diziyi tersine çeviren bir metot yazın.
    Bu metodu çağırarak sonucu ekrana yazdırın.
     */

}
