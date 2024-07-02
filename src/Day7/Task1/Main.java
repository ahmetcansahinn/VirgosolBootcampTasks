package Day7.Task1;

public class Main {
    public static void main(String[] args) {

        Shape circle = new Circle(7);
        Shape rectangle = new Rectangle(3, 9);

        System.out.println("Daire alan: " + circle.calculateArea());
        System.out.println("Diktörgen Alan: " + rectangle.calculateArea());
    }

    /* 1. *Task: Geometrik Şekiller*
   - Bir Shape (Şekil) sınıfı(parent) oluşturun ve bu sınıftan türeyen Circle (Daire) ve Rectangle (Dikdörtgen) sınıfları(child) tanımlayın.
   - Shape sınıfında calculateArea() metodunu soyut (abstract) olarak tanımlayın ve alt sınıflarda bu metodu implement edin.
   - Main metodunda farklı türde şekiller oluşturun (Shape referansıyla) ve her birinin alanını hesaplayarak ekrana yazdırın.
     */
}
