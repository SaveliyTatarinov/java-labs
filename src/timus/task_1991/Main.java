package timus.task_1991;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] boomBooms = new int[n];
        for (int i = 0; i < n; i++) {
            boomBooms[i] = scanner.nextInt();
        }

        int unusedBoomBooms = 0;
        int survivedDroids = 0;

        for (int i = 0; i < n; i++) {
            if (boomBooms[i] > k) {
                unusedBoomBooms += boomBooms[i] - k;
            } else if (boomBooms[i] < k) {
                survivedDroids += k - boomBooms[i];
            }
        }

        System.out.println(unusedBoomBooms + " " + survivedDroids);
    }
}
