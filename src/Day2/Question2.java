package Day2;

import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kelime giriniz: ");
        String word = scanner.nextLine();

        int length = word.length();

        System.out.println("Girilen kelime uzunluğu: " + length);

        scanner.close();
    }

    /* 2. Kullanıcıdan bir kelime girmesini isteyen ve kelimenin uzunluğunu ekrana yazdıran programı yazınız.

   Örnek Girdi:
   Bir kelime giriniz: merhaba

   Örnek Çıktı:
   Kelimenin uzunluğu: 7 */
}
