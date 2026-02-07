package tech.daif.service;

import tech.daif.DataSource;

import java.util.Set;
import java.util.stream.Collectors;

public class IntermediateOperations {
    // Intermediate Tasks
    public static void countNumberOfStringsLargerThan5() {
        System.out.print("count numbers which are larger than 5 : ");
        System.out.print(DataSource.getNumbersList().stream().filter(number -> number > 5).count());
        System.out.println();
    }

    public static void firstElementThatMatchCondition() {
        System.out.print("first 10 number that matches that condition : ");
        System.out.println(DataSource.getNumbersList().stream().filter(number -> number == 10).findFirst().get());
    }

    public static void checkIfNumberDivisibleBy5() {
        System.out.print("numbers which are divisible by 5 : ");
        DataSource.getNumbersList().stream().filter(number -> number%5==0).forEach(number -> System.out.print(number + ","));
        System.out.println();
    }

    public static void collectElementsIntoSet() {
        Set<Integer> numbersInSet = DataSource.getNumbersList().stream().collect(Collectors.toSet());
        System.out.print("Numbers in Set : ");
        for(int number : numbersInSet) System.out.print(number +",");
        System.out.println();
    }

    public static void skipFirst3Elements() {
        System.out.print("Printing names after skipping first 3 names : ");
        DataSource.getNamesList().stream().skip(3).forEach(name -> System.out.print(name+","));
        System.out.println();
    }
}
