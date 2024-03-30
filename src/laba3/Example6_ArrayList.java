package laba3;

import java.util.ArrayList;

public class Example6_ArrayList {
    public static void main(String[] args) {
        int N = 10;
        ArrayList<Integer> list = new ArrayList<>();

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
