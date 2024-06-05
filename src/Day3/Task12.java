package Day3;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        int number = scanner.nextInt();
        scanner.close();

        System.out.print("Asal çarpanları: ");

        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                System.out.print(i + " ");
                number /= i;
            }
        }
    }

    /* 12. Bir sayının asal çarpanlarını bulan bir Java programı yazın.
Kullanıcının girdiği bir sayının asal çarpanlarını ve bu çarpanların sayısını ekrana yazdırın. */
}
