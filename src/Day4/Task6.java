package Day4;

public class Task6 {

    public static void main(String[] args) {

        int[] numbers = {3, 4, 6, 8, 9};

        double average = average(numbers);

        System.out.println("Ortalaması: " + average);
    }

    public static double average(int[] array) {

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        double average = (double) sum / array.length;

        return average;
    }

    /* 6) Bir diziyi parametre olarak alan ve dizideki elemanların ortalamasını bulan bir metod yazın.
*/
}
