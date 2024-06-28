package Day6.Task19;

public class NumberObject {

    public static void main(String[] args) {
        int[] myArray = {3, 4, 5, 6, 7};
        Number number = new Number(myArray);

        number.print();

        int[] newArray = {11, 22, 33};
        number.setNumbers(newArray);
        number.print();
    }

    /* Bir sınıf oluşturun ve bu sınıfta private bir dizi tanımlayın.
    Bu dizi elemanlarını getter ve setter metodları ile güncelleyin ve ekrana yazdırın.
     */
}
