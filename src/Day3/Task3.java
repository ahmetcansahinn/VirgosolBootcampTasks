package Day3;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int number = scanner.nextInt();

        int a = 0, b = 1;

        System.out.print("Fibonacci: " + a);

        while (b <= number) {
            System.out.print(", " + b);
            int next = a + b;
            a = b;
            b = next;
        }

        scanner.close();
    }

    /* 3. Kullanıcıdan alınan bir sayıya kadar Fibonacci serisini
    while döngüsü kullanarak yazdıran bir Java programı yazın.
     */

}
