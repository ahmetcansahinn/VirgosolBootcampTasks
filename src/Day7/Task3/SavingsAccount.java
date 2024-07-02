package Day7.Task3;

public class SavingsAccount extends BankAccount{
    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Tasarruf Hesabından " + amount + " çekildi. Bakiye: " + balance);
        } else {
            System.out.println("Tasarruf Hesabında yeterli bakiye yok.");
        }
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Tasarruf Hesabına " + amount + " yatırıldı. Bakiye: " + balance);
    }
}
