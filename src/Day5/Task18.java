package Day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task18 {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>(Arrays.asList("elma", "kivi", "çilek", "muz", "ananas"));

        ArrayList<Integer> lengths = new ArrayList<>();
        words.forEach(word -> lengths.add(word.length()));

        Collections.sort(lengths);
        System.out.println("Kelime Uzunlukları (Artan Sırayla): " + lengths);

        int shortestLength = lengths.get(0);
        int longestLength = lengths.get(lengths.size() - 1);

        ArrayList<String> shortestWords = new ArrayList<>();
        ArrayList<String> longestWords = new ArrayList<>();

        words.forEach(word -> {
            if (word.length() == shortestLength) {
                shortestWords.add(word);
            }
            if (word.length() == longestLength) {
                longestWords.add(word);
            }
        });

        System.out.println("En kısa kelime: " + shortestWords);
        System.out.println("En uzun kelime: " + longestWords);
    }
    /* 18. Bir ArrayList oluşturun ve içine birkaç kelime ekleyin.
    Her kelimenin uzunluğunu tutan bir ArrayList daha oluşturun ve bu uzunlukları sıralı olarak ekrana yazdırın. Son olarak, en uzun ve en kısa kelimeleri bularak ekrana yazdırın.
     */

}
