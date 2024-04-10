package Huyen;

import java.io.File;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class StudentProcessor {

    public static void main(String[] args) {
        try {
        	File inputFile = new File("D:\\Codejava\\Gki\\src\\Huyen\\student.xml");

            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dbBuilder = dbFactory.newDocumentBuilder();
            Document doc = dbBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            NodeList studentList = doc.getElementsByTagName("student");
            for (int i = 0; i < studentList.getLength(); i++) {
                Element studentElement = (Element) studentList.item(i);

                String id = studentElement.getAttribute("id");
                String name = studentElement.getElementsByTagName("name").item(0).getTextContent();
                String address = studentElement.getElementsByTagName("address").item(0).getTextContent();
                String dateOfBirth = studentElement.getElementsByTagName("dateOfBirth").item(0).getTextContent();
                Student student = new Student(id, name, address, dateOfBirth);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
