package Day2;

import java.util.Scanner;

public class Question6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir cümle giriniz: ");
        String sentence = scanner.nextLine();

        if (sentence.length() < 50) {
            System.out.println("Bu kısa bir cümle");
        } else {
            System.out.println("Cümlenin uzunluğu 50'den büyük veya eşit");
        }

        scanner.close();
    }

    /* 6. Kullanıcıdan bir cümle girmesini isteyen ve eğer cümlenin uzunluğu 50'den
     küçükse "Kısa bir cümle" mesajını yazdıran programı yazınız.

   Örnek Girdi:
   Bir cümle giriniz: Merhaba, nasılsınız?

   Örnek Çıktı:
   Kısa bir cümle

     */
}
