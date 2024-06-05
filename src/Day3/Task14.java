package Day3;

public class Task14 {

    public static void main(String[] args) {
        int lowLimit = 1;
        int upperLimit = 200;

        System.out.println("Aralıktaki Armstrong sayıları şunlardır: ");

        for (int i = lowLimit; i <= upperLimit; i++) {
            int numberDigit = (int) Math.log10(i) + 1;

            int gecici = i;
            int total = 0;

            while (gecici != 0) {
                int number = gecici % 10;
                total += Math.pow(number, numberDigit);
                gecici /= 10;
            }

            if (i == total) {
                System.out.println(i);
            }
        }
    }

    /* 14. Belirli bir aralıktaki tüm Armstrong sayıları bulan bir
    Java programı yazın. Bir sayının Armstrong sayısı olup olmadığını kontrol eden bir algoritma yazın.
    Armstrong sayısı, n basamaklı bir sayının, basamaklarının n’inci
    kuvvetleri toplamına eşit olduğu sayıdır (örneğin 153 = 1³ + 5³ + 3³).
 */

}
