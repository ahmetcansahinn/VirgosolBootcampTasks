package Day2;

import java.util.Scanner;

public class Question17 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Tam sayı giriniz: ");
        int number = scanner.nextInt();

        int squared = number * number;

        int cube = number * number * number;

        System.out.println("Sayının karesi: " + squared);
        System.out.println("Sayının küpü: " + cube);

        scanner.close();
    }
    /* 17. Bir tam sayının karesini ve küpünü hesaplayan bir Java programı yazınız. Program, girdiyi almalı ve çıktı olarak karesini ve küpünü göstermelidir.

   Örnek Girdi:
   Bir tam sayı giriniz: 3

   Örnek Çıktı:
   Karesi: 9
   Küpü: 27 */
}
