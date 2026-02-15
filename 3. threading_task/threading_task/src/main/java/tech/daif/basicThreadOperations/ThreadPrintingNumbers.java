package tech.daif.basicThreadOperations;

import java.util.stream.IntStream;

public class ThreadPrintingNumbers extends Thread {
    public void printNumbers() {
        IntStream.range(0, 6).forEach(number -> {
            System.out.println(number);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
    }

    @Override
    public void run() {
        printNumbers();
    }
}
