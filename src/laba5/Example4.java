package laba5;

public class Example4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            Thread thread = new NumberPrintingThread(i);
            thread.start();
        }
    }

    static class NumberPrintingThread extends Thread {
        private int number;

        public NumberPrintingThread(int number) {
            this.number = number;
        }

        @Override
        public void run() {
            System.out.println("Поток " + number + " выполняется.");
        }
    }
}
