package tech.daif;

import tech.daif.bankAccountTask.BankAccount;
import tech.daif.basicThreadOperations.CreatedThreadWithExtension;
import tech.daif.basicThreadOperations.CreatedThreadWithImplementingRunnable;
import tech.daif.basicThreadOperations.ThreadPrintingNumbers;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        CreatedThreadWithExtension createdThreadWithExtension = new CreatedThreadWithExtension();
        createdThreadWithExtension.start();

        CreatedThreadWithImplementingRunnable createdThreadWithImplementingRunnable = new CreatedThreadWithImplementingRunnable();

        Thread thread = new Thread(createdThreadWithImplementingRunnable);
        thread.start();

        createdThreadWithExtension.join();
        thread.join();

        System.out.println("Printing numbers with 1 second delay");
        ThreadPrintingNumbers threadPrintingNumbers = new ThreadPrintingNumbers();
        threadPrintingNumbers.start();

        threadPrintingNumbers.join();

        System.out.println("*********************************************");
        System.out.println("Bank Account Task.");

        BankAccount bankAccount = new BankAccount();

        Thread depositor = new Thread(()->{
            IntStream.range(0,10).forEach(index -> {
                try {
                    bankAccount.deposit(1000);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        });

        Thread withdrawer = new Thread(()->{
            IntStream.range(0,10).forEach(index->{
                try {
                    bankAccount.withdraw(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        });

        depositor.start();
        withdrawer.start();
    }
}
