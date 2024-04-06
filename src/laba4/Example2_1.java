package laba4;

import java.util.Scanner;

public class Example2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        try {
            System.out.print("Введите размер массива: ");
            n = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: введите целое число.");
            scanner.close();
            return;
        }

        if (n <= 0) {
            System.out.println("Ошибка: размер массива должен быть больше 0.");
            scanner.close();
            return;
        }


        int[] arr = new int[n];
        int sum = 0;
        int positiveCount = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Введите элемент массива [" + i + "]: ");
            try {
                arr[i] = Integer.parseInt(scanner.nextLine());

                if (arr[i] > 0) {
                    sum += arr[i];
                    positiveCount++;
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите целое число.");
                scanner.close();
                return;
            }
        }

        if (positiveCount == 0) {
            System.out.println("Ошибка: в массиве нет положительных чисел.");
            scanner.close();
            return;
        }

        double average = (double) sum / positiveCount;
        System.out.println("Среднее значение среди положительных элементов: " + average);

        scanner.close();
    }
}
