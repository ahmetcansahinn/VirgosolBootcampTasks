package Day4;

public class Task3 {

    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 9};

        int max = findMax(numbers);

        System.out.println("En büyük elemanı: " + max);
    }

    public static int findMax(int[] array) {

        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }
    /* 3) Bir diziyi parametre olarak alan ve dizideki en büyük elemanı bulan bir metod yazın.
*/
}
