package laba8.task3;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Example3 {
    public static void main(String[] args) {
        try {
            Connection.Response response = Jsoup.connect("http://fat.urfu.ru/index.html").execute();
            if (response.statusCode() == 200) {
                Document doc = response.parse();

                Elements newsParent = doc.select("body > table > tbody > tr > td > div > table > " +
                        "tbody > tr:nth-child(5) > td:nth-child(3) > table > tbody > " +
                        "tr > td:nth-child(1)");

                String filePath = "src/laba8/task3/example.txt";
                FileWriter writer = new FileWriter(filePath);

                for (int i = 3; i < 20; i++) {
                    if (!(i % 2 == 0)) {
                        List<Node> nodes = newsParent.get(0).childNodes();
                        String topic = ((Element) nodes.get(i))
                                .getElementsByClass("blocktitle")
                                .get(0).childNodes().get(0).toString();

                        String date = ((Element) nodes.get(i))
                                .getElementsByClass("blockdate")
                                .get(0).childNodes().get(0).toString();

                        writer.write("Тема: " + topic + "\n");
                        writer.write("Дата: " + date + "\n\n");
                    }
                }

                writer.close();
                System.out.println("Данные успешно записаны в: " + filePath);
            } else {
                System.out.println("Ошибка: " + response.statusCode());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}