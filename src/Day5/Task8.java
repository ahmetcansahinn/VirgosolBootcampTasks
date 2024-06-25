package Day5;

import java.util.ArrayList;
import java.util.Arrays;

public class Task8 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(22);
        numbers.add(44);
        numbers.add(55);
        numbers.add(66);
        numbers.add(77);

        System.out.println("ArrayList içinde bulunan sayılar:");
        for (Integer number : numbers) {
            System.out.println(number);
        }

        int total = 0;
        for (Integer number : numbers) {
            total += number;
        }

        System.out.println("Sayıların toplamı: " + total);
    }
    /* 8. Bir ArrayList oluşturun ve içine Integer wrapper sınıfı kullanarak birkaç sayı ekleyin.
    Bu sayıları ekrana yazdırın ve ardından toplamını hesaplayarak ekrana yazdırın.
     */

}
