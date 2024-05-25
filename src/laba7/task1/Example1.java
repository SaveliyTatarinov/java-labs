package laba7.task1;

import java.io.File;
import java.io.IOException;

public class Example1 {
    public static void main(String[] args) {
        File folder = new File("src/laba7/task1/example_folder");
        if(!folder.exists()){
            if (folder.mkdir()){
                System.out.println("Папка создана: " + folder.getAbsolutePath());
            }
            else {
                System.out.println("Не удалось открыть папку: " + folder.getAbsolutePath());
            }
        } else {
            System.out.println("Папка уже существует: " + folder.getAbsolutePath());
        }

        File file = new File(folder.getAbsolutePath() + File.separator + "example.txt");
        try {
            if (file.createNewFile()){
                System.out.println("Файл создан: " + file.getAbsolutePath());
            } else {
                System.out.println("Не удалось создать файл: " + folder.getAbsolutePath());
            }
        } catch (IOException e){
            System.out.println("Ошибка при создания файла: " + e.getMessage());
        }

        if (file.delete()){
            System.out.println("Файл удален: " + file.getAbsolutePath());
        } else {
            System.out.println("Не удалось открыть файл" + file.getAbsolutePath());
        }
        if (folder.delete()){
            System.out.println("Папка удалена: " + folder.getAbsolutePath());
        } else {
            System.out.println("Не удалось удалить папку" + folder.getAbsolutePath());
        }
    }
}
