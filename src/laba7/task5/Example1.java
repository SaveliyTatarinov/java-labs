package laba7.task5;

import java.io.File;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите название файла: ");
        String fileName = in.nextLine();

        String pathFile = "src/laba7/task5" + File.separator + fileName + ".txt";

        File file = new File(pathFile);
        if (file.exists()) {
            long fileSize = file.length();
            System.out.println("Размер файла " + fileName + " равен " + fileSize + " байта");
        } else {
            System.out.println("Файл не найден.");
        }
    }
}
