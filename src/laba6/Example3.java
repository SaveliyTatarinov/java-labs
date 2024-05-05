package laba6;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Example3 {
    public static void main(String[] args) {
        String string = "У лукоморья дуб зелёный " +
                "Златая цепь на Дубе том: " +
                "И днём и ночью Кот учёный " +
                "Всё ходит по цепи кругом " +
                "Идёт направо — Песнь заводит " +
                "Налево — Сказку говорит. " +
                "Там чудеса: Там леший бродит, " +
                "Русалка на ветвях сидит.";
        List<String> strings = List.of(string.split( " "));
        System.out.println("Строка после сплитования: " + "\n");
        for (String e : strings){
            System.out.println(e);
        }

        List<String> stringsAfter = filterCapitalized(strings);

        System.out.println("\n"+"Строка после преобразования: " + "\n");
        for (String e : stringsAfter){
            System.out.println(e);
        }
    }

    public static List<String> filterCapitalized(List<String> list){
        return list.stream()
                .filter(s -> Character.isUpperCase(s.charAt(0)))
                .collect(Collectors.toList());
    }
}
