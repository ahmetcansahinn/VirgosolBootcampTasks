package Day7.Task4;

public class Main {
    public static void main(String[] args) {

        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();

        car.start();
        car.stop();

        motorcycle.start();
        motorcycle.stop();
    }

    /* 4. *Task: Araba Arabirimleri*
   - Vehicle (Araç) adında bir soyut sınıf tanımlayın ve start() ve stop() gibi abstract metotlar ekleyin.
   - Bu sınıftan türeyen Car (Araba) ve Motorcycle (Motosiklet) sınıfları oluşturun ve bu metotları implement edin.
   - Her iki araç türünden örnekler oluşturun ve her biri için başlatma (start) ve durdurma (stop) işlemleri gerçekleştirin.
     */
}
