package Day7;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("Program başladı.");

        try {

            Thread.sleep(5000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        System.out.println("Program sona erdi.");
    }

    /* 7. *Task: Thread.sleep(5000)*
   - Thread.sleep() metodu kullanın.
   - try-catch bloğu ile kodu çalışabilir hale dönüştürün.
     */
}
