package oop1.ex;
public class Account {
    int balance; //잔액

    void deposit(int amount) {
        balance += amount;
        //return balance; 왜 안 씀?
    } //입금 매서드

    void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("잔액 부족");
        }
    } //출금 매서드
}
