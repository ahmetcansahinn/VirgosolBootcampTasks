package Day4;

public class Task20 {

    public static char[] stringToChar(String str) {
        char[] charArray = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i);
        }
        return charArray;
    }

    public static void main(String[] args) {
        String text = "Hey!";

        char[] charArray = stringToChar(text);

        System.out.println("String: " + text);
        System.out.print("Dizi: ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
    }
    /*
20) String bir ifadenin tüm karakterlerini bir diziye karakter karakter aktaran bir method yazın.
Method parametre olarak String almalı, return olarak dizi dönmeli. */
}
