package Day6;

public class Task3 {
    public String car;

    public Task3(String car) {

        this.car = car;

        System.out.println("Marka: " + this.car);
    }

    public static void main(String[] args) {

        Task3 task3 = new Task3("Toyota");
    }

    /* Bir sınıf oluşturun ve bu sınıfa ait bir constructor tanımlayın.
    Constructor içinde bir değeri başlatın ve bu değeri ekrana yazdırın.
     */
}
