package Huyen;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import java.lang.*;
public class ReadXMLKQ {

    public static void main(String[] args) throws Exception {
    	
        Document kqDocument = readXML("kq.xml");

        NodeList studentList = kqDocument.getElementsByTagName("student");

       
        for (int i = 0; i < studentList.getLength(); i++) {
            Element studentElement = (Element) studentList.item(i);

           
            String name = studentElement.getElementsByTagName("name").item(0).getTextContent();
            int age = Integer.parseInt(studentElement.getElementsByTagName("age").item(0).getTextContent());
            int sumOfDigits = Integer.parseInt(studentElement.getElementsByTagName("sum").item(0).getTextContent());
            boolean isDigit = Boolean.parseBoolean(studentElement.getElementsByTagName("isDigit").item(0).getTextContent());

           
            System.out.println("Ho va ten: " + name);
            System.out.println("Tuoi: " + age);
            System.out.println("Tong so tuoi: " + sumOfDigits);
            System.out.println("La so nguyen to: " + isDigit);
            System.out.println("------------------------");
        }
    }

    private static Document readXML(String fileName) throws Exception {
        
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

       
        DocumentBuilder builder = factory.newDocumentBuilder();

        
        Document document = builder.parse(fileName);

        return document;
    }
}

