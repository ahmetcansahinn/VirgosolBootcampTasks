package Day2;

public class Question9 {

    public static void main(String[] args) {

        String metin = "abc";

        for (int i = 0; i < metin.length(); i++) {
            char character = metin.charAt(i);
            int asciValue = (int) character;
            System.out.println("Karakter: " + character + ", ASCII Değeri: " + asciValue);
        }
    }

    /* 9.  'abc' metinindeki ASCII değerlerini ekrana yazdıran programı yazınız.

    Örnek Çıktı:
	Karakter: a, ASCII Değeri: 97
	Karakter: b, ASCII Değeri: 98
	Karakter: c, ASCII Değeri: 99 */
}
