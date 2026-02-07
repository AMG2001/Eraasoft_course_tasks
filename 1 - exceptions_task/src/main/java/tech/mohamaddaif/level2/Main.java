package tech.mohamaddaif.level2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        task4_handleArrayIndexException();
        task5_fileNotFoundException();
        task6_multipleCatch();
    }

    public static void task4_handleArrayIndexException() {
        Scanner input = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("############################ Task 4 ##########################################");
        System.out.print("Enter the index : ");
        int requestedIndex = input.nextInt();
        try {
            System.out.println(arr[requestedIndex]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void task5_fileNotFoundException() {
        System.out.println("############################ Task 5 ##########################################");
        System.out.println("Enter the full absolute path of the file : ");
        Scanner input = new Scanner(System.in);
        String filePath = input.nextLine();
        try{
            FileInputStream fileInputStream = new FileInputStream(filePath);
            System.out.println("file found");
        }catch (FileNotFoundException fileNotFoundException){
            System.out.println(fileNotFoundException.getMessage());
        }
    }

    public static void task6_multipleCatch(){
        try{
            System.out.println(1/0);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static double calculateToll(VehicleType type) {
        double value = switch(type){
            case CAR -> 5.0;
            case MOTOCYCLE -> 3.0;
            case BUS -> 10.0;
            case TRUCK -> 15.0;
        };
        System.our.print(""+type + "->" + value);
    }
}
