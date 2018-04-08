package org.apache.struts.helloworld.action;

import org.apache.struts.helloworld.model.DataStore;

import com.opensymphony.xwork2.ActionSupport;

public class SendDataAction extends ActionSupport {

	private static final long serialVersionUID = -4163081726491187784L;

	private DataStore dataStoreBean;
	
	public String execute() throws Exception {
		
		dataStoreBean = new DataStore();
		//call Service class to store personBean's state in database
		return SUCCESS;
	}

	public DataStore getDataStoreBean() {
		return dataStoreBean;
	}

	public void setDataStoreBean(DataStore dataStoreBean) {
		this.dataStoreBean = dataStoreBean;
	}

	
	public void validate(){
	    if (dataStoreBean.getName().length() == 0) {
	        addFieldError("dataStoreBean.name", "Full name is required.");
	    }

	    if (dataStoreBean.getEmail().length() == 0) {
	        addFieldError("dataStoreBean.email", "Email is required.");
	    }

	    if (dataStoreBean.getAge() < 18) {
	        addFieldError("dataStoreBean.age", "Age is required and must be 18 or older");
	    }
	}

}
