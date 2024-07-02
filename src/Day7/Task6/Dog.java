package Day7.Task6;

public class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Köpek havlar");
    }

    @Override
    public void move() {
        System.out.println("Köpek koşar");
    }
}
