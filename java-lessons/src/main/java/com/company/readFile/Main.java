package com.company.readFile;

/*
Вопросы:
1. В результирующем xml нет переноса по строкам. Все в одну строку.
2. разделение по новым нодам. Сейчас при втором идентичном теге он добавляет значение к первому.
*/

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.*;

public class Main {

    public static void main(String[] args) {

        BufferedReader br = null;
        FileReader fr = null;
        String xmlFilePath = "src/main/resources/test.xml";

        try {
            br = new BufferedReader(new FileReader("src/main/resources/test.txt"));
            String sCurrentLine;
            DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
            Document document = documentBuilder.newDocument();

            // root element
            Element root = document.createElement("company");
            document.appendChild(root);
            Element employees = document.createElement("employees");
            root.appendChild(employees);
            Element employee = document.createElement("employee");
            employees.appendChild(employee);
            Element name = document.createElement("name");
            employee.appendChild(name);
            Element age = document.createElement("age");
            employee.appendChild(age);
            Element city = document.createElement("city");
            employee.appendChild(city);
            Element region = document.createElement("region");
            employee.appendChild(region);


            while ((sCurrentLine = br.readLine()) != null) {
                String[] parts = sCurrentLine.split(": ");
                switch (parts[0].toString()) {
                    case "name":
                        name.appendChild(document.createTextNode(parts[1]));
                        continue;
                    case "age":
                        age.appendChild(document.createTextNode(parts[1]));
                        continue;
                    case "city":
                        city.appendChild(document.createTextNode(parts[1]));
                        continue;
                    case "region":
                        region.appendChild(document.createTextNode(parts[1]));
                        continue;
                }

//                if (parts[0].toString().equalsIgnoreCase("name")) {
//                    name.appendChild(document.createTextNode(parts[1]));
//                    Element age = document.createElement("age");
//                    employee.appendChild(age);
//                    age.appendChild(document.createTextNode(parts[1]));
//                }
            }

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource domSource = new DOMSource(document);
            StreamResult streamResult = new StreamResult(new File(xmlFilePath));

            transformer.transform(domSource, streamResult);
            System.out.println("Done creating XML File");

        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
                if (fr != null)
                    fr.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
