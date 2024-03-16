package laba2.Example7;

public class BankAccount implements BankInterface{
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Вы внесли " + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Вы сняли " + amount);
        }
        else {
            System.out.println("Недостаточно средств!");
        }
    }

    @Override
    public void getBalance() {
        System.out.println("Ваш баланс: " + balance);
    }
}