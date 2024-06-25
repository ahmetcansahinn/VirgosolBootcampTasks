package Day5;

import java.util.ArrayList;

public class Task12 {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("elma");
        words.add("çiçek");
        words.add("kavun");

        char target = 'a';
        ArrayList<Integer> counts = countCharInWords(words, target);

        System.out.println("Her kelimedeki '" + target + "' harfinin sayısı: " + counts);
    }

    public static ArrayList<Integer> countCharInWords(ArrayList<String> words, char targetChar) {
        ArrayList<Integer> counts = new ArrayList<>();

        for (String word : words) {
            int count = 0;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == targetChar) {
                    count++;
                }
            }
            counts.add(count);
        }

        return counts;
    }
    /* 12. Bir ArrayList oluşturun ve içine birkaç kelime ekleyin.
    Her kelimenin içindeki belirli bir harfin sayısını bulan bir metot yazın ve sonucu ekrana yazdırın.
     */

}
