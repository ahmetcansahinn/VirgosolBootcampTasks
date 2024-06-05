package Day3;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        int number = scanner.nextInt();

        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println(number + " sayısının faktöriyeli= " + factorial);

        scanner.close();
    }
    /* 2. Bir sayının faktöriyelini for döngüsü kullanarak
    hesaplayan bir Java programı yazın. Örneğin, 5'in faktöriyeli 120'dir.
     */

}
