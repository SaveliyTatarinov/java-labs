package timus.task_1563;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        Set<String> visited = new HashSet<>();
        int count = 0;

        for (int i = 0; i < n; i++) {
            String storeName = scanner.nextLine();
            if (!visited.contains(storeName)) {
                visited.add(storeName);
            } else {
                count++;
            }
        }

        System.out.println(count);
    }
}
