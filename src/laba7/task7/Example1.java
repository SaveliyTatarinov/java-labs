package laba7.task7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите название файла для записи: ");
        String fileName = in.nextLine();

        String filePath = "src/laba7/task7" + File.separator + fileName + ".txt";

        System.out.print("Введите текст для записи в файл: ");
        String text = in.nextLine();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(text);
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
            return;
        }
        System.out.println("Текст успешно записан в файл.");

        System.out.println("Количество записанных символов: " + text.length());
    }
}
