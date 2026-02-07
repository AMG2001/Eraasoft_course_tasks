package tech.daif.service;

import tech.daif.DataSource;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalMapAndFlatMapTasks {
    public static void flattenListOfLists() {
        System.out.print("Flatten Strings : ");
        DataSource.getNestedWords().stream().flatMap(List::stream).forEach(string -> System.out.print(string + ", "));
        System.out.println();
    }

    public static void extractAllUniqueCharactersFromListOfWords() {
        System.out.println("unique characters within words : ");
        DataSource
                .getNamesList()
                .stream()
                .filter(name -> name != null && !name.isEmpty())
                .forEach(name -> {
                    System.out.print("Unique characters within name : " + name + " are : ");
                    name.chars().distinct().forEach(character -> System.out.print((char) character + ", "));
                    System.out.println();
                });
    }

    public static void filterNonEmptyOptionalValues() {
        List<Optional<String>> optionalStrings = Arrays.asList(
                Optional.of("A"),
                Optional.of("B"),
                Optional.empty(),
                Optional.of("C"),
                Optional.empty()
        );
        System.out.print("Print non empty optional values : ");
        optionalStrings
                .stream()
                .filter(Optional::isPresent)
                .forEach(optionalString ->
                        System.out.print(optionalString.get() + ", "));
        System.out.println();
    }

    public static List<String> returnListOfUppercasedWordsStartingWithACharacter() {
        List<String> namesWithAUpperCase = DataSource
                .getNamesList()
                .stream()
                .filter(name -> name !=null && !name.isEmpty())
                .filter(name -> name.startsWith("A"))
                .map(name -> name.toUpperCase())
                .toList();
        System.out.println("names Starting with A in Upper case : ");
        namesWithAUpperCase.stream().forEach(System.out::println);
        return namesWithAUpperCase;
    }
}
