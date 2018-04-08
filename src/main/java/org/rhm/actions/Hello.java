package org.rhm.actions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.rhm.model.MessageStore;

import com.opensymphony.xwork2.ActionSupport;


public class Hello extends ActionSupport {
	
	private static final long serialVersionUID = -1426967826890296347L;
	private static final Logger log = LogManager.getLogger(Hello.class);

	private MessageStore messageStore;
	private String message;


	public String execute() {
		
		log.info("In execute method of class Hello");
		//messageStore = new MessageStore();
		message = "Hello World, is this ok ???";
		return SUCCESS; // At that time the matching page is being showned
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public MessageStore getMessageStore() {
		return messageStore;
	}
}
