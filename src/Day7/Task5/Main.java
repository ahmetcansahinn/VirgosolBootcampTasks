package Day7.Task5;

public class Main {
    public static void main(String[] args) {

        Shape circle = new Circle(7);
        Shape rectangle = new Rectangle(5, 7);

        System.out.println("Daire alan: " + circle.calculateArea());
        System.out.println("Daire çevre: " + circle.calculatePerimeter());

        System.out.println("Dikdörtgen alan: " + rectangle.calculateArea());
        System.out.println("Dikdörtgen çevre: " + rectangle.calculatePerimeter());
    }

    /* 5. **Task: Şekil Hesapları

   - Bir Shape (Şekil) interface'i tanımlayın ve bu interface içinde calculateArea() ve calculatePerimeter() gibi metodlar belirleyin.
   - Bu interface'i implement eden Circle, Rectangle gibi sınıflar oluşturun.
   - Her bir sınıfta interface'in metodlarını implement ederek, şekillerin alanını ve çevresini hesaplayın.
   - Main metodunda farklı türde şekiller (nesneler) oluşturun (Shape referansıyla) ve her birinin alanını ve çevresini hesaplayarak ekrana yazdırın.
     */
}
