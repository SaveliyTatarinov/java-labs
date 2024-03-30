package timus.task_2066;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int minResult = Integer.MAX_VALUE;

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                int result = calculateExpression(a, b, c, i, j);
                minResult = Math.min(minResult, result);
            }
        }

        System.out.println(minResult);
    }

    public static int calculateExpression(int a, int b, int c, int op1, int op2) {
        int result;

        if (op1 == 1 && op2 == 1) {
            result = a + b + c;
        } else if (op1 == 1 && op2 == 2) {
            result = a + b - c;
        } else if (op1 == 1 && op2 == 3) {
            result = a + b * c;
        } else if (op1 == 2 && op2 == 1) {
            result = a - b + c;
        } else if (op1 == 2 && op2 == 2) {
            result = a - b - c;
        } else if (op1 == 2 && op2 == 3) {
            result = a - b * c;
        } else if (op1 == 3 && op2 == 1) {
            result = a * b + c;
        } else if (op1 == 3 && op2 == 2) {
            result = a * b - c;
        } else {
            result = a * b * c;
        }

        return result;
    }
}
