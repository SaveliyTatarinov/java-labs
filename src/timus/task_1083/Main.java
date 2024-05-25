package timus.task_1083;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        int n = Integer.parseInt(parts[0]);
        int k = parts[1].length();
        int result = 1;
        for (int i = n; i > 0; i -= k) {
            result *= i;
        }
        System.out.println(result);
    }
}
