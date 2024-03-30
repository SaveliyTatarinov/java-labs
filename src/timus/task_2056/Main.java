package timus.task_2056;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int totalPoints = 0;
        int triples = 0;
        int fives = 0;

        for (int i = 0; i < n; i++) {
            int grade = input.nextInt();
            totalPoints += grade;
            if (grade == 3) {
                triples++;
            } else if (grade == 5) {
                fives++;
            }
        }

        if (triples > 0) {
            System.out.println("None");
        } else if (fives == n) {
            System.out.println("Named");
        } else if ((double) totalPoints / n >= 4.5) {
            System.out.println("High");
        } else {
            System.out.println("Common");
        }
    }
}
