package com.marcobehler.logging;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.slf4j.LoggerFactory;

/**
 * Thanks for watching this episode! Send any feedback to info@marcobehler.com!
 */
public class MyCrazyLoggingApp {

    public static void main(String[] args) {
        // Log4J V1
        Logger log4jLogger = Logger.getLogger(MyCrazyLoggingApp.class);
        log4jLogger.info("Log4j logger speaking here!");

        // Log4J V2
        org.apache.logging.log4j.Logger log4j2Logger = LogManager.getLogger(MyCrazyLoggingApp.class);
        log4j2Logger.info("Log4j v2 logger here!!!!");

        // Java Util Logging (JUL)
        java.util.logging.Logger julLogger = java.util.logging.Logger.getLogger(MyCrazyLoggingApp.class.getName());
        julLogger.info("JUL IS IN THE HOUSE!!!");

        // Apache Commons Logging
        Log jclLog = LogFactory.getLog(MyCrazyLoggingApp.class);
        jclLog.info("GO AWAY, ALL THE WAY JCL!");


        // Slf4j + Slf4j-Simple Binding
        org.slf4j.Logger logger = LoggerFactory.getLogger(MyCrazyLoggingApp.class);
        logger.info("Slf4j to rule them all!!");

        // Slf4j + Logback? Next episode...
    }
}
