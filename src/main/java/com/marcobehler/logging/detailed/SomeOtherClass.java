package com.marcobehler.logging.detailed;

import org.slf4j.LoggerFactory;

/**
 * Thanks for watching this episode! Send any feedback to info@marcobehler.com!
 */
public class SomeOtherClass {

    public void doIt() {
        org.slf4j.Logger logger = LoggerFactory.getLogger(SomeOtherClass.class);
        logger.debug("I want to log something, too!");
    }
}
