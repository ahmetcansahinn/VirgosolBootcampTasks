package Day2;

import java.util.Scanner;

public class Question13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir metin giriniz: ");
        String text = scanner.nextLine();

        System.out.print("Aranacak olan karakter: ");
        char character = scanner.next().charAt(0);

        int position = text.indexOf(character);

        if (position != -1) {
            System.out.println("Karakter '" + character + "' " + (position + 1) + ". pozisyonda bulunuyor.");
        } else {
            System.out.println("Karakter '" + character + "' metin içinde bulunamadı.");
        }

        scanner.close();
    }

    /* 13. Kullanıcıdan bir metin ve bir karakter girmesini isteyen ve
    metindeki karakterin pozisyonunu bulan bir program yazınız.

	Örnek Girdi:
	Bir metin giriniz: Merhaba Dünya
	Aranacak karakter: a

	Örnek Çıktı:
	Karakter 'a' 4. pozisyonda bulunuyor.

     */
}
