package tech.daif.bankAccountTask;

public class BankAccount {

    private double balance;
    private boolean canWithdraw = false;

    synchronized public void deposit(double amount) throws InterruptedException {
        while (canWithdraw){
            wait();
        }
        canWithdraw = true;
        System.out.println("Deposited : "+amount);
        balance += amount;
        notify();
    }

    synchronized public void withdraw(double balance) throws InterruptedException {
        while (!canWithdraw){
            wait();
        }
        System.out.println("withdrawn : "+balance);
        canWithdraw = false;
        notify();
    }
}
