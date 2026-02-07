package tech.mohamaddaif.level3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task7_invalidAgeException();
        task9_handleExceptionOfOtherMethod();
        try {
            task10_readFile("dummy");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void task7_invalidAgeException() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the age : ");
        int age = input.nextInt();
        try {
            if (age < 18) throw new InvalidAgeException("The minimum age is 18");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void task9_handleExceptionOfOtherMethod() {
        try {
            System.out.println(divide(5, 0));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    private static int divide(int num1, int num2) throws ArithmeticException {
        return num1 / num2;
    }

    public static void task10_readFile(String filePath) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(filePath);
        System.out.println("file found");
    }
}
