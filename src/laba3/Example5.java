package laba3;

import java.util.HashMap;
import java.util.Map;

public class Example5 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(0, "pear");
        map.put(1, "apple");
        map.put(2, "banana");
        map.put(3, "cherry");
        map.put(4, "date");
        map.put(5, "grape");
        map.put(6, "kiwi");
        map.put(7, "lemon");
        map.put(8, "mango");
        map.put(9, "orange");

        for (Integer key : map.keySet()) {
            if (key > 5) {
                System.out.println("Ключ: " + key + ", Значение: " + map.get(key));
            }
        }

        if (map.containsKey(0)) {
            System.out.println("Строки с ключом 0: " + map.get(0));
        }

        int product = 1;
        for (String value : map.values()) {
            if (value.length() > 5) {
                product *= map.entrySet().stream()
                        .filter(entry -> entry.getValue().equals(value))
                        .mapToInt(Map.Entry::getKey)
                        .findFirst()
                        .orElse(1);
            }
        }

        System.out.println("Произведение ключей с длиной строки больше 5: " + product);
    }
}