package Day2;

import java.util.Scanner;

public class Question10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("İlk cümleyi giriniz: ");
        String sentence1 = scanner.nextLine();

        System.out.print("İkinci cümleyi giriniz: ");
        String sentence2 = scanner.nextLine();

        int length1 = sentence1.length();

        int length2 = sentence2.length();

        String uzunCumle = length1 > length2 ? sentence1 : sentence1;

        System.out.println("Uzun olan cümle: " + uzunCumle);

        scanner.close();
    }

    /* 10. Girilen iki cümleden uzun olanı bulan bir program yazın.

	Örnek Girdi:
	Birinci cümleyi giriniz: Merhaba Dünya
	İkinci cümleyi giriniz: Java programlama dili

	Örnek Çıktı:
	Uzun olan cümle: Java programlama dili

     */
}
