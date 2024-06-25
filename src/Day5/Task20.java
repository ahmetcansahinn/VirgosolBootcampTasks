package Day5;

import java.util.ArrayList;

public class Task20 {
    public static void main(String[] args) {

        ArrayList<Double> numbers = new ArrayList<>();
        numbers.add(11.1);
        numbers.add(9.2);
        numbers.add(18.2);
        numbers.add(4.3);
        numbers.add(7.7);

        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;

        for (double num : numbers) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        System.out.println("En büyük değer: " + max);
        System.out.println("En küçük değer: " + min);

        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        double average = sum / numbers.size();
        System.out.println("Ortalama: " + average);

        System.out.println("Her elemanın ortalamadan büyük veya küçük olma durumu:");
        for (double num : numbers) {
            if (num > average) {
                System.out.println(num + " - Ortalamadan büyük");
            } else if (num < average) {
                System.out.println(num + " - Ortalamadan küçük");
            } else {
                System.out.println(num + " - Ortalama ile aynı");
            }
        }
    }

    /* 20. Bir ArrayList oluşturun ve içine birkaç Double değer ekleyin.
    Bu değerlerden en büyük ve en küçük olanını bulun. Ardından, listedeki tüm elemanların ortalamasını hesaplayın ve bu ortalamayı ekrana yazdırın. Son olarak, listedeki her elemanı ortalamadan büyük mü küçük mü diye kontrol edin ve sonuçları ayrı ayrı ekrana yazdırın.
     */

}
