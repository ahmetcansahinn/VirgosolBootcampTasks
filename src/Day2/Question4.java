package Day2;

import java.util.Scanner;

public class Question4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("İlk kenar uzunluğunu giriniz: ");
        int side1 = scanner.nextInt();

        System.out.print("İkinci kenar uzunluğunu giriniz: ");
        int side2 = scanner.nextInt();

        System.out.print("Üçüncü kenar uzunluğunu giriniz: ");
        int side3 = scanner.nextInt();

        if (side1 == side2 && side2 == side3) {
            System.out.println("Verilen değerlere ait üçgen eşkenar üçgendir");
        } else {
            System.out.println("Verilen değerlere ait üçgen eşkenar üçgen değildir");
        }

        scanner.close();
    }

    /* 4. Kullanıcıdan bir üçgenin kenar uzunluklarını girmesini isteyen ve bu üçgenin eşkenar olup olmadığını belirleyen programı yazınız.

   Örnek Girdi:
   Birinci kenar uzunluğunu giriniz: 5
   İkinci kenar uzunluğunu giriniz: 5
   Üçüncü kenar uzunluğunu giriniz: 5

   Örnek Çıktı:
   Bu üçgen eşkenar üçgendir */
}
