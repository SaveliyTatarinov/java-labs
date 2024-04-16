package timus.task_1581;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] sequence = new int[n];

        for (int i = 0; i < n; i++) {
            sequence[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int count = 1;
            while (i < n - 1 && sequence[i] == sequence[i + 1]) {
                count++;
                i++;
            }
            System.out.print(count + " " + sequence[i] + " ");
        }
    }
}
