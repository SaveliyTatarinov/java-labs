package laba6;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Example6 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> input = random.ints(10, 0, 100).boxed().collect(Collectors.toList());
        System.out.println("Исходный список: " + input);

        int divisor = 6;
        List<Integer> divisibleNumbers = findDivisibleNumbers(input, divisor);

        System.out.println("Числа, делящиеся на " + divisor + " без остатка: " + divisibleNumbers);
    }

    public static List<Integer> findDivisibleNumbers(List<Integer> input, int divisor) {
        return input.stream()
                .filter(n -> n % divisor == 0)
                .collect(Collectors.toList());
    }
}
