package Day3;

public class Task11 {

    public static void main(String[] args) {
        String message = "Selam herkese";

        System.out.print("Tekrar içeren karakterler: ");

        for (int i = 0; i < message.length(); i++) {
            char character = message.charAt(i);

            if (message.indexOf(character, i + 1) != -1) {
                System.out.print(character + " ");
            }
        }
    }

    /* 11. For döngüsü kullanarak bir String ifadede tekrar eden
    karakterleri bulan bir Java programı yazın.
     */

}
