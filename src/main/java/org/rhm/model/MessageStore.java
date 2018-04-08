package org.rhm.model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MessageStore {
    private String message;
    private static final Logger log = LogManager.getLogger(MessageStore.class);
    
    public MessageStore() {
        message = "Hello Struts User";
        log.info("Success loading Message Store constructor...");
    }

    public String getMessage() {
        return message;
    }
}
