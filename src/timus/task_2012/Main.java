package timus.task_2012;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int f = in.nextInt();
        int all = 12;
        int time = 4*60/45;

        if ((all-f) <= time)
            out.println("YES");
        else
            out.println("NO");
        out.flush();
    }
}
