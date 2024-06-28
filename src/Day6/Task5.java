package Day6;

public class Task5 {
    public void sum(int number1, int number2) {
        int sum = number1 + number2;
        System.out.println("Toplam: " + sum);
    }

    public static void main(String[] args) {
        Task5 task5 = new Task5();

        task5.sum(5, 10);
    }
    /* Bir sınıf oluşturun ve bu sınıf içinde bir metot tanımlayın.
     Metot iki parametre alsın ve bu parametrelerin toplamını ekrana yazdırsın.
     */
}
