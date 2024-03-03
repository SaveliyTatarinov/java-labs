package laba1;

import java.util.Scanner;
import java.time.Year;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input your age: ");
        int age = in.nextInt();

        int currentYear = Year.now().getValue();
        int yearOfBirth = currentYear - age;

        System.out.println("Your year of birth: " + yearOfBirth);
        in.close();
    }
}
