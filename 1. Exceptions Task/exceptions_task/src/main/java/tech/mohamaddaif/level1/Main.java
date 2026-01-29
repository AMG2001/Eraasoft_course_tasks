package tech.mohamaddaif.level1;

import java.util.Scanner;

public class Main {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        task1_handleArithmeticException();
        task2_handleNumberFormatException();
        task3_handleNullPointerException();
    }

    public static void task1_handleArithmeticException() {
        System.out.println("############################ Task 1 ##########################################");
        System.out.print("Enter first Number : ");
        int firstNumber = input.nextInt();
        System.out.print("Enter Second Number : ");
        int secondNumber = input.nextInt();
        try {
            System.out.println("Division Result : " + (firstNumber / secondNumber));
        } catch (ArithmeticException e) {
            System.out.println("Exception occurred because : " + e.getMessage());
        }
    }

    public static void task2_handleNumberFormatException() {
        System.out.println("############################ Task 2 ##########################################");
        System.out.print("Enter the number : ");
        String numberValueInString = input.next();
        try {
            int numberInInt = Integer.parseInt(numberValueInString);
        } catch (NumberFormatException e) {
            System.out.println("Exception occurred : " + e.getMessage());
        }
    }

    public static void task3_handleNullPointerException() {
        System.out.println("############################ Task 3 ##########################################");
        String str = null;
        try {
            System.out.println(str.toUpperCase());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
