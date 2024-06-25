package Day5;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        int[] numbers = {22, 33, 44, 55, 66};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int inputNumber = scanner.nextInt();

        boolean isFound = false;

        for (int number : numbers) {
            if (number == inputNumber) {
                isFound = true;
                break;
            }
        }

        if (isFound) {
            System.out.println("Sayı dizide mevcut.");
        } else {
            System.out.println("Sayı dizide mevcut değil.");
        }
    }
    /* 4. int tipinde bir dizi oluşturun ve kullanıcıdan bir sayı alın.
    Bu sayının dizide olup olmadığını kontrol edin ve sonucu ekrana yazdırın.
     */

}
