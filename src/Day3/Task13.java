package Day3;

public class Task13 {

    public static void main(String[] args) {
        int lowLimit = 1;
        int upperLimit = 1000;

        int total = 0;

        for (int i = lowLimit; i <= upperLimit; i++) {
            if (isPalindrom(i)) {
                total += i;
            }
        }
        System.out.println("Aralıktaki palindromik sayılar toplam: " + total);
    }

    public static boolean isPalindrom(int sayi) {
        String numberStr = String.valueOf(sayi);
        String reverseNumberStr = new StringBuilder(numberStr).reverse().toString();
        return numberStr.equals(reverseNumberStr);
    }

    /* 13. Bir aralık belirleyerek (örneğin 1 ile 1000 arası)
    bu aralıktaki palindromik sayıların toplamını hesaplayan bir Java programı yazın.
    Palindromik sayılar, aynı şekilde okunan sayılardır (örneğin 121, 131). */

}
