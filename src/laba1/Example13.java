package laba1;

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input first number: ");
        int firstNumber = in.nextInt();

        System.out.println("Input second number: ");
        int secondNumber = in.nextInt();

        int sum = firstNumber + secondNumber;

        System.out.printf("Sum of your numbers is %d",sum);
        in.close();
    }
}
