package Day5;

import java.util.ArrayList;
import java.util.Collections;

public class Task14 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(21);
        numbers.add(34);
        numbers.add(45);
        numbers.add(66);
        numbers.add(77);

        int min = findMin(numbers);
        int max = findMax(numbers);

        System.out.println("En küçük sayı: " + min);
        System.out.println("En büyük sayı: " + max);
    }

    public static int findMin(ArrayList<Integer> numbers) {
        return Collections.min(numbers);
    }

    public static int findMax(ArrayList<Integer> numbers) {
        return Collections.max(numbers);
    }
    /* 14. Bir ArrayList oluşturun ve içine birkaç sayı ekleyin.
    Bu sayılar arasından en küçük ve en büyük sayıları bulun ve sonucu ekrana yazdırın.
     */

}
