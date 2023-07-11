package com.dsw.business.models;

import java.io.Serializable;

public class TeacherData implements Serializable {

	private static final long serialVersionUID = 3L;
	
	private int IdTeacher;
	private String Dni;
	private String Name;
	private String FirstLastName;
	private String SecondLastName;
	
	private boolean Error;
	private String msgError;
	
	public TeacherData() {
		this.Error = false;
		this.msgError = "";
	}

	public TeacherData(int _IdTeacher, String _Dni, String _Name, String _FirstLastName, String _SecondLastName, boolean _Error, String _msgError) {
		
		this.IdTeacher = _IdTeacher;
		this.Dni = _Dni;
		this.Name = _Name;
		this.FirstLastName = _FirstLastName;
		this.SecondLastName = _SecondLastName;	
		this.Error = _Error;
		this.msgError = _msgError;
	}

	public int getIdStudent() {
		return IdTeacher;
	}


	public void setIdStudent(int idStudent) {
		IdTeacher = idStudent;
	}


	public String getDni() {
		return Dni;
	}


	public void setDni(String dni) {
		Dni = dni;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getFirstLastName() {
		return FirstLastName;
	}


	public void setFirstLastName(String firstLastName) {
		FirstLastName = firstLastName;
	}


	public String getSecondLastName() {
		return SecondLastName;
	}


	public void setSecondLastName(String secondLastName) {
		SecondLastName = secondLastName;
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