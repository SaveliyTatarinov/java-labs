package laba1;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input first number: ");
        int firstNumber = in.nextInt();

        System.out.println("Input second number: ");
        int secondNumber = in.nextInt();

        int sum = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;

        System.out.printf("Sum of your numbers: %d\nSubtraction of your numbers: %d", sum, subtraction);
        in.close();
    }
}
