package com.test;

import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.ElementHandler;
import org.dom4j.ElementPath;
import org.dom4j.io.SAXReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * @Creater banyahui
 * @Date 2019/12/03 下午 18:05
 * @Description sax解析xml
 */
public class demo2 implements ElementHandler {
    SAXReader reader;
    public demo2() {
        System.out.println("demo2...");
        try {
            InputStream is = new FileInputStream("out/new.xml");
            reader = new SAXReader();
            reader.setDefaultHandler(this);
            reader.read(is);
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onStart(ElementPath elementPath) {
        //System.out.println("elementPath start..." );
    }

    @Override
    public void onEnd(ElementPath elementPath) {
        //System.out.println("elementPath end..." );
        Element current = elementPath.getCurrent();
        if(current.getName()=="book"){
            System.out.println("isPrice = " + current.attribute("isPrice").getValue());
        }
    }

    public static void main(String[] args) {
        demo2 demo2 = new demo2();
    }
}
