package Day2;

import java.util.Scanner;

public class Question5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Puan giriniz: ");
        int grade = scanner.nextInt();

        char gradeLetter;
        if (grade >= 90 && grade <= 100) {
            gradeLetter = 'A';
        } else if (grade >= 80 && grade <= 89) {
            gradeLetter = 'B';
        } else if (grade >= 70 && grade <= 79) {
            gradeLetter = 'C';
        } else if (grade >= 60 && grade <= 69) {
            gradeLetter = 'D';
        } else if (grade >= 0 && grade <= 59) {
            gradeLetter = 'F';
        } else {
            System.out.println("Geçerli olmayan puan girdiniz.");
            scanner.close();
            return;
        }

        System.out.println("Not: " + gradeLetter);

        scanner.close();
    }
    /* 5. Bir üniversite, öğrencilerin aldığı derslere göre notlarını harf notuna çeviren bir Java programı yazmanızı istemektedir.
Program, her bir öğrencinin notunu okuyacak ve aşağıdaki kurallara göre harf notunu belirleyecektir:
	90-100: A
	80-89: B
	70-79: C
	60-69: D
	0-59: F

	Örnek Girdi:
	Bir puan giriniz: 85

	Örnek Çıktı:
	Not: B
    */
}
