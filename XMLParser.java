/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xmlparser;
/**
 *
 * @author klbmercado
 */
public class XMLParser {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyXMLParser XMLParser = new MyXMLParser();
        XMLParser.parseXML("C:\\Users\\klbmercado\\Documents\\NetBeansProjects\\XMLParser\\foodmenu.xml", "food");
        System.out.println("----------------------------------------------------------------------------------------");
        XMLParser.parseXML("C:\\Users\\klbmercado\\Documents\\NetBeansProjects\\XMLParser\\cd_catalog.xml", "CD");
        System.out.println("----------------------------------------------------------------------------------------");
        XMLParser.parseXML("C:\\Users\\klbmercado\\Documents\\NetBeansProjects\\XMLParser\\plant_catalog.xml", "PLANT");
    }
}



