package com.marcobehler.wealth;

import com.marcobehler.bitcoin.BitcoinService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Thanks for watching this episode! If you want to, drop me a line to info@marcobehler.com.
 */
public class WealthManagementApp {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(WealthManagementApp.class);
        logger.info("Show me the money!");

        new BitcoinService().mine();
    }
}
