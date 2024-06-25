package Day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Task21 {

    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("İstanbul", "İzmir", "Ankara", "Antalya", "Çanakkale"));

        Iterator<String> iterator = cities.iterator();
        while (iterator.hasNext()) {
            String city = iterator.next();
            if (city.startsWith("İ")) {
                iterator.remove();
            }
        }

        System.out.println("İ harfi ile başlamayan iller:");
        for (String city : cities) {
            System.out.println(city);
        }
    }

    /* 21.ArrayList<String> cities = new ArrayList<>();
        cities.addAll(Arrays.asList("İstanbul", "İzmir", "Ankara", "Antalya", "Çanakkale"));
        olan bir cities listesinden "İ" harfi ile başlayan illeri çıkarmak (silmek) isteniyor.
Bu listenin dinamik olduğunu hangi ilin hangi indekste olduğu bilinmeyecek.
     */
}
