package Day7.Task4;

public class Motorcycle extends Vehicle {
    @Override
    void start() {
        System.out.println("Motor çalıştı.");
    }

    @Override
    void stop() {
        System.out.println("Motor durdu.");
    }
}
