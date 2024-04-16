package timus.task_1787;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt();
        int n = scanner.nextInt();

        int[] carsArrived = new int[n];

        for (int i = 0; i < n; i++) {
            carsArrived[i] = scanner.nextInt();
        }

        int carsInTrafficJam = 0;

        for (int i = 0; i < n; i++) {
            carsInTrafficJam += carsArrived[i] - k;
            if (carsInTrafficJam < 0) {
                carsInTrafficJam = 0;
            }
        }

        System.out.println(carsInTrafficJam);
    }
}
