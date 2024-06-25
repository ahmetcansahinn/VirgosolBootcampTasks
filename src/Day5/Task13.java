package Day5;

import java.util.ArrayList;

public class Task13 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(123);
        numbers.add(333);
        numbers.add(444);
        numbers.add(555);

        ArrayList<Integer> sums = calculateDigitSums(numbers);

        System.out.println("Rakamların toplamı: " + sums);
    }

    public static ArrayList<Integer> calculateDigitSums(ArrayList<Integer> numbers) {
        ArrayList<Integer> sums = new ArrayList<>();

        for (Integer number : numbers) {
            int sum = 0;
            int n = number;
            while (n != 0) {
                sum += n % 10;
                n /= 10;
            }
            sums.add(sum);
        }

        return sums;
    }
    /* 13. Bir ArrayList oluşturun ve içine birkaç Integer değer ekleyin.
    Bu Integer değerlerin her birinin rakamlarının toplamını hesaplayın ve bu toplamları ekrana yazdırın. Örneğin, listede 123 varsa, rakamların toplamı 6 olmalıdır (1 + 2 + 3).
     */

}
