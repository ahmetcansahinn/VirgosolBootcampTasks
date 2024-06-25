package Day5;

import java.util.ArrayList;

public class Task6 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(13);
        numbers.add(22);
        numbers.add(35);
        numbers.add(60);
        numbers.add(80);

        int index = 2;
        int newNumber = 99;
        numbers.set(index, newNumber);

        System.out.println("Yeni ArrayList: " + numbers);
    }
    /* 6. Bir ArrayList oluşturun ve içine birkaç sayı ekleyin.
    Belirli bir indekste bulunan sayıyı başka bir sayıyla değiştirin ve sonucu ekrana yazdırın.
     */

}
