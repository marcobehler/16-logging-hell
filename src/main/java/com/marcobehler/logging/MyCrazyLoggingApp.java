package com.marcobehler.logging;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

/**
 * Thanks for watching this episode! Send any feedback to info@marcobehler.com!
 */
public class MyCrazyLoggingApp {

    public static void main(String[] args) {

        MDC.put("userId","this is my user id");

        // SLF4J
        Logger logger = LoggerFactory.getLogger(MyCrazyLoggingApp.class);
        logger.info("This is my log!!!!");


        int numOfProblems = 5;
        logger.info("user ID ..... Houston, we have {} problems!",  numOfProblems);


    }
}
