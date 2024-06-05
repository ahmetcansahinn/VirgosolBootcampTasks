package Day3;

public class Task10 {

    public static void main(String[] args) {
        int number = 12345;

        int total = 0;

        for (int i = number; i > 0; i /= 10) {
            total += i % 10;
        }
        System.out.println("Sayı basamakları toplamı= " + total);
    }

    /* 10. For döngüsü kullanarak bir sayının basamaklarını toplayan bir Java programı yazın.
*/
}
