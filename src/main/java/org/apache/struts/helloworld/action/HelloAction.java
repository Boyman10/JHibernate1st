package org.apache.struts.helloworld.action;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts.helloworld.model.MessageStore;
import org.apache.struts2.convention.annotation.Action;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends ActionSupport {
	private static final long serialVersionUID = -1426967826890296347L;
	private static final Logger log = LogManager.getLogger(HelloAction.class);

	private MessageStore messageStore;

	@Action("hello")
	public String execute() {
		
		log.info("In execute method of class Hello");
		messageStore = new MessageStore();

		return SUCCESS; // At that time the matching page is being showned
	}

	public MessageStore getMessageStore() {
		return messageStore;
	}
}
