package laba7.task4;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Example1 {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("src/laba7/task4/input.txt");
        FileWriter writer = new FileWriter("src/laba7/task4/output.txt");
        int c;
        while ((c = reader.read()) != -1) {
            writer.write(c);
        }
        reader.close();
        writer.close();
        System.out.println("Файл скопирован успешно!");
    }
}
