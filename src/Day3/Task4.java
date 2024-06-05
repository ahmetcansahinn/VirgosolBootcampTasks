package Day3;

public class Task4 {

    public static void main(String[] args) {
        int number = 29;
        boolean prime = true;

        if (number <= 1) {
            prime = false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    prime = false;
                    break;
                }
            }
        }

        if (prime) {
            System.out.println(number + " asaldır.");
        } else {
            System.out.println(prime + " asal değildir.");
        }
    }

    /* 4. Bir sayının asal olup olmadığını for döngüsü kullanarak kontrol
    eden bir Java programı yazın.
*/

}
