package Day2;

import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        int number1 = scanner.nextInt();

        System.out.print("İkinci sayıyı girin: ");
        int number2 = scanner.nextInt();

        int multiplication = number1 * number2;

        System.out.println("Girilen sayıların çarpımı: " + multiplication);

        scanner.close();
    }

    /* 3. Kullanıcıdan iki tam sayı girmesini isteyen ve bu sayıların çarpımını ekrana yazdıran programı yazınız.

   Örnek Girdi:
   İlk sayıyı giriniz: 4
   İkinci sayıyı giriniz: 5

   Örnek Çıktı:
   Sayıların çarpımı: 20 */

}
