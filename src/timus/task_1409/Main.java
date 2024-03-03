package timus.task_1409;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int harry = in.nextInt();
        int larry = in.nextInt();

        int all = harry + larry - 1;
        int result1 = all - harry;
        int result2 = all - larry;

        out.println(result1);
        out.println(result2);
        out.flush();
    }
}
