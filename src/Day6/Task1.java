package Day6;

public class Task1 {

        public String brand;
        public String model;
        public int year;

        public Task1(String brand, String model, int yil) {
            this.brand = brand;
            this.model = model;
            this.year = yil;
        }



        public static void main(String[] args) {

            Task1 car = new Task1("Toyota", "Corolla", 2020);

            System.out.println("Arabanın markası: " + car.brand);

        }

    /* Bir sınıf oluşturun ve bu sınıfa ait bir nesne oluşturun.
    Nesnenin bir özelliğini ekrana yazdırın.
     */

}
