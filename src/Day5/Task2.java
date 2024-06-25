package Day5;

import java.util.Random;

public class Task2 {

    public static void main(String[] args) {

        Random rand = new Random();

        int[] numbers = new int[100];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        double average = (double) sum / numbers.length;

        int count = 0;
        for (int number : numbers) {
            if (number > average) {
                count++;
            }
        }

        System.out.println("Ortalama: " + average);
        System.out.println("Ortalamadan büyük sayıların adedi: " + count);
    }

    /* 2. 100 adet rastgele sayının bulunduğu bir dizi oluşturun.
    Bu sayıların ortalamasını hesaplayın ve ortalamadan büyük olan sayıların kaç tane olduğunu bulun.
*/
}
