package tech.daif.service;

import tech.daif.DataSource;

import java.util.Comparator;

public class BasicOperations {
    // BasicTasks.
    public static void filterEvenNumbers() {
        int[] evenNumbers = DataSource.getNumbersList().stream().filter(number -> number % 2 == 0)
                .mapToInt(Integer::intValue)
                .toArray();
        System.out.print("Even numbers are : ");
        for(int number : evenNumbers){
            System.out.print(number + ",");
        }
        System.out.println();
    }

    public static void findNamesStartWithSpecificLetter() {
        String[] namesStartWithA = DataSource.getNamesList()
                .stream()
                .filter(name -> name != null )
                .filter(name -> name.startsWith("A"))
                .toArray(String[]::new);
        System.out.print("Names start with A : ");
        for(String name : namesStartWithA) System.out.print(name+",");
        System.out.println();
    }

    public static void convertAllStringsToUpperCase() {
        DataSource.getNamesList()
                .stream()
                .filter(name -> name != null )
                .map(name -> name.toUpperCase());
        System.out.print("Names in Upper case :");
        DataSource.getNamesList().stream().forEach(name-> System.out.print(name + ","));
        System.out.println();
    }

    public static void sortAllIntegersDesc() {
        System.out.print("Sorted numbers in DESC order : ");
        Comparator<Integer> descComparator = (o1, o2) -> o2 - o1;
        DataSource.getNumbersList().stream().sorted(descComparator).forEach(number -> System.out.print(number + ","));
        System.out.println();
    }

    public static void removeDuplicateElements() {
        System.out.println("print unique elements within numbers list : ");
        DataSource.getNumbersList().stream().distinct().forEach(number -> System.out.print(number+","));
        System.out.println();
    }

}
