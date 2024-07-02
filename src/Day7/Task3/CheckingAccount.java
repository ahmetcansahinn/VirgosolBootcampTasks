package Day7.Task3;

public class CheckingAccount extends BankAccount{
    public CheckingAccount(double balance) {
        super(balance);
    }

    @Override
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Mevduat Hesabından " + amount + " çekildi. Bakiye: " + balance);
        } else {
            System.out.println("Mevduat Hesabında yeterli bakiye yok.");
        }
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Mevduat Hesabına " + amount + " yatırıldı. Bakiye: " + balance);
    }
}
