package tech.daif.basicThreadOperations;

public class CreatedThreadWithExtension extends Thread{

    @Override
    public void run(){
        System.out.println("hello from thread created with extension");
    }
}
