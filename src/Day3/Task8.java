package Day3;

import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayıyı giriniz: ");
        int number = scanner.nextInt();

        int toplam = 0;

        while (number != 0) {
            toplam += number % 10;

            number /= 10;
        }

        System.out.println("Sayının basamaklar toplamı: " + toplam);

        scanner.close();
    }
    /* 8. Bir sayının basamaklarını toplayan ve while döngüsü kullanan bir Java programı yazın.
     */
}
