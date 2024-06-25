package Day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task17 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 3, 9, 2, 8, 7, 1, 4, 6, 10));

        System.out.println("Sıralı Liste Tersten:");
        Collections.reverse(numbers);
        System.out.println(numbers);

        ArrayList<Integer> squares = new ArrayList<>();
        numbers.forEach(number -> squares.add(number * number));

        System.out.println("Her sayının karesi:");
        System.out.println(squares);
    }
    /* 17. Bir ArrayList oluşturun ve içine 10 farklı tam sayı ekleyin.
     Bu sayıları küçükten büyüğe sıralayın, ardından sıralanmış listeyi tersten yazdırın. Son olarak, listedeki her sayının karesini hesaplayarak yeni bir ArrayList içinde saklayın ve bu listeyi ekrana yazdırın.
     */

}
