package Day5;

public class Task5 {

    public static void main(String[] args) {

        int[] numbers = {12, 14, 32, 45, 55};

        int maxNum = findMax(numbers);

        System.out.println("En büyük sayı: " + maxNum);
    }

    public static int findMax(int[] numbers) {
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        return max;
    }
    /* 5. int tipinde bir dizi oluşturun ve bu dizideki en büyük sayıyı bulan bir metot yazın.
    Bu metodu çağırarak sonucu ekrana yazdırın.
     */

}
