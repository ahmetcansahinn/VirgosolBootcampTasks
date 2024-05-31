package Day2;

import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Tam sayı giriniz: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Girdiğiniz sayı negatiftir");
        } else {
            System.out.println("Girdiğiniz sayı negatif değildir");
        }

        scanner.close();
    }

    /* 1. Kullanıcıdan bir tam sayı girmesini isteyen ve eğer sayı negatif ise "Sayı negatiftir" mesajını yazdıran programı yazınız.

   Örnek Girdi:
   Bir tam sayı giriniz: -5

   Örnek Çıktı:
   Sayı negatiftir */
}
