package Day3;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesajı giriniz: ");
        String message = scanner.nextLine();

        int sayac = 0;

        do {
            System.out.println(message);
            sayac++;
        } while (sayac < 5);

        scanner.close();
    }

    /* 5. Bir mesajı do-while döngüsü kullanarak ekrana 5 kez yazdıran bir Java programı yazın.
 */
}
