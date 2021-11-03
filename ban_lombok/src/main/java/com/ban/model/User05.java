package com.ban.model;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class User05 {
    private String name;
    private Integer age;

    // 日志作用于类
    //@Log   java.util.logging.Logger.getLogger
    //@Log4j org.apache.log4j.Logger.getLogger
    //@Log4j2 org.apache.logging.log4j.LogManager.getLogger
    //@Slf4j org.slf4j.LoggerFactory.getLogger
    //@XSlf4j org.slf4j.ext.XLoggerFactory.getXLogger
    //@CommonsLog org.apache.commons.logging.LogFactory.getLog
}
