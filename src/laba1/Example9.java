package laba1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input month: ");
        String month = in.nextLine();

        System.out.println("Input numbers of days: ");
        int days = in.nextInt();

        System.out.printf("There are %d days in %s", days, month);
        in.close();
    }
}
