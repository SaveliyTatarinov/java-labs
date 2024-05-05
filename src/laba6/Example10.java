package laba6;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Example10 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> input = random.ints(10, 0, 100).boxed().collect(Collectors.toList());
        System.out.println("Исходный список: " + input);

        int threshold = 50;

        List<Integer> greaterNumbers = findLeastNumbers(input, threshold);
        System.out.println("Числа, меньше " + threshold + ": " + greaterNumbers);
    }

    public static List<Integer> findLeastNumbers(List<Integer> input, int threshold) {
        return input.stream()
                .filter(n -> n < threshold)
                .collect(Collectors.toList());
    }
}
