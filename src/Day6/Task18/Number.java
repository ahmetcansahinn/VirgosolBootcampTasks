package Day6.Task18;

public class Number {
    private int[] numbers;


    public Number(int[] numbers) {
        this.numbers = numbers;
    }

    public void update() {

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] += 5;
        }

        System.out.print("Güncellenmiş Hali: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

    }
}
