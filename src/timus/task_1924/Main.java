package timus.task_1924;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int N = in.nextInt();
        int result = 0;

        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                result -= i;
            } else {
                result += i;
            }
        }

        if (result % 2 ==0){
            out.println("black");
        }
        else {
            out.println("grimy");
        }
        out.flush();
    }
}
