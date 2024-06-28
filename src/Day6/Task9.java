package Day6;

public class Task9 {

    private int number1;
    private int number2;

    public Task9(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public void sumNumber() {
        int sum = number1 + number2;
        System.out.println("Sayılar toplamı: " + sum);
    }

    public static void main(String[] args) {

        Task9 task9 = new Task9(5, 10);

        task9.sumNumber();
    }
    /* Bir sınıf oluşturun ve bu sınıfta iki değişken tanımlayın.
    Bu değişkenlerin toplamını bir metod içinde hesaplayın ve ekrana yazdırın.
     */
}
