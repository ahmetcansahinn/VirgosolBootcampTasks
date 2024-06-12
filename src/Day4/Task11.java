package Day4;

public class Task11 {

    public static int[] copyArr(int[] original) {
        int[] copy = new int[original.length];

        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }

        return copy;
    }

    public static void main(String[] args) {
        int[] originalArr = {1, 2, 3, 4, 5};
        int[] copiedArr = copyArr(originalArr);

        System.out.println("İlk Dizi: ");
        for (int i : originalArr) {
            System.out.print(i + " ");
        }

        System.out.println("\nKopyalanan Dizi: ");
        for (int i : copiedArr) {
            System.out.print(i + " ");
        }
    }

    /* 11) Bir dizinin elemanlarını kopyalayan ve yeni bir dizi oluşturan bir metod yazın.
*/
}
