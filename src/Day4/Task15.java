package Day4;

public class Task15  {

    public static int sumArr(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] array = {3, 2, 6, 1, 5};

        int sum = sumArr(array);
        System.out.println("Elemanlar toplamı: " + sum);
    }
    /* 15) Bir dizideki elemanları birbirine toplayan ve sonucu döndüren bir metod yazın.
*/
}
