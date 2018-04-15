package org.rhm.model;

import org.rhm.utilities.MyLogger;

public class MessageStore {
    private String message;

    public MessageStore() {
        message = "Hello Struts User";
        MyLogger.log.info("Success loading Message Store constructor...");
    }

    public String getMessage() {
        return message;
    }
}
