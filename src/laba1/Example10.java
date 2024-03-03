package laba1;

import java.util.Scanner;
import java.time.Year;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input your year of birth: ");
        int year = in.nextInt();

        int currentYear = Year.now().getValue();

        System.out.println("Your age: "+(currentYear-year));
        in.close();
    }
}
