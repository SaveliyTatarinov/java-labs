package laba2.Example7;

public class MyBankAccount {
    public static void main(String[] args) {
        // создаем счет в банке
        BankAccount myAcc = new BankAccount("1234ABC", 1000.0);
        //кладем на него 500 рублей
        myAcc.deposit(500.0);
        // смотрим баланс
        myAcc.getBalance();
        //снимаем 700 рублей
        myAcc.withdraw(700);
        //проверим баланс
        myAcc.getBalance();
        //снимем больше, чем у нас есть
        myAcc.withdraw(1000);
}
}
