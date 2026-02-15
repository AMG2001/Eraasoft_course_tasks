package tech.daif.basicThreadOperations;

public class CreatedThreadWithImplementingRunnable implements Runnable {


    @Override
    public void run() {
        System.out.println("name is : "+Thread.currentThread().getName()+" , message content");
    }
}