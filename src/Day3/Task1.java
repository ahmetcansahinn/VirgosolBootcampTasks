package Day3;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir mesaj giriniz: ");
        String message = scanner.nextLine();

        for (int i = 1; i <= 10; i++) {
            System.out.println(i  + message);
        }

        scanner.close();
    }

    /* 1. Bir mesajı 10 kez ekrana yazdıran bir Java programı yazın.*/
}
