package Day4;

public class Task9 {

    public static void main(String[] args) {

        int[] numbers = {2, 5, 3, 7, 2, 8, 2, 4, 2};

        int count = count(numbers, 2);

        System.out.println(" 2 değerinden " + count + " adet vardır.");
    }

    public static int count(int[] array, int target) {
        int count = 0;

        for (int element : array) {
            if (element == target) {
                count++;
            }
        }

        return count;
    }

    /* 9) Bir dizide belirli bir değere sahip kaç adet eleman olduğunu bulan bir metod yazın.
*/
}
