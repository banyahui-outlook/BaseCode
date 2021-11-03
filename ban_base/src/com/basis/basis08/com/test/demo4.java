package com.test;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.monitor.FileAlterationListener;
import org.apache.commons.io.monitor.FileAlterationMonitor;
import org.apache.commons.io.monitor.FileAlterationObserver;

import java.io.File;
import java.io.FileOutputStream;

/**
 * @Creater banyahui
 * @Date 2019/12/06 下午 14:28
 * @Description FileMonitor
 */
public class demo4 {
    public static void main(String[] args) throws Exception {
        FileAlterationObserver observer = new FileAlterationObserver("out");
        observer.addListener(
                new FileAlterationListener() {
                    @Override
                    public void onStart(FileAlterationObserver fileAlterationObserver) {

                    }

                    @Override
                    public void onDirectoryCreate(File file) {

                    }

                    @Override
                    public void onDirectoryChange(File file) {

                    }

                    @Override
                    public void onDirectoryDelete(File file) {

                    }

                    @Override
                    public void onFileCreate(File file) {

                    }

                    @Override
                    public void onFileChange(File file) {
                        System.out.println(" file change... ");
                    }

                    @Override
                    public void onFileDelete(File file) {

                    }

                    @Override
                    public void onStop(FileAlterationObserver fileAlterationObserver) {

                    }
                }
        );
        FileAlterationMonitor monitor = new FileAlterationMonitor(1000, observer);
        monitor.start();

        File file = FileUtils.getFile("out/new.xml");
        FileOutputStream fileOutputStream = FileUtils.openOutputStream(file, true);
        fileOutputStream.write("nihao".getBytes());
        fileOutputStream.close();

        System.out.println(" 写入文件完毕... ");
    }
}
