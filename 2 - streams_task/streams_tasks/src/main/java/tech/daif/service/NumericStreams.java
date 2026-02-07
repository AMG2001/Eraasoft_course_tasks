package tech.daif.service;

import tech.daif.DataSource;

public class NumericStreams {
    public static void calculateSumOfIntegers(){
        System.out.print("Sum of integers : ");
        System.out.println( DataSource.getNumbersList().stream().reduce(0,Integer::sum));
    }
    public static void findMaxAndMinNumbers(){
        System.out.print("Max number is : ");
        System.out.println(DataSource.getNumbersList().stream().mapToInt(Integer::intValue).max());
        System.out.print("Minimum number is : ");
        System.out.println(DataSource.getNumbersList().stream().mapToInt(Integer::intValue).min());
    }

    public static void calculateAvg(){
        System.out.print("Avg is : ");
        System.out.println(DataSource.getNumbersList().stream().mapToInt(Integer::intValue).average());
    }

    public static void multipleAllIntegers(){
        System.out.print("print all numbers multiplied by 2 : ");
        DataSource.getNumbersList().stream().map(number -> number * 2).forEach(number -> System.out.print(number+","));
        System.out.println();
    }
    public static void countPositiveNumbers(){
        System.out.print("Number of positive values : ");
        System.out.println(DataSource.getNumbersList().stream().filter(number -> number>0).count());
    }
}
