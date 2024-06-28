package Day6;

public class Task10 {

    private String product;
    private double price;

    public Task10(String product, double price) {
        this.product = product;
        this.price = price;

        System.out.println("Ürün Çeşidi: " + this.product);
        System.out.println("Fiyatı: " + this.price);
    }

    public static void main(String[] args) {

        Task10 product = new Task10("Telefon", 4500.0);
    }
    /* Bir sınıf oluşturun ve bu sınıfta bir constructor tanımlayın.
    Constructor içinde iki değişkeni başlatın ve bu değişkenlerin değerlerini ekrana yazdırın.
     */
}
