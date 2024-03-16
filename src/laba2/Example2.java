package laba2;

public class Example2 {
    public static void main(String[] args) {
        int rows = 6;
        int cols = 7;
        int[][] array = new int[rows][cols];
        int value = 1;

        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < cols; j++) {
                    array[i][j] = value;
                    value++;
                }
            } else {
                for (int j = cols - 1; j >= 0; j--) {
                    array[i][j] = value;
                    value++;
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}