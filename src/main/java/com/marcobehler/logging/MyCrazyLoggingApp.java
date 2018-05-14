package com.marcobehler.logging;



import com.marcobehler.logging.detailed.SomeOtherClass;
import org.slf4j.LoggerFactory;

/**
 * Thanks for watching this episode! Send any feedback to info@marcobehler.com!
 */
public class MyCrazyLoggingApp {

    public static void main(String[] args) throws InterruptedException {

        while (true) {
            Thread.sleep(250);
            // Slf4j + Log4jV2
            org.slf4j.Logger logger = LoggerFactory.getLogger(MyCrazyLoggingApp.class);
            logger.info("Hey, this is Log4J - V2!");

            new SomeOtherClass().doIt();
        }

    }
}
