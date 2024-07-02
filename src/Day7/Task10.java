package Day7;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Bölünen sayı girin: ");
            int numerator = scanner.nextInt();

            System.out.print("Bölen sayı girin: ");
            int denominator = scanner.nextInt();

            int result = numerator / denominator;
            System.out.println("Sonuç: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Hata: Bir sayıyı sıfıra bölemezsiniz. Başka bir değer giriniz");
        } finally {
            scanner.close();
        }
    }

    /* 10. *Task: Bölme İşlemi*
   - Kullanıcıdan alınan iki sayıyı birbirine bölen bir program yazın.
   - Bölme işlemi sırasında ortaya çıkabilecek ArithmeticException'ı try-catch bloğu içinde ele alarak uygun bir mesajla kullanıcıya hatayı bildirin.
     */
}
