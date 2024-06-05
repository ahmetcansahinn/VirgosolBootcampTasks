package Day3;

public class Task16 {

    public static void main(String[] args) {
        String str = "selam merhaba herkese";

        System.out.println("Benzersiz karakterler:");
        findUniqueCharacters(str);
    }

    public static void findUniqueCharacters(String str) {
        boolean[] unique = new boolean[256];

        for (char c : str.toCharArray()) {
            if (!unique[c]) {
                unique[c] = true;
                System.out.println(c);
            }
        }
    }

    /* 16. Verilen bir string içerisindeki benzersiz karakterleri bulan
    ve bunları ekrana yazdıran bir Java programı yazın. Benzersiz karakterler, string içerisinde sadece bir kez geçen karakterlerdir.
 */
}
