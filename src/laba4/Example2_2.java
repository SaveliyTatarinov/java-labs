package laba4;

import java.util.Scanner;

public class Example2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строк матрицы: ");
        int rows = 0;
        try {
            rows = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: введите целое число.");
            scanner.close();
            return;
        }

        System.out.print("Введите количество столбцов матрицы: ");
        int cols = 0;
        try {
            cols = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: введите целое число.");
            scanner.close();
            return;
        }

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Введите элемент матрицы [" + i + "][" + j + "]: ");
                try {
                    matrix[i][j] = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка: введите целое число.");
                    scanner.close();
                    return;
                }
            }
        }

        System.out.print("Введите номер столбца для вывода: ");
        int columnNumber = 0;
        try {
            columnNumber = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: введите целое число.");
            scanner.close();
            return;
        }

        if (columnNumber < 0 || columnNumber >= cols) {
            System.out.println("Ошибка: столбца с таким номером нет.");
        } else {
            System.out.println("Столбец " + columnNumber + ":");
            for (int i = 0; i < rows; i++) {
                System.out.println(matrix[i][columnNumber]);
            }
        }
        scanner.close();
    }
}
