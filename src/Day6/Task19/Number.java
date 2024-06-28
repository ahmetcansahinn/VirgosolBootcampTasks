package Day6.Task19;

public class Number {
    private int[] numbers;

    public Number(int[] numbers) {
        this.numbers = numbers;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public void print() {
        System.out.print("Dizi: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
