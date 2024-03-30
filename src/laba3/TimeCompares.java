package laba3;

import java.util.*;

public class TimeCompares {
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Deque<Integer> arrayDeque = new ArrayDeque<>();

        System.out.println("Время выполнения операции добавления элемента в начало коллекции:");
        System.out.println("ArrayList: " + getAddFirstTime(arrayList));
        System.out.println("LinkedList: " + getAddFirstTime(linkedList));
        System.out.println("ArrayDeque: " + getAddFirstTimeDeque(arrayDeque));

        System.out.println("Время выполнения операции добавления элемента в конец коллекции:");
        System.out.println("ArrayList: " + getAddLastTime(arrayList));
        System.out.println("LinkedList: " + getAddLastTime(linkedList));
        System.out.println("ArrayDeque: " + getAddLastTimeDeque(arrayDeque));

        System.out.println("Время выполнения операции добавления элемента в середину коллекции:");
        System.out.println("ArrayList: " + getAddMiddleTime(arrayList));
        System.out.println("LinkedList: " + getAddMiddleTime(linkedList));
        // В ArrayDeque нет доступа по индексу, поэтому не включаем.

        System.out.println("Время выполнения операции получения элемента по индексу:");
        System.out.println("ArrayList: " + getGetElementTime(arrayList));
        System.out.println("LinkedList: " + getGetElementTime(linkedList));
        // В ArrayDeque нет доступа по индексу, поэтому не включаем.

        System.out.println("Время выполнения операции удаления элемента в начале коллекции:");
        System.out.println("ArrayList: " + getRemoveFirstTime(arrayList));
        System.out.println("LinkedList: " + getRemoveFirstTime(linkedList));
        System.out.println("ArrayDeque: " + getRemoveFirstTimeDeque(arrayDeque));

        System.out.println("Время выполнения операции удаления элемента в конце коллекции:");
        System.out.println("ArrayList: " + getRemoveLastTime(arrayList));
        System.out.println("LinkedList: " + getRemoveLastTime(linkedList));
        // В ArrayDeque нет доступа по индексу, поэтому не включаем.

        System.out.println("Время выполнения операции удаления элемента в середине коллекции:");
        System.out.println("ArrayList: " + getRemoveMiddleTime(arrayList));
        System.out.println("LinkedList: " + getRemoveMiddleTime(linkedList));
        // В ArrayDeque нет доступа по индексу, поэтому не включаем.

    }

    private static long getAddFirstTime(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 700000; i++) {
            list.add(0, i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getAddFirstTimeDeque(Deque<Integer> deque) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 700000; i++) {
            deque.addFirst(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getAddLastTime(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 700000; i++) {
            list.add(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
    private static long getAddLastTimeDeque(Deque<Integer> deque) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 700000; i++) {
            deque.add(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getAddMiddleTime(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 700000; i++) {
            list.add(list.size() / 2, i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getGetElementTime(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 700000; i++) {
            int element = list.get(list.size() / 2);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRemoveFirstTime(List<Integer> list) {
        long start = System.currentTimeMillis();
        list.subList(0, 700000).clear();

        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRemoveFirstTimeDeque(Deque<Integer> deque) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 700000; i++) {
            deque.remove(0);
        }

        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRemoveLastTime(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 700000; i++) {
            list.remove(list.size() - 1);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRemoveMiddleTime(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 700000; i++) {
            list.remove(list.size() / 2);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
}

