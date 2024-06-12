package Day4;

public class Task8 {

    public static void main(String[] args) {

        int[] numbers = {3, 4, 8, 2, 4};

        descendingSort(numbers);

        System.out.print("Sıralı hali: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    public static void descendingSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    /* 8) Bir dizinin elemanlarını büyükten küçüğe sıralayan bir metod yazın.*/

}
