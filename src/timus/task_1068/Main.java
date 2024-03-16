package timus.task_1068;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int N = in.nextInt();
        int result = 0;

        if (N > 0) {
            for (int i = 1; i <= N; i++){
                result += i;
            }
        }
        else {
            for (int i = 1; i >= N; i--) {
                result += i;
            }
        }

        out.println(result);
        out.flush();
    }
}
