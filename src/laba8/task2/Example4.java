package laba8.task2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.Iterator;
import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("src/laba8/task2/example-json.json"));
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray jsonArray = (JSONArray) jsonObject.get("books");

            Scanner in = new Scanner(System.in);
            System.out.println("Хотите добавить книгу? (да/нет)");
            String response = in.nextLine();
            if (response.equalsIgnoreCase("да")) {
                System.out.print("Введите название книги: ");
                String titleInput = in.nextLine();

                System.out.print("Введите автора книги: ");
                String authorInput = in.nextLine();

                System.out.print("Введите год издания книги: ");
                String yearInput = in.nextLine();

                JSONObject newBook = new JSONObject();
                newBook.put("title", titleInput);
                newBook.put("author", authorInput);
                newBook.put("year", yearInput);
                jsonArray.add(newBook);
            }

            System.out.println("\nХотите найти книгу по автору? (да/нет)");
            response = in.nextLine();
            if (response.equalsIgnoreCase("да")) {
                System.out.print("Введите имя автора книги: ");
                String searchAuthor = in.nextLine();

                boolean bookFound = false;
                for (Object o : jsonArray) {
                    JSONObject book = (JSONObject) o;
                    if (book.get("author").equals(searchAuthor)) {
                        System.out.println("Найдена книга по автору " + searchAuthor);
                        System.out.println("Название книги: " + book.get("title"));
                        System.out.println("Год издания: " + book.get("year"));
                        bookFound = true;
                    }
                }

                if (!bookFound) {
                    System.out.println("Книга по автору " + searchAuthor + " не найдена.");
                }
            }

            System.out.println("\nХотите удалить книгу? (да/нет)");
            response = in.nextLine();
            if (response.equalsIgnoreCase("да")) {
                System.out.print("Введите название книги: ");
                String deleteTitle = in.nextLine();
                Iterator iterator = jsonArray.iterator();
                while (iterator.hasNext()) {
                    JSONObject book = (JSONObject) iterator.next();
                    if (deleteTitle.equals(book.get("title"))) {
                        iterator.remove();
                    }}
                System.out.println("Книга с названием " + deleteTitle + " удалена");
            }

            System.out.println("\nХотите посмотреть данные в файле? (да/нет)");
            response = in.nextLine();
            if (response.equalsIgnoreCase("да")) {
                System.out.println("Корневой элемент: " + jsonObject.keySet().iterator().next());
                for (Object o : jsonArray) {
                    JSONObject book = (JSONObject) o;
                    System.out.println("\nТекущий элемент: book");
                    System.out.println("Название книги: " + book.get("title"));
                    System.out.println("Автор: " + book.get("author"));
                    System.out.println("Год издания: " + book.get("year"));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
