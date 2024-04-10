package Huyen;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class CreateXML {

    public static void main(String[] args) throws Exception {
       
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        DocumentBuilder builder = factory.newDocumentBuilder();

        Document document = builder.newDocument();

        // Tạo phần tử gốc "students"
        Element rootElement = document.createElement("students");
        document.appendChild(rootElement);

       
        for (int i = 0; i < 10; i++) {
            Element studentElement = document.createElement("student");
            rootElement.appendChild(studentElement);

           
            Element nameElement = document.createElement("name");
            nameElement.appendChild(document.createTextNode("Student " + (i + 1)));
            studentElement.appendChild(nameElement);

           
            Element ageElement = document.createElement("age");
            ageElement.appendChild(document.createTextNode(String.valueOf(i + 18)));
            studentElement.appendChild(ageElement);
        }

      
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(document);
        StreamResult result = new StreamResult("kq.xml");
        transformer.transform(source, result);

        System.out.println("File XML đã được tạo thành công!");
    }
}

