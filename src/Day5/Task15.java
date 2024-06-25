package Day5;

import java.util.ArrayList;
import java.util.Collections;

public class Task15 {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("çiçek");
        words.add("elma");
        words.add("kiraz");

        words.add(0, "çilek");
        words.add("portakal");

        Collections.sort(words);

        System.out.println("Sıralı Kelimeler: " + words);
    }
    /* 15. Bir ArrayList oluşturun ve içine birkaç kelime ekleyin.
    Listenin başına ve sonuna yeni kelimeler ekleyin, ardından listeyi sıralayın ve sonucu ekrana yazdırın.
     */
}
