package Day4;

public class Task10 {

    public static void main(String[] args) {

        int[] numbers = {4,3, 1, 6, 4, 8, 2, 4, 2};

        int index = findIndex(numbers, 7);

        if (index != -1) {
            System.out.println(" 7 rakamı " + index + ". sırada bulunmaktadır.");
        } else {
            System.out.println("Dizide 7 değeri bulunamadı.");
        }
    }

    public static int findIndex(int[] array, int target) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {

                return i;
            }
        }

        return -1;
    }
    /* 10) Bir dizide belirli bir değeri arayan ve bulunduğu indeksi döndüren bir metod yazın.
*/
}
