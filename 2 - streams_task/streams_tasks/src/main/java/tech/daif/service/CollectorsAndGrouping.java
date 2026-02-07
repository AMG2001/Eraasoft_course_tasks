package tech.daif.service;

import tech.daif.DataSource;
import tech.daif.Employee;
import tech.daif.Student;

import java.util.stream.Collectors;

public class CollectorsAndGrouping {
    public static void groupStudentsByDepartment() {
        DataSource.getStudentsList().stream().collect(Collectors.groupingBy(Student::getDepartment))
                .forEach((s, students) -> {
                    System.out.println("Department " + s + " has students : ");
                    students.forEach(student -> System.out.println(student));
                });
    }

    public static void partitionNumbersToEvenAndOddNumbers() {
      DataSource
              .getNumbersList()
              .stream()
              .collect(Collectors
                      .partitioningBy(number -> number % 2 == 0)
              )
              .forEach((aBoolean, integers) -> {
                    System.out.println("value with condition : " + aBoolean + " are : ");
                    integers.stream().forEach(integer -> System.out.print(integer + ", ")
                    );
                  }
              );
    }

    public static void createCommaSeparatedString() {
        System.out.print("All names joined by Streams method : ");
        System.out.println(DataSource.getNamesList().stream().collect(Collectors.joining(",")));
    }

    public static void groupEmpByAgeAndCountEachGroup() {
        DataSource
                .getEmployeesList()
                .stream()
                .collect(Collectors
                        .groupingBy(Employee::getAge)
                )
                .forEach((age, employees) ->
                        System.out.println("number of employees with age : " + age + " = " + employees
                                .stream()
                                .count())
                );
    }

    public static void findAvgSalaryPerDepartment() {
        DataSource
                .getEmployeesList()
                .stream()
                .collect(
                        Collectors
                                .groupingBy(Employee::getDepartment)
                )
                .forEach((department, employees) ->
                        System.out.println("Avg of salaries within department : " + department + " = "
                                + employees
                                .stream()
                                .mapToDouble(Employee::getSalary)
                                .average())
                );
    }
}
