package com.test;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.DirectoryFileFilter;
import org.apache.commons.io.filefilter.EmptyFileFilter;
import org.apache.commons.io.filefilter.FileFilterUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @Creater banyahui
 * @Date 2019/12/06 上午 11:20
 * @Description commons io fileutils
 */
public class demo3 {
    public static void main(String[] args) throws IOException {
        File dir = new File("out");
        File file = FileUtils.getFile(dir, "new.xml");
        if (file.exists() == false) {
            System.out.println("文件不存在...");
            return;
        }
        System.out.println("file exits...");

        String tempDirectoryPath = FileUtils.getTempDirectoryPath();
        System.out.println("tempDirectoryPath = " + tempDirectoryPath);

        Collection<File> files = FileUtils.listFiles(dir, FileFilterUtils.nameFileFilter("new.xml"), null);
        for (File file1 : files) {
            System.out.println("file1.getName() = " + file1.getName());
        }

        Collection<File> xml = FileUtils.listFiles(dir, FileFilterUtils.suffixFileFilter("xml"), null);
        var xml1 = "";
        for (File file1 : xml) {
            xml1 = file1.getAbsolutePath();
            System.out.println("file1.getName() = " + file1.getName());
        }
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("test add...");
        FileUtils.writeLines(new File(xml1), arrayList, "utf-8");

        List<String> strings = FileUtils.readLines(new File(xml1), "utf-8");
        for (String string : strings) {
            System.out.println("string = " + string);
        }

        File file2=new File(xml1);
        FileOutputStream fileOutputStream = FileUtils.openOutputStream(file2,true);
        fileOutputStream.write(12);

        strings = FileUtils.readLines(new File(xml1), "utf-8");
        for (String string : strings) {
            System.out.println("string = " + string);
        }


        Collection<File> files1 = FileUtils.listFiles(new File(""), EmptyFileFilter.EMPTY, DirectoryFileFilter.DIRECTORY);

    }
}
