package com.marcobehler.logging.detailed;

import org.slf4j.LoggerFactory;

/**
 * Thanks for watching this episode! Send any feedback to info@marcobehler.com!
 */
public class SomeOtherClass {

    public void doIt() {
        org.slf4j.Logger logger = LoggerFactory.getLogger(SomeOtherClass.class);

        logger.error("Missing value for property  'jdbc.url'. Add propertyto application.properties/" +
                "database table/network config server");
        logger.error(" a request that was aborted and needs human intervention ASAP");
        logger.warn(" a request for customer [id={}] request [id={}] that was not serviced satisfactorily, intervention is required," +
                " but not ASAP");

        logger.info("a request that was not serviced satisfactorily, but there is no proactive support required, " +
                "requester got the information");

        logger.info("Customer [id={}] could not login: Wrong Username/Password");

        logger.debug("Advanced level of detail of internal process flow...customer registration..." +
                "step1 ...step 2...step 3...step 4..step5...");
        logger.trace("dev and test environments....");
    }
}
