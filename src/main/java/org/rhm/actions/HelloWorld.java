package org.rhm.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.ParameterNameAware;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.interceptor.SessionAware;
import org.rhm.model.DataStore;
import org.rhm.services.AddDataService;
import org.rhm.utilities.MyLogger;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/**
 * Now login form to access admin interface
 * @author boy
 * @version 1.2
 */
public class HelloWorld extends ActionSupport implements ParameterNameAware, SessionAware {

	private static final long serialVersionUID = -595746838482463454L;
	private String message;

	private Map<String, Object> userSession ;
	private DataStore dataStoreBean;

	@Autowired
	private AddDataService dtService;
	/**
	 * Use this method to set the session parameter in case of successful login attempt
	 * @param session
	 */
	@Override
	public void setSession(Map<String, Object> session) {

		userSession = session ;
	}

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

		if (!dtService.matchUserData(dataStoreBean).equals(null)) {

		    userSession.put("login",dataStoreBean.getName());
		    
			return SUCCESS;

		} else {

			return INPUT;
		}
	}

	@Override
	public boolean acceptableParameterName(String parameterName) {
		boolean allowedParameterName = true ;

		if ( parameterName.contains("session")  || parameterName.contains("request") ) {
			allowedParameterName = false ;
		}

		return allowedParameterName;
	}
}