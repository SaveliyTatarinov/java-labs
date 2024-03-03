package laba1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input your number: ");
        int num = in.nextInt();

        int firstNum = num - 1;
        int thirdNum = num + 1;
        int fourthNum = (int) Math.pow((firstNum + num + thirdNum), 2);

        System.out.printf("Sequence of numbers: %d, %d, %d, %d",firstNum, num, thirdNum,fourthNum);
        in.close();
    }
}
