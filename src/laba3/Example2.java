package laba3;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();
        scanner.close();

        System.out.println("Число " + number + " в двоичной системе: " + convertToBinary(number));
    }

    static String convertToBinary(int number) {
        if (number == 0) {
            return "0";
        }
        if (number == 1) {
            return "1";
        }
        if (number % 2 == 0) {
            return convertToBinary(number / 2) + "0";
        } else {
            return convertToBinary(number / 2) + "1";
        }
    }
}
