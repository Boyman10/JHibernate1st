package org.rhm.actions;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.rhm.model.DataStore;

import com.opensymphony.xwork2.ActionSupport;

public class SendData extends ActionSupport {

	private static final long serialVersionUID = -4163081726491187784L;
	private static final Logger log = LogManager.getLogger(SendData.class);
	private DataStore dataStoreBean;
	
	@Action("senddata-input")
	public String input() {
		
        log.info("In input method of class SendDataAction");

        return INPUT;
	}
	
	public String execute() throws Exception {
		
		log.info("In execute method of class SendDataAction");
		
		//call Service class to store personBean's state in database
		return SUCCESS;
	}

	public DataStore getDataStoreBean() {
		return dataStoreBean;
	}

	public void setDataStoreBean(DataStore dataStoreBean) {
		this.dataStoreBean = dataStoreBean;
	}

	
//	public void validate(){
//	    if (dataStoreBean.getName().length() == 0) {
//	        addFieldError("dataStoreBean.name", "Full name is required.");
//	    }
//
//	    if (dataStoreBean.getEmail().length() == 0) {
//	        addFieldError("dataStoreBean.email", "Email is required.");
//	    }
//
//	    if (dataStoreBean.getAge() < 18) {
//	        addFieldError("dataStoreBean.age", "Age is required and must be 18 or older");
//	    }
//	}

}
