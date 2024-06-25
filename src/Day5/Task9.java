package Day5;

import java.util.ArrayList;
import java.util.List;

public class Task9 {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(33);
        numbers.add(44);
        numbers.add(55);
        numbers.add(77);
        numbers.add(66);

        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        double average = (double) sum / numbers.size();

        List<Integer> greaterThanAverage = new ArrayList<>();
        List<Integer> lessThanAverage = new ArrayList<>();
        for (Integer number : numbers) {
            if (number > average) {
                greaterThanAverage.add(number);
            } else if (number < average) {
                lessThanAverage.add(number);
            }
        }

        System.out.println("Ortalamadan büyük olanlar:");
        for (Integer number : greaterThanAverage) {
            System.out.println(number);
        }

        System.out.println("Ortalamadan küçük olanlar");
        for (Integer number : lessThanAverage) {
            System.out.println(number);
        }
    }
    /* 9. Bir ArrayList oluşturun ve içine birkaç Integer değer ekleyin.
    Bu değerlerin ortalamasını hesaplayın. Ardından, listedeki her elemanın ortalamadan büyük mü küçük mü olduğunu kontrol edin ve ortalamanın üstündeki ve altındaki değerleri ayrı ayrı ekrana yazdırın.
     */

}
