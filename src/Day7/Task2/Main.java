package Day7.Task2;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();
        cat.makeSound();
    }

    /* 2. *Task: Polimorfik Metod Kullanımı*
   - Bir Animal (Hayvan) sınıfı oluşturun ve bu sınıftan türeyen Dog (Köpek) ve Cat (Kedi) sınıfları tanımlayın.
   - Animal sınıfında makeSound() adında bir metod tanımlayın ve alt sınıflarda bu metodu override edin.
   - Main metodunda farklı türde hayvanlar oluşturun (Animal referansıyla) ve her birinin sesini çıkartan metodu çağırarak sonuçları gözlemleyin.
     */
}
