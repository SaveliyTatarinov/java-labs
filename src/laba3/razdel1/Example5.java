package laba3.razdel1;

public class Example5 {
    static int depth = 0;

    public static int fib(int n){
        return fibHelper(n, 0);
    }

    private static int fibHelper(int n, int currDepth) {
        String prefix = "  ".repeat(currDepth);
        System.out.println(prefix + "Выполняем fib(" + n + ")");

        depth++;

        if (n == 0){
            System.out.println(prefix + "Достигнуто базовое условие: fib(0)");
            depth--;
            return 0;
        } else if (n == 1) {
            System.out.println(prefix + "Достигнуто базовое условие: fib(1)");
            depth--;
            return 1;
        } else {
            int result = fibHelper(n - 1, currDepth + 1) + fibHelper(n - 2, currDepth + 1);
            System.out.println(prefix + "Результат fib(" + n + ") = " + result);
            depth--;
            return result;
        }
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println("Число Фибоначчи с номером " + n + ": " + fib(n));
        System.out.println("Глубина рекурсии: " + depth);
    }
}
