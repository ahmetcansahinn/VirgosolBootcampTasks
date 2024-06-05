package Day3;

import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;
        int number;

        do {
            System.out.print("Sayı giriniz-Çıkmak için 0'a basınız: ");
            number = scanner.nextInt();

            total += number;
        } while (number != 0);

        System.out.println("Sayıların toplamı: " + total);
        scanner.close();
    }

    /* 9. Kullanıcıdan alınan sayılarla toplama işlemi yapan ve kullanıcı 0 girene kadar devam eden do-while döngüsü kullanan bir Java programı yazın.
*/

}
