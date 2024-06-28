package Day6;

public class Task6 {
    public void sum(int number1, int number2) {
        int sum = number1 + number2;
        System.out.println("İki sayı toplamı: " + sum);
    }

    public void sum(int number1, int number2, int number3) {
        int sum = number1 + number2 + number3;
        System.out.println("Üç sayı toplamı: " + sum);
    }

    public static void main(String[] args) {
        Task6 task6 = new Task6();

        task6.sum(5, 10);

        task6.sum(3, 7, 2);
    }
    /* Bir sınıf oluşturun ve bu sınıfta iki farklı metot tanımlayın.
     Bu metotlar aynı isme sahip olsun ama farklı parametreler alsın (overloading).
     */
}
