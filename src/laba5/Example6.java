package laba5;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Example6 {
    public static void main(String[] args) {
        int[] array = generateRandomArray(1000);
        int numberOfThreads = Runtime.getRuntime().availableProcessors();
        int chunkSize = array.length / numberOfThreads;

        ExecutorService executor = Executors.newFixedThreadPool(numberOfThreads);

        int[] partialSums = new int[numberOfThreads];

        for (int i = 0; i < numberOfThreads; i++) {
            final int threadId = i;
            executor.execute(() -> {
                int start = threadId * chunkSize;
                int end = (threadId == numberOfThreads - 1) ? array.length : (threadId + 1) * chunkSize;
                int sum = 0;

                for (int j = start; j < end; j++) {
                    sum += array[j];
                }

                partialSums[threadId] = sum;
            });
        }

        executor.shutdown();
        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);

            int totalSum = 0;
            for (int value : partialSums) {
                totalSum += value;
            }

            System.out.println("Сумма элементов массива: " + totalSum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }
}
