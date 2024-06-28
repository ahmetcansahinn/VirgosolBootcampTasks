package Day6;

public class Task7 {

    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public static void main(String[] args) {

        Task7 brand = new Task7();

        brand.setBrand("Fiat");

        System.out.println("Araç markası: " + brand.getBrand());
    }

    /* Bir sınıf oluşturun ve bu sınıfta private bir değişken tanımlayın.
    Bu değişkeni getter ve setter metodları ile güncelleyin ve ekrana yazdırın.
     */
}
