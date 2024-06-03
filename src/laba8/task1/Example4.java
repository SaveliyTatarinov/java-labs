package laba8.task1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        try {
            File inputFile = new File("src/laba8/task1/example.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

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

                Element newBook = doc.createElement("book");

                Element title = doc.createElement("title");
                title.appendChild(doc.createTextNode(titleInput));
                newBook.appendChild(title);

                Element author = doc.createElement("author");
                author.appendChild(doc.createTextNode(authorInput));
                newBook.appendChild(author);

                Element year = doc.createElement("year");
                year.appendChild(doc.createTextNode(yearInput));
                newBook.appendChild(year);

                NodeList nodeList = doc.getElementsByTagName("library");
                Element rootElement = (Element) nodeList.item(0);
                rootElement.appendChild(newBook);

                TransformerFactory transformerFactory = TransformerFactory.newInstance();
                Transformer transformer = transformerFactory.newTransformer();
                DOMSource source = new DOMSource(doc);
                StreamResult result = new StreamResult(new File("src/laba8/task1/example.xml"));
                transformer.transform(source, result);

                System.out.println("Новая книга успешно добавлена в XML-файл!");
            }

            System.out.println("Хотите найти книгу? (да/нет)");
            response = in.nextLine();
            if (response.equalsIgnoreCase("да")) {
                System.out.print("Введите имя автора для поиска: ");
                String authorToSearch = in.nextLine();

                NodeList bookList = doc.getElementsByTagName("book");

                boolean found = false;
                for (int i = 0; i < bookList.getLength(); i++) {
                    Element book = (Element) bookList.item(i);
                    Element authorElement = (Element) book.getElementsByTagName("author").item(0);
                    String author = authorElement.getTextContent();

                    if (author.equalsIgnoreCase(authorToSearch)) {
                        Element titleElement = (Element) book.getElementsByTagName("title").item(0);
                        String title = titleElement.getTextContent();
                        Element yearElement = (Element) book.getElementsByTagName("year").item(0);
                        String year = yearElement.getTextContent();
                        System.out.println("Книга найдена: " + title + "\nАвтор: " + author + "\nГод издания: " + year);
                        found = true;
                    }
                }

                if (!found) {
                    System.out.println("Книга с автором " + authorToSearch + " не найдена.");
                }
            }

            System.out.println("Хотите удалить книгу? (да/нет)");
            response = in.nextLine();
            if (response.equalsIgnoreCase("да")) {
                System.out.print("Введите название книги для удаления: ");
                String titleToRemove = in.nextLine();

                NodeList bookList = doc.getElementsByTagName("book");

                for (int i = 0; i < bookList.getLength(); i++) {
                    Element book = (Element) bookList.item(i);
                    Element titleElement = (Element) book.getElementsByTagName("title").item(0);
                    String title = titleElement.getTextContent();

                    if (title.equalsIgnoreCase(titleToRemove)) {
                        book.getParentNode().removeChild(book);
                        System.out.println("Книга с названием '" + titleToRemove + "' удалена.");

                    }
                }
            }

            System.out.println("Хотите посмотреть текущее содержание файла? (да/нет)");
            response = in.nextLine();
            if (response.equalsIgnoreCase("да")) {
                System.out.println("\nТекущее содержание файла:");
                System.out.println("\nКорневой элемент: " + doc.getDocumentElement().getNodeName());
                NodeList nodeList = doc.getElementsByTagName("book");

                for (int i = 0; i < nodeList.getLength(); i++) {
                    Node node = nodeList.item(i);
                    System.out.println("\nТекущий элемент: " + node.getNodeName());
                    if (node.getNodeType() == Node.ELEMENT_NODE) {
                        Element element = (Element) node;
                        System.out.println("Название книги: " + element.getElementsByTagName("title").item(0).getTextContent());
                        System.out.println("Автор: " + element.getElementsByTagName("author").item(0).getTextContent());
                        System.out.println("Год издания: " + element.getElementsByTagName("year").item(0).getTextContent());
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
