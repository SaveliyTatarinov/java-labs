package laba4;

import java.util.Scanner;

public class Example2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = 0;
        try {
            size = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: введите целое число.");
            scanner.close();
            return;
        }

        byte[] array = new byte[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Введите элемент массива [" + i + "]: ");
            try {
                int inputValue = Integer.parseInt(scanner.nextLine());

                if (inputValue < Byte.MIN_VALUE || inputValue > Byte.MAX_VALUE) {
                    System.out.println("Ошибка: значение выходит за диапазон типа byte.");
                    scanner.close();
                    return;
                }

                array[i] = (byte) inputValue;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите целое число.");
                scanner.close();
                return;
            }
        }

        int sum = 0;
        for (byte b : array) {
            sum += b;
        }

        System.out.println("Сумма элементов массива: " + sum);

        scanner.close();
    }
}
