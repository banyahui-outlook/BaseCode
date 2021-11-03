package com.test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @Creater banyahui
 * @Date 2019/11/30 下午 15:48
 * @Description commons-logging 简单实现
 */
public class demo1 {
    private final static Log logger = LogFactory.getLog(demo1.class);

    public static void main(String[] args) {
        logger.info("demo1 jcl info...");
    }
}
