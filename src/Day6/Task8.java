package Day6;

public class Task8 {

    private final String brand;

    public Task8(String brand) {
        this.brand = brand;
    }

    public void brand() {
        System.out.println("Arabanın markası: " + brand);
    }

    public static void main(String[] args) {

        Task8 carBrand = new Task8("Fiat");

        carBrand.brand();
    }
    /* Bir sınıf oluşturun ve bu sınıfta final bir değişken tanımlayın.
     Bu değişkenin değerini ekrana yazdırın.
     */

}
