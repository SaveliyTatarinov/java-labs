package laba6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example7 {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("Python", "Магистратура", "Java", "C++","C#","DataScience", "Stream");
        int minLength = 5;

        List<String> longStrings = findLongStrings(input, minLength);

        System.out.println("Исходный список: " + input);
        System.out.println("Длинные строки (длина > " + minLength + "): " + longStrings);
    }

    public static List<String> findLongStrings(List<String> input, int minLength) {
        return input.stream()
                .filter(s -> s.length() > minLength)
                .collect(Collectors.toList());
    }
}
