package com.dsw.business.models;

import java.io.Serializable;

public class TeacherContainerData implements Serializable {

	private static final long serialVersionUID = 4L;
	
	public TeacherData[] Lista;

	private boolean Error;
	private String msgError;
	
	public TeacherContainerData() {
		this.Error = false;
		this.msgError = "";
		this.Lista = null;
	}
	
	public boolean isError() {
		return Error;
	}
	public void setError(boolean error) {
		Error = error;
	}
	public String getMsgError() {
		return msgError;
	}
	public void setMsgError(String msgError) {
		this.msgError = msgError;
	}

	
	

}