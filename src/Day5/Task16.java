package Day5;

import java.util.ArrayList;
import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int evenCount = 0;
        int oddCount = 0;

        System.out.println("10 farklı tam sayı girin:");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ". sayı: ");
            int number = scanner.nextInt();
            numbers.add(number);

            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Çift sayı adet: " + evenCount);
        System.out.println("Tek sayı adet: " + oddCount);
    }
    /* 16. Bir ArrayList kullanarak kullanıcıdan alınan 10 farklı tam sayıyı saklayın.
    Bu tam sayılardan kaç tanesinin çift, kaç tanesinin tek olduğunu bulan ve sonucu ekrana yazdıran bir program yazın.
     */
}
