package timus.task_1585;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        in.nextLine();

        int[] count = new int[3];

        for (int i = 0; i < n; i++) {
            String penguin = in.nextLine();
            switch (penguin) {
                case "Emperor Penguin":
                    count[0]++;
                    break;
                case "Little Penguin":
                    count[1]++;
                    break;
                case "Macaroni Penguin":
                    count[2]++;
                    break;
            }
        }

        if (count[0] > count[1] && count[0] > count[2]) {
            System.out.println("Emperor Penguin");
        } else if (count[1] > count[0] && count[1] > count[2]) {
            System.out.println("Little Penguin");
        } else if (count[2] > count[0] && count[2] > count[1]) {
            System.out.println("Macaroni Penguin");
        }
        out.flush();
    }
}
