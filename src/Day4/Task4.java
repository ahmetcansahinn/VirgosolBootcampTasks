package Day4;

public class Task4 {

    public static void main(String[] args) {

        int[] numbers = {5, 1, 9, 3, 8};

        int min = findMin(numbers);

        System.out.println("En küçük elemanı: " + min);
    }

    public static int findMin(int[] array) {

        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }
    /* 4) Bir diziyi parametre olarak alan ve dizideki en küçük elemanı bulan bir metod yazın.
*/
}
