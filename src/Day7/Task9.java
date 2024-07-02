package Day7;

import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Pozitif bir sayı giriniz: ");
        int number = scanner.nextInt();

        try {

            checkPositiveNumber(number);
            System.out.println("Girilen sayı : " + number);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void checkPositiveNumber(int number) throws Exception {
        if (number <= 0) {
            throw new Exception("Yanlış bir sayı girdiniz.");
        }
    }

    /* 9. *Task: throw new Exception() *
   - Kullanıcıdan pozitif tamsayı girmesini isteyin (Scanner)
   - Kullanıcı sıfır değerini girmişse "yanlış sayı girdiniz" exception mesajı fırlatan kodu yazınız.
     */
}
