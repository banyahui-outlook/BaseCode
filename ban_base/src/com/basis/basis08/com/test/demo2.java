package com.test;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.impl.LogFactoryImpl;

import java.io.File;
import java.io.IOException;

/**
 * @Creater banyahui
 * @Date 2019/12/06 上午 10:06
 * @Description commons io FileNameUtils
 */
public class demo2 {
    public static void main(String[] args) throws IOException {
        Log log = LogFactoryImpl.getLog(demo2.class);
        log.info("test jcl...");

        File file = new File("out/new.xml");
        boolean exists = file.exists();
        System.out.println("exists = " + exists);
        if (exists == false) {
            log.error("no file...");
            return;
        }

        System.out.println("file.getName() = " + file.getName());
        System.out.println("file.getAbsoluteFile() = " + file.getAbsoluteFile());
        System.out.println("file.getCanonicalPath() = " + file.getCanonicalPath());

        String path = file.getCanonicalPath();
        String baseName = FilenameUtils.getBaseName(path);
        System.out.println("baseName = " + baseName);

        String name = FilenameUtils.getName(path);
        System.out.println("name = " + name);

        String extension = FilenameUtils.getExtension(path);
        System.out.println("extension = " + extension);

        String fullPath = FilenameUtils.getFullPath(path);
        System.out.println("fullPath = " + fullPath);

        String fullPathNoEndSeparator = FilenameUtils.getFullPathNoEndSeparator(path);
        System.out.println("fullPathNoEndSeparator = " + fullPathNoEndSeparator);

        String prefix = FilenameUtils.getPrefix(path);
        System.out.println("prefix = " + prefix);

        String normalize = FilenameUtils.normalize(path);
        System.out.println("normalize = " + normalize);

        String s = FilenameUtils.normalizeNoEndSeparator(path);
        System.out.println("s = " + s);

        boolean xml = FilenameUtils.isExtension(path, "xml");
        System.out.println("xml = " + xml);

        boolean extension1 = FilenameUtils.isExtension(path, new String[]{"xml", "zip"});
        System.out.println("extension1 = " + extension1);

    }
}
