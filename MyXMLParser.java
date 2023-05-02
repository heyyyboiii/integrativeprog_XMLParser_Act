/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xmlparser;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;
/**
 *
 * @author klbmercado
 */
public class MyXMLParser {

    private String fileName;
    private String tagName;
    
    public void parseXML(String fileName, String tagName){
        this.fileName = fileName;
        this.tagName = tagName;
        try{
            // Create a new file object that will read the path of the xml file
            File inputFile = new File(fileName); 
            // This code will create a document builder factory and document builder
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance(); 
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            // This code will parse the xml file
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            // This line will get all the nodes of the given parent tag
            NodeList nList = doc.getElementsByTagName(tagName);
            // Loops the xml file of the parent tags
            for(int temp = 0; temp < nList.getLength(); temp++){
                Node nNode = nList.item(temp);
                if(nNode.getNodeType() == Node.ELEMENT_NODE){
                    Element eElement = (Element) nNode;
                    NodeList childNodes = eElement.getChildNodes();
                    //Loops the xml file of all the child tags
                    for (int i = 0; i < childNodes.getLength(); i++) {
                        Node childNode = childNodes.item(i);
                        if (childNode.getNodeType() == Node.ELEMENT_NODE) {
                            //Prints the output
                            System.out.print(childNode.getTextContent() + "\t ");
                        }
                    }
                    //Separator
                    System.out.println();
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    } 
}
