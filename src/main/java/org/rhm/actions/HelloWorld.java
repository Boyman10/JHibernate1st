package org.rhm.actions;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorld extends ActionSupport {

	private static final long serialVersionUID = -595746838482463454L;
	private String message;

	public String getMessage() {
		return message;
	}

	public String execute() {
		message = "Hello World!";
		return SUCCESS;
	}
}