package Day4;

public class Task18 {

    public static boolean update(int[] array, int target, int newValue) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                array[i] = newValue;
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        int target = 3;
        int newValue = 10;

        boolean result = update(array, target, newValue);
        System.out.println("Güncellendi: " + result);
        System.out.println("Güncellenen: " + java.util.Arrays.toString(array));
    }

    /* 18) Bir dizinin belirli bir elemanını bulup güncelleyen bir metod yazın.
(ipucu: method ayrıca eleman dizide varsa ve güncelleme gerçekleşirse true, yoksa false dönsün)*/
}
