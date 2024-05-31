package Day2;

import java.util.Scanner;

public class Question11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Cümle giriniz: ");
        String sentence = scanner.nextLine();

        System.out.print("Kontrol edilecek olan kelime: ");
        String word = scanner.nextLine();

        if (sentence.startsWith(word)) {
            System.out.println("Cümle '" + word + "' ile başlıyor.");
        } else {
            System.out.println("Cümle '" + word + "' ile başlamıyor.");
        }

        scanner.close();
    }

    /* 11. Girilen bir cümlenin belirli bir kelime ile başlayıp başlamadığını kontrol eden bir program yazın.

	Örnek Girdi:
	Bir cümle giriniz: Java programlama dili
	Kontrol edilecek kelime: Java

	Örnek Çıktı:
	Cümle 'Java' ile başlıyor. */
}
