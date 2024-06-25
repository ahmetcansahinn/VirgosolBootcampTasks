package Day5;

import java.util.ArrayList;

public class Task3 {

    public static void main(String[] args) {

        ArrayList<Object> values = new ArrayList<>();

        values.add(22);
        values.add(2.12);
        values.add(false);

        for (Object value : values) {
            System.out.println(value);
        }
    }

    /* 3. int, double ve boolean tiplerinde 3 farklı değeri tutan bir ArrayList
    oluşturun ve bu değerleri ekrana yazdırın.
*/
}
