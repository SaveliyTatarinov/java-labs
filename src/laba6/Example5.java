package laba6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example5 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Я люблю python","Я люблю java", "Я люблю C#");
        System.out.println("Строки:" + "\n" + strings);

        String substring = "python";
        System.out.println("Ищем:" + "\n" +substring);

        List<String> result = findSubstrings(strings, substring);

        System.out.println("Наш результат" + "\n" + result);
    }

    public static List<String> findSubstrings(List<String> strings, String substring) {
        return strings.stream()
                .filter(s -> s.contains(substring))
                .collect(Collectors.toList());
    }
}
