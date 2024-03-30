package laba3;

import java.util.LinkedList;

public class Example6_LinkedList {
    public static void main(String[] args) {
        int N = 10;
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            list.add(i);
        }

        int index = 0;
        while (list.size() > 1) {
            index = (index + 1) % list.size();
            list.remove(index);
        }

        System.out.println("Оставшийся человек в кругу: " + list.get(0));
    }
}
