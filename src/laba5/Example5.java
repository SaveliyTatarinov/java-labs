package laba5;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Example5 {
    public static void main(String[] args) {
        int[] array = generateRandomArray(1000);
        int numberOfThreads = Runtime.getRuntime().availableProcessors();
        int chunkSize = array.length / numberOfThreads;

        ExecutorService executor = Executors.newFixedThreadPool(numberOfThreads);

        int[] maxValues = new int[numberOfThreads];

        for (int i = 0; i < numberOfThreads; i++) {
            final int threadId = i;
            executor.execute(() -> {
                int max = Integer.MIN_VALUE;
                int start = threadId * chunkSize;
                int end = (threadId == numberOfThreads - 1) ? array.length : (threadId + 1) * chunkSize;

                for (int j = start; j < end; j++) {
                    if (array[j] > max) {
                        max = array[j];
                    }
                }

                maxValues[threadId] = max;
            });
        }

        executor.shutdown();
        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);

            int overallMax = Integer.MIN_VALUE;
            for (int value : maxValues) {
                if (value > overallMax) {
                    overallMax = value;
                }
            }

            System.out.println("Максимальный элемент в массиве: " + overallMax);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(1000);
        }
        return array;
    }
}
