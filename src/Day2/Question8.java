package Day2;

import java.util.Scanner;

public class Question8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tam sayı giriniz: ");
        int number = scanner.nextInt();

        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("Sayı hem 3 hem de 5 ile bölünebilir");
        } else if (number % 3 == 0) {
            System.out.println("Sayı 3 ile bölünebilir ancak 5 ile bölünemez");
        } else if (number % 5 == 0) {
            System.out.println("Sayı 5 ile bölünebilir ancak 3 ile bölünemez");
        } else {
            System.out.println("Sayı ne 3 ne de 5 ile bölünebilir");
        }

        scanner.close();
    }

    /* 8. Kullanıcıdan bir tam sayı girmesini isteyen ve bu sayının 3 ve 5 ile bölünebilir olup olmadığını belirten programı yazınız.

   Örnek Girdi:
   Bir tam sayı giriniz: 15


   Örnek Çıktı:
   Sayı hem 3 hem de 5 ile bölünebilir */
}
