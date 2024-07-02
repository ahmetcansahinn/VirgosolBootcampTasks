package Day7.Task3;

abstract public class BankAccount {

    public double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    abstract void withdraw(double amount);
    abstract void deposit(double amount);
}
