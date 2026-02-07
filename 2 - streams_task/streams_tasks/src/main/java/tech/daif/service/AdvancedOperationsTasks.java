package tech.daif.service;

import tech.daif.DataSource;
import tech.daif.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AdvancedOperationsTasks {
    public static void sortEmpsBySalaryThenByName() {
        System.out.println("Employees sorted by salary and then name : ");
        DataSource
                .getEmployeesList()
                .stream()
                .sorted(Comparator
                        .comparing(Employee::getSalary)
                        .thenComparing(Employee::getName)
                )
                .forEach(employee -> System.out.println(employee));
    }

    public static void findSecondLargerNumberInList() {
        System.out.println("Second largest number in List : ");
        DataSource
                .getNumbersList()
                .stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .ifPresent(System.out::print);
    }

    public static void findDuplicateElementWithinIntegersList() {
        System.out.println("Duplicate numbers in integer list are : ");
        Map<Integer, List<Integer>> map = DataSource
                .getNumbersList()
                .stream()
                .collect(Collectors.groupingBy(Integer::valueOf));
        map.forEach((key, value) -> {
            if (value.size() > 1) {
                System.out.println(key);
            }
        });
    }

    public static List<String> removeNullAndEmptyStringFromList() {
        List<String> names = DataSource.getNamesList().stream().filter(name -> name != null && !name.isEmpty()).toList();
        return names;
    }

    public static void partitionStudentsToPassAndFail() {
        DataSource.getStudentsList().stream().collect(Collectors.partitioningBy(student -> student.getGrade() > 50)).forEach((bool, students) -> {
            System.out.println("Students with status " + bool + " are : ");
            students.forEach(student -> System.out.print(student + ", "));
            System.out.println();
        });
    }
}
