package org.rhm.actions;

import org.rhm.model.MessageStore;

import com.opensymphony.xwork2.ActionSupport;
import org.rhm.utilities.MyLogger;
import org.springframework.stereotype.Controller;

@Controller
public class Hello extends ActionSupport {
	
	private static final long serialVersionUID = -1426967826890296347L;

	private MessageStore messageStore;
	private String message;


	public String execute() {
		
		MyLogger.log.info("In execute method of class Hello");
		messageStore = new MessageStore();
		message = "Hello World, is this ok ???";
		return SUCCESS; // At that time the matching page is being showed
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
