package timus.task_1263;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] votes = new int[N];

        for (int i = 0; i < M; i++) {
            int candidate = scanner.nextInt();
            votes[candidate - 1]++;
        }

        for (int i = 0; i < N; i++) {
            double percentage = (double) votes[i] / M * 100;
            System.out.printf("%.2f%%\n", percentage);
        }
    }
}
