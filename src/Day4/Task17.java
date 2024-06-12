package Day4;

public class Task17 {

    public static boolean contains(int[] array, int target) {
        for (int num : array) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 3, 1, 9};

        int target = 3;

        boolean result = contains(array, target);
        System.out.println("Elemanı içeriyor mu ?: " + target + "? " + result);
    }

    /* 17) Bir dizide belirli bir elemanın bulunup bulunmadığını kontrol eden bir metod yazın.
(ipucu method true veya false olarak değer dönmeli) */
}
