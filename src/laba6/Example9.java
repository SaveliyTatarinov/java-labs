package laba6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example9 {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("Python", "C#", "C++", "Java 17", "SQL");
        List<String> alphabeticStrings = findAlphabeticStrings(input);

        System.out.println("Исходный список: " + input);
        System.out.println("Строки, содержащие только буквы: " + alphabeticStrings);
    }

    public static List<String> findAlphabeticStrings(List<String> input) {
        return input.stream()
                .filter(s -> s.matches("^[a-zA-Z]+$"))
                .collect(Collectors.toList());
    }
}
