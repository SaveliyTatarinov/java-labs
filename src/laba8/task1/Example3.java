package laba8.task1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import java.io.File;

public class Example3 {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("parking");
            doc.appendChild(rootElement);

            Element floor1 = doc.createElement("floor1");
            rootElement.appendChild(floor1);

            Element brand1 = doc.createElement("brand");
            brand1.appendChild(doc.createTextNode("Toyota"));
            floor1.appendChild(brand1);

            Element color1 = doc.createElement("color");
            color1.appendChild(doc.createTextNode("Красный"));
            floor1.appendChild(color1);

            Element number1 = doc.createElement("number");
            number1.appendChild(doc.createTextNode("A123ET"));
            floor1.appendChild(number1);

            Element place1 = doc.createElement("place");
            place1.appendChild(doc.createTextNode("A5"));
            floor1.appendChild(place1);

            Element floor2 = doc.createElement("floor2");
            rootElement.appendChild(floor2);

            Element brand2 = doc.createElement("brand");
            brand2.appendChild(doc.createTextNode("Mazda"));
            floor2.appendChild(brand2);

            Element color2 = doc.createElement("color");
            color2.appendChild(doc.createTextNode("Серый"));
            floor2.appendChild(color2);

            Element number3 = doc.createElement("number");
            number3.appendChild(doc.createTextNode("T568CB"));
            floor2.appendChild(number3);

            Element place2 = doc.createElement("place");
            place2.appendChild(doc.createTextNode("B2"));
            floor2.appendChild(place2);

            doc.setXmlStandalone(true);
            doc.normalizeDocument();
            javax.xml.transform.TransformerFactory tf = javax.xml.transform.TransformerFactory.newInstance();
            javax.xml.transform.Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            javax.xml.transform.dom.DOMSource source = new javax.xml.transform.dom.DOMSource(doc);
            javax.xml.transform.stream.StreamResult result = new javax.xml.transform.stream.StreamResult(new File("src/laba8/task1/parking.xml"));
            transformer.transform(source, result);
            System.out.println("XML-файл успешно создан!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
