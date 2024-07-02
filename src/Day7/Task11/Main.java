package Day7.Task11;

public class Main {

    public static void main(String[] args) {

        System.out.println("Okulun Adı: " + School.schoolName);

        int age1 = 10;
        int age2 = 17;

        System.out.println(age1 + " yaşında olmak öğrencilik için uygun mu? " + School.isFavorForBeingStudent(age1));
        System.out.println(age2 + " yaşında olmak öğrencilik için uygun mu? " + School.isFavorForBeingStudent(age2));
    }

    /* 11. *Task: static practice*
   - School isimli bir class oluşturun.
   - statik değişken olarak schoolName ataması yapın.
   - static bir method (isFavorForBeingStudent(int age)) tanımlayın. Method parametre olarak yaş bilgisini alsın 6<= age <=16 yaşları arasında ise true değilse false dönen bir yapı kurun.
   - Başka bir java classından nesne yaratmadan statik değişken ve metoda erişelim
     */
}
