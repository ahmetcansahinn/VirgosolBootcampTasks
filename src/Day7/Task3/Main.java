package Day7.Task3;

public class Main {

    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount(2000);
        savings.deposit(300);
        savings.withdraw(250);

        BankAccount checking = new CheckingAccount(600);
        checking.deposit(400);
        checking.withdraw(500);
    }

    /* 3. *Task: Banka Hesapları*
   - Bir BankAccount (Banka Hesabı) abstract sınıfı tanımlayın ve withdraw() ve deposit() gibi abstract metotlar ekleyin.
   - Bu sınıftan türeyen SavingsAccount (Tasarruf Hesabı) ve CheckingAccount (Mevduat Hesabı) sınıfları oluşturun ve bu metotları implement edin.
   - Her iki hesap türünden örnekler oluşturun ve her biri için para yatırma (deposit) ve para çekme (withdraw) işlemleri gerçekleştirin.
     */
}
