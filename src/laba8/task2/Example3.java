package laba8.task2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;

public class Example3 {
    public static void main(String[] args) {
        JSONObject library = new JSONObject();
        JSONArray parking = new JSONArray();

        JSONObject place1 = new JSONObject();
        place1.put("brand", "Toyota");
        place1.put("color", "Красный");
        place1.put("number", "A123ET");
        place1.put("place", "A5");

        JSONObject place2 = new JSONObject();
        place2.put("brand", "Mazda");
        place2.put("color", "Серый");
        place2.put("number", "T568CB");
        place2.put("place", "B2");

        parking.add(place1);
        parking.add(place2);

        library.put("parking", parking);

        try (FileWriter file = new FileWriter("src/laba8/task2/example-json2.json")) {
            file.write(library.toJSONString());
            System.out.println("JSON-файл успешно создан!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
