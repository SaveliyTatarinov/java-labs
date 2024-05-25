package laba7.task8;

import java.io.*;

public class Example1 {
    public static void main(String[] args) {
        Person person = new Person("Saveliy", 22);

        String directoryPath = "src/laba7/task8/";

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(directoryPath + "person.ser"))) {
            outputStream.writeObject(person);
            System.out.println("Объект успешно сериализован.");
        } catch (IOException e) {
            System.err.println("Ошибка при сериализации объекта: " + e.getMessage());
        }

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(directoryPath + "person.ser"))) {
            Person deserializedPerson = (Person) inputStream.readObject();
            System.out.println("Объект успешно десериализован.");
            System.out.println("Восстановленный объект: " + deserializedPerson);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Ошибка при десериализации объекта: " + e.getMessage());
        }
    }
}
