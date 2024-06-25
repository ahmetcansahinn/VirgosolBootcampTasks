package Day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task19 {

    public static void main(String[] args) {
        Integer[] randomNumbersArray = {14, 28, 36, 42, 56, 71, 84, 92, 10, 25, 60, 48, 37, 68, 13, 9, 77, 53, 65, 89};
        ArrayList<Integer> numbers = new ArrayList<>();
        for (Integer num : randomNumbersArray) {
            numbers.add(num);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int userInput = scanner.nextInt();

        for (Integer num : randomNumbersArray) {
            if (num + userInput == 100) {
                System.out.println("Girdiğiniz sayı ile " + num + " toplamı 100 eder.");
                return;
            }
        }
        System.out.println("Girdiğiniz sayı ile toplamı 100 eden bir sayı bulunamadı.");
    }
    /* 19. Bir ArrayList oluşturun ve içine 20 rastgele tam sayı ekleyin.
    Kullanıcıdan bir sayı alın ve bu sayının listedeki elemanlarla toplamının 100 olduğu tüm çiftleri bulun ve ekrana yazdırın.
     */

}
