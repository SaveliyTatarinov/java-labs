package laba1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input weekday: ");
        String weekday = in.nextLine();

        System.out.println("Input month: ");
        String month = in.nextLine();

        System.out.println("Input day: ");
        int day = in.nextInt();

        System.out.printf("Today: %s, %d, %s", weekday, day, month);
        in.close();
    }
}
