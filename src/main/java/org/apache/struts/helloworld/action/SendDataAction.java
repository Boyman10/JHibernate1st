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


}
