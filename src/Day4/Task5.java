package Day4;

public class Task5 {

    public static void main(String[] args) {

        int[] numbers = {1, 3, 5, 7, 9};
        int sum = sum(numbers);

        System.out.println("Toplamı: " + sum);
    }

    public static int sum(int[] array) {

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum;
    }
    /* 5) Bir diziyi parametre olarak alan ve dizideki elemanların toplamını bulan bir metod yazın.
*/
}
