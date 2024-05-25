package timus.task_1545;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numWords = scanner.nextInt();
        ArrayList<String> words = new ArrayList<>();

        for (int i = 0; i < numWords; i++) {
            words.add(scanner.next());
        }

        String startsWith = scanner.next();

        for (String word : words) {
            if (word.startsWith(startsWith)) {
                System.out.println(word);
            }
        }
    }
}
