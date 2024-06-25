package Day5;

public class Task10 {

    public static void main(String[] args) {

        int result1 = addIntegers(5, 10);
        double result2 = addDoubles(3.5, 2.7);
        int result3 = addIntegers(8, 12);
        double result4 = addDoubles(6.8, 9.2);

        System.out.println("5 + 10 = " + result1);
        System.out.println("3.5 + 2.7 = " + result2);
        System.out.println("8 + 12 = " + result3);
        System.out.println("6.8 + 9.2 = " + result4);
    }

    public static int addIntegers(int a, int b) {
        return a + b;
    }

    public static double addDoubles(double a, double b) {
        return a + b;
    }
    
    /* 10. int ve double tipinde iki sayının toplamını bulan iki farklı metot yazın.
    Bu metotları kullanarak çeşitli toplama işlemleri yapın ve sonucu ekrana yazdırın.
     */

}
