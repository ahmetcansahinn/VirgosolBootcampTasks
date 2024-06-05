package Day3;

public class Task15 {

    public static void main(String[] args) {
        String word = "neden";

        if (isPalindrom(word)) {
            System.out.println(word + " palindromdur.");
        } else {
            System.out.println(word + " palindrom değildir.");
        }
    }

    public static boolean isPalindrom(String word) {
        String reversWord = new StringBuilder(word).reverse().toString();
        return word.equals(reversWord);
    }

    /* 15. Verilen bir string kelimenin  palindromik olup olmadığını bulan bir Java programı yazın.
    Palindromik ileri ve geri okunduğunda aynı olan kelimedir. (Örnek:  kayak)
 */

}
