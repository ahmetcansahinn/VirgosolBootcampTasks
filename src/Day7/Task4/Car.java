package Day7.Task4;

public class Car extends Vehicle{

    @Override
    void start() {
        System.out.println("Araba çalıştı.");
    }

    @Override
    void stop() {
        System.out.println("Araba durdu.");
    }
}
