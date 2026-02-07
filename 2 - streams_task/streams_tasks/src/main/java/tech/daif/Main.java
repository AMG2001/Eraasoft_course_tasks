package tech.daif;

import static tech.daif.service.BasicOperations.*;
import static tech.daif.service.CollectorsAndGrouping.*;
import static tech.daif.service.IntermediateOperations.*;
import static tech.daif.service.NumericStreams.*;
import static tech.daif.service.OptionalMapAndFlatMapTasks.*;
public class Main {
    public static void main(String[] args) {
        // BasicTasks.
        filterEvenNumbers();
        findNamesStartWithSpecificLetter();
        convertAllStringsToUpperCase();
        sortAllIntegersDesc();
        removeDuplicateElements();
        // Intermediate Tasks
        countNumberOfStringsLargerThan5();
        firstElementThatMatchCondition();
        checkIfNumberDivisibleBy5();
        collectElementsIntoSet();
        skipFirst3Elements();
        // Numeric Streams Tasks
        calculateSumOfIntegers();
        findMaxAndMinNumbers();
        calculateAvg();
        multipleAllIntegers();
        countPositiveNumbers();
        // Collectors and Grouping.
        groupStudentsByDepartment();
        partitionNumbersToEvenAndOddNumbers();
        createCommaSeparatedString();
        groupEmpByAgeAndCountEachGroup();
        findAvgSalaryPerDepartment();
        // Optional,Map,FlatMap.
        flattenListOfLists();
        extractAllUniqueCharactersFromListOfWords();
        filterNonEmptyOptionalValues();
        returnListOfUppercasedWordsStartingWithACharacter();
        // AdvancedOperations.

    }



}

