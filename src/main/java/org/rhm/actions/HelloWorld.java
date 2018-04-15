package org.rhm.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.rhm.utilities.MyLogger;

/**
 * Now login form to access admin interface
 * @author boy
 * @version 1.2
 */
public class HelloWorld extends ActionSupport {

	private static final long serialVersionUID = -595746838482463454L;
	private String message;

	public String getMessage() {
		return message;
	}

	@Action("hello-world")
	public String input() {

		MyLogger.log.info("******** In input method of class HelloWorld");

		message = "Please fill in the form to get access";

		return INPUT;
	}


	public String execute() {

		MyLogger.log.info("******* Setting up session parameter in case of success of redirect with message..." );

		return SUCCESS;
	}
}