package Day6;

public class Task11 {
    private String brand;
    private int year;
    private String model;

    public Task11(String brand, int year, String model) {
        this.brand = brand;
        this.year = year;
        this.model = model;
    }

    public Task11(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void car() {
        System.out.println("Araç Markası: " + brand);
        System.out.println("Araç yılı: " + year);
        System.out.println("Araç modeli: " + model);
    }

    public static void main(String[] args) {

        Task11 car1 = new Task11("Fiat", 2024, "Egea");
        Task11 car2 = new Task11("Fiat", 2024);

        car1.car();
        System.out.println("------------------");
        car2.car();
    }
    /* Bir sınıf oluşturun ve bu sınıfta iki farklı constructor tanımlayın.
    Constructor'lar farklı parametreler alsın (overloading).
     */
}
