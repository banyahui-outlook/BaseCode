package com.test;

import org.dom4j.*;
import org.dom4j.io.DOMReader;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;

/**
 * @Creater banyahui
 * @Date 2019/12/03 下午 17:59
 * @Description dom4j解析xml
 */
public class demo1 {
    public static void main(String[] args) {
        String path = "out/new.xml";
        createDoc(path);
        //SaxRead(path); //all
        DomRead(path);
    }

    private static void createDoc(String path) {
        Document document = DocumentHelper.createDocument();
        Element root = document.addElement("root");
        Element book = root.addElement("book");
        book.addAttribute("isPrice", "yes").addText("fly");
        try {
            FileOutputStream os = new FileOutputStream(path);
            OutputFormat of = OutputFormat.createPrettyPrint();
            of.setEncoding("utf-8");
            XMLWriter writer = new XMLWriter(os, of);
            writer.write(document);
            writer.close();
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String getXmlString() {
        return "<?xml version=\"1.0\" ?> \n" +
                "<note>\n" +
                "<to>George</to> \n" +
                "<from>John</Ffrom> \n" +
                "<heading>Reminder</heading> \n" +
                "<body>Don't forget the meeting!</body> \n" +
                "</note>\n";
    }

    private static void SaxRead(String path) {
        SAXReader reader = new SAXReader();
        Document doc = null;
        try {
            doc = reader.read(path);
            Element root = doc.getRootElement();
            Element book = root.element("book");
            String isPrice = book.attribute("isPrice").getValue();
            System.out.println("isPrice = " + isPrice);

            book.attribute("isPrice").setValue("no");
            isPrice = book.attribute("isPrice").getValue();
            System.out.println("isPrice = " + isPrice);

            OutputFormat format=OutputFormat.createPrettyPrint();
            format.setEncoding("utf-8");
            FileOutputStream fout=new FileOutputStream(path);
            XMLWriter writer=new XMLWriter(fout,format);
            writer.write(doc);
            writer.close();

        } catch (DocumentException | FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void DomRead(String path){
        DocumentBuilder documentBuilder = null;
        try {
            documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        try {
            org.w3c.dom.Document parse = documentBuilder.parse(new File(path));
            DOMReader reader=new DOMReader();
            Document document = reader.read(parse);

            Element rootElement = document.getRootElement();
            Element book = rootElement.element("book");
            String text = book.getText();
            System.out.println("text = " + text);
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
