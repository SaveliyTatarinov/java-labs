package timus.task_1349;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        boolean solutionFound = false;
        int a = 1, b = 1, c = 1;

        for (a = 1; a <= 100; a++) {
            for (b = 1; b <= 100; b++) {
                for (c = 1; c <= 100; c++) {
                    if (Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n) && a < b && b < c) {
                        System.out.println(a+" "+b+" "+c);
                        solutionFound = true;
                        break;
                    }
                }
                if (solutionFound) {
                    break;
                }
            }
            if (solutionFound) {
                break;
            }
        }

        if (!solutionFound) {
            System.out.println("-1");
        }
    }
}
