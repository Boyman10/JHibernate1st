package org.rhm.utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Logger class to use the same property among all packages
 */
public class MyLogger {

    public static final Logger log = LogManager.getLogger();
}
