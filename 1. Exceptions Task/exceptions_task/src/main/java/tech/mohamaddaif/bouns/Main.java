package tech.mohamaddaif.bouns;

public class Main {
    public static void main(String[] args) {
        showThatFinallyBlockIsExecutedWhenThereIsNoExceptions();
        showThatFinallyBlockIsExecutedAlthoughThereIsAHandledExceptionOccurred();
        nestedTryCatch();
        showThatFinallyBlockIsExecutedAlthoughThereIsAnExceptionOccurredAndNotHandled();
    }

    public static void showThatFinallyBlockIsExecutedWhenThereIsNoExceptions(){
        try {
            System.out.println("Hello world");
        }catch (Exception e){

        }finally {
            System.out.println("finally block is executed when there is no exceptions occurred");
        }
    }

    public static void showThatFinallyBlockIsExecutedAlthoughThereIsAHandledExceptionOccurred(){
        try {
            System.out.println(5/0);
        }catch (Exception e){

        }finally {
            System.out.println("finally block is executed although there is a handled exceptions occurred");
        }
    }

    public static void showThatFinallyBlockIsExecutedAlthoughThereIsAnExceptionOccurredAndNotHandled(){
        try {
            System.out.println(5/0);
        }catch (ArrayIndexOutOfBoundsException e){

        }finally {
            System.out.println("finally block is executed although there is an exception occurred and not handled");
        }
    }


    public static void nestedTryCatch(){
        try {
            try {
                System.out.println(1/0);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("exception handled within inner catch");
            }
        }catch (ArithmeticException e){
            System.out.println("Exception handled with outer cath");
        }
    }
}
